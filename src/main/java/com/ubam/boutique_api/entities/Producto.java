package com.ubam.boutique_api.entities;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "tbl_ope_productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductoId")
    private Integer productoId;

    @Column(name = "Producto_Nombre", length = 45)
    private String nombre;

    @Column(name = "Producto_Descripcion", length = 45)
    private String descripcion;

    @Column(name = "Producto_Precio", precision = 10, scale = 2)
    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name = "Producto_TipoId", referencedColumnName = "TipoId")
    private Tipo tipo;

    // Corregido: MarcaId es INT FK a tbl_cat_marcas
    @ManyToOne
    @JoinColumn(name = "Producto_MarcaId", referencedColumnName = "MarcaId")
    private Marca marca;

    @JsonManagedReference("producto-variantes")
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<VarianteProducto> variantes;

    @JsonManagedReference("producto-imagenes")
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<ImagenProducto> imagenes;

    @JsonIgnore
    @OneToMany(mappedBy = "producto")
    private List<Wishlist> wishlists;
}