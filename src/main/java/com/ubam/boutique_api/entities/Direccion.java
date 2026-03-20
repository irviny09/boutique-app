package com.ubam.boutique_api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_rel_direcciones")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DireccionId")
    private Integer direccionId;

    @Column(name = "Direccion_Calle", length = 45)
    private String calle;

    @Column(name = "Direccion_NumExt", length = 15)
    private String numExt;

    @Column(name = "Direccion_NumInt", length = 15)
    private String numInt;

    @Column(name = "Direccion_Colonia", length = 45)
    private String colonia;

    @Column(name = "Direccion_CP", length = 5)
    private String cp;

    @Column(name = "Direccion_Municipio", length = 45)
    private String municipio;

    @Column(name = "Direccion_Estado", length = 45)
    private String estado;

    @Column(name = "Direccion_EsPrincipal")
    private Byte esPrincipal;

    @JsonBackReference("usuario-direcciones")
    @ManyToOne
    @JoinColumn(name = "Direccion_UsuarioId", referencedColumnName = "UsuarioId")
    private Usuario usuario;
}
