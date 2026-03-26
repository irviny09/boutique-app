package com.ubam.boutique_api.entities;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_ope_credenciales")
public class Credencial implements UserDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CredencialId")
    private Integer credencialId;

    @Column(name = "Credencial_Email", length = 45)
    private String email;

    @Column(name = "Credencial_PasswordHash", length = 200)
    private String passwordHash;

    @Column(name = "Credencial_Estado")
    private Byte estado;

    @JsonBackReference("usuario-credencial")
    @OneToOne
    @JoinColumn(name = "Credencial_UsuarioId", referencedColumnName = "UsuarioId")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "Credencial_RolId", referencedColumnName = "RolId")
    private Rol rol;

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword() {
        return passwordHash;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_" + rol.getNombre()));
    }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() { return true; }

    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public boolean isEnabled() {
        return estado != null && estado == 1; 
    }
}