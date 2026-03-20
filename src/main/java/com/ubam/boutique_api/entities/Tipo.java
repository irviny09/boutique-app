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
@Table(name = "tbl_cat_tipos")
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TipoId")
    private Integer tipoId;

    @Column(name = "Tipo_Nombre", length = 45)
    private String nombre;

    @JsonBackReference("departamento-tipos")
    @ManyToOne
    @JoinColumn(name = "Tipo_DepartamentoId", referencedColumnName = "DepartamentoId")
    private Departamento departamento;

    @JsonIgnore
    @OneToMany(mappedBy = "tipo")
    private List<Producto> productos;
}
