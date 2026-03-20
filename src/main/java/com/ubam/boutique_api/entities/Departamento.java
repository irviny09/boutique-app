package com.ubam.boutique_api.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
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
@Table(name = "tbl_cat_departamentos")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DepartamentoId")
    private Integer departamentoId;

    @Column(name = "Departamento_Nombre", length = 45)
    private String nombre;

    @JsonManagedReference("departamento-tipos")
    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<Tipo> tipos;
}
