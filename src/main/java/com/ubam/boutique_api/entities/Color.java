package com.ubam.boutique_api.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_cat_colores")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ColorId")
    private Integer colorId;

    @Column(name = "Color_Nombre", length = 45)
    private String nombre;

    @Column(name = "Color_Hexa", length = 7)
    private String hexa;

    @JsonIgnore
    @OneToMany(mappedBy = "color")
    private List<VarianteProducto> variantes;
}
