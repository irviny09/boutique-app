package com.ubam.boutique_api.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_ope_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UsuarioId")
    private Integer usuarioId;

    @Column(name = "Usuario_Nombre", length = 45)
    private String nombre;

    @Column(name = "Usuario_Apellidos", length = 100)
    private String apellidos;

    @Column(name = "Usuario_Telefono", length = 45)
    private String telefono;

    @Column(name = "Usuario_Talla", length = 45)
    private String talla;

    @JsonManagedReference("usuario-credencial")
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Credencial credencial;

    @JsonManagedReference("usuario-carrito")
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Carrito> carrito;

    @JsonManagedReference("usuario-wishlist")
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Wishlist> wishlist;

    @JsonManagedReference("usuario-direcciones")
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Direccion> direcciones;

    @JsonManagedReference("usuario-ventas")
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Venta> ventas;
}
