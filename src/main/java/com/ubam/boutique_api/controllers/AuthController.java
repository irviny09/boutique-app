package com.ubam.boutique_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubam.boutique_api.dtos.auth.TokenDTO;
import com.ubam.boutique_api.dtos.auth.LoginDTO;
import com.ubam.boutique_api.dtos.auth.RegisterDTO;
import com.ubam.boutique_api.services.AuthService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(value = "login")
    public ResponseEntity<TokenDTO> login(@RequestBody LoginDTO request){
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value = "register")
    public ResponseEntity<TokenDTO> register(@RequestBody RegisterDTO request){
        return ResponseEntity.ok(authService.register(request));
    }
}
