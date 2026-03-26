package com.ubam.boutique_api.services;


import org.springframework.boot.security.autoconfigure.SecurityProperties.User;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ubam.boutique_api.dtos.auth.LoginDTO;
import com.ubam.boutique_api.dtos.auth.RegisterDTO;
import com.ubam.boutique_api.dtos.auth.TokenDTO;
import com.ubam.boutique_api.entities.Credencial;
import com.ubam.boutique_api.entities.Rol;
import com.ubam.boutique_api.entities.Usuario;
import com.ubam.boutique_api.jwt.JwtService;
import com.ubam.boutique_api.repositories.CredencialRepository;
import com.ubam.boutique_api.repositories.RoleRepository;
import com.ubam.boutique_api.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final CredencialRepository credencialRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public TokenDTO login(LoginDTO request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        Credencial credencial = credencialRepository.findByEmail(request.getUsername())
            .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        String token = jwtService.getToken(credencial);
        return TokenDTO.builder()
            .token(token)
            .build();
    }

    public TokenDTO register(RegisterDTO request) {
        Usuario usuario = Usuario.builder()
                        .nombre(request.getNombre())
                        .apellidos(request.getApell())
                        .telefono(request.getTelefono())
                        .talla(null)
                        .build();
        userRepository.save(usuario);
        Credencial credencial = Credencial.builder()
                        .email(request.getEmail())
                        .passwordHash(passwordEncoder.encode(request.getPassword()))
                        .estado(Byte.valueOf("0"))
                        .usuario(usuario)
                        .rol(roleRepository.findById(1).orElseThrow(() -> new RuntimeException("Role not found")))
                        .build();
        credencialRepository.save(credencial);
        
        return TokenDTO.builder()
                .token(jwtService.getToken(credencial))
                .build();
    }

}
