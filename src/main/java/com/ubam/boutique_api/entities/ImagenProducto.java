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
@Table(name = "tbl_rel_imagenes")
public class ImagenProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ImagenId")
    private Integer imagenId;

    // Corregido: nombre exacto del SQL es "ImagenURL"
    @Column(name = "ImagenURL", length = 200)
    private String imagenURL;

    @Column(name = "Imagen_EsPrincipal")
    private Byte esPrincipal;

    @JsonBackReference("producto-imagenes")
    @ManyToOne
    @JoinColumn(name = "Imagen_ProductoId", referencedColumnName = "ProductoId")
    private Producto producto;
}
