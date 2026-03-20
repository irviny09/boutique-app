package com.ubam.boutique_api.entities;

import java.math.BigDecimal;

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
@Table(name = "tbl_rel_detalleVentas")
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DetalleId")
    private Integer detalleId;

    @Column(name = "Detalle_Cantidad")
    private Integer cantidad;

    // Corregido: nombre exacto del SQL es "Detalle_PrecioUnit"
    @Column(name = "Detalle_PrecioUnit", precision = 10, scale = 2)
    private BigDecimal precioUnit;

    @JsonBackReference("venta-detalles")
    @ManyToOne
    @JoinColumn(name = "Detalle_VentaId", referencedColumnName = "VentaId")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "Detalle_VarianteId", referencedColumnName = "VarianteProdId")
    private VarianteProducto variante;
}
