package com.ubam.boutique_api.entities;

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
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_ope_credenciales")
public class Credencial {

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
}