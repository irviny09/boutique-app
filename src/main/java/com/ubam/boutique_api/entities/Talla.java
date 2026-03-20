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
@Table(name = "tbl_cat_tallas")
public class Talla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TallaId")
    private Integer tallaId;

    @Column(name = "Talla_Nombre", length = 15)
    private String nombre;

    @Column(name = "Talla_Categoria", length = 45)
    private String categoria;

    @JsonIgnore
    @OneToMany(mappedBy = "talla")
    private List<VarianteProducto> variantes;
}
