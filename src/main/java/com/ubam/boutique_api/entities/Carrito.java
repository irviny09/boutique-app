package com.ubam.boutique_api.entities;

import java.time.LocalDate;

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
@Table(name = "tbl_rel_carrito")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CarritoId")
    private Integer carritoId;

    @Column(name = "Carrito_Cantidad")
    private Integer cantidad;

    @Column(name = "Carrito_FechaAgregado")
    private LocalDate fechaAgregado;

    @JsonBackReference("usuario-carrito")
    @ManyToOne
    @JoinColumn(name = "Carrito_UsuarioId", referencedColumnName = "UsuarioId")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "Carrito_VarianteId", referencedColumnName = "VarianteProdId")
    private VarianteProducto variante;
}
