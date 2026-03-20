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
@Table(name = "tbl_rel_wishlist")
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WishlistId")
    private Integer wishlistId;

    @JsonBackReference("usuario-wishlist")
    @ManyToOne
    @JoinColumn(name = "Wishlist_UsuarioId", referencedColumnName = "UsuarioId")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "Wishlist_ProductoId", referencedColumnName = "ProductoId")
    private Producto producto;
}
