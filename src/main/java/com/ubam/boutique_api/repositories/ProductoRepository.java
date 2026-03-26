package com.ubam.boutique_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubam.boutique_api.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto , Integer>{
    
}
