package com.ubam.boutique_api.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
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
@Table(name = "tbl_ope_ventas")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VentaId")
    private Integer ventaId;

    @Column(name = "Venta_Fecha")
    private LocalDate fecha;

    @Column(name = "Venta_Total", precision = 10, scale = 2)
    private BigDecimal total;

    @Column(name = "Venta_MetodoPago", length = 45)
    private String metodoPago;

    // Corregido: NOT NULL en el SQL
    @Column(name = "Venta_TransaccionId", length = 100, nullable = false)
    private String transaccionId;

    @Column(name = "Venta_Estado", length = 45)
    private String estado;

    @JsonBackReference("usuario-ventas")
    @ManyToOne
    @JoinColumn(name = "Venta_UsuarioId", referencedColumnName = "UsuarioId")
    private Usuario usuario;

    @JsonManagedReference("venta-detalles")
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private List<DetalleVenta> detalles;
}
