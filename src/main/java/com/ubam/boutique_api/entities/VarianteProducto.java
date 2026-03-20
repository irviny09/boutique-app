package com.ubam.boutique_api.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_ope_variantesProd")
public class VarianteProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VarianteProdId")
    private Integer varianteProdId;

    @Column(name = "Variante_SKU", length = 100, unique = true)
    private String sku;

    @Column(name = "Variante_Stock")
    private Integer stock;

    @JsonBackReference("producto-variantes")
    @ManyToOne
    @JoinColumn(name = "Variante_ProductoId", referencedColumnName = "ProductoId")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "Variante_TallaId", referencedColumnName = "TallaId")
    private Talla talla;

    // Corregido: NOT NULL en el SQL
    @ManyToOne
    @JoinColumn(name = "Variante_ColorId", referencedColumnName = "ColorId", nullable = false)
    private Color color;

    @JsonIgnore
    @OneToMany(mappedBy = "variante")
    private List<Carrito> carritos;

    @JsonIgnore
    @OneToMany(mappedBy = "variante")
    private List<DetalleVenta> detalles;
}