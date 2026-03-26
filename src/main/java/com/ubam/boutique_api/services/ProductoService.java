package com.ubam.boutique_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ubam.boutique_api.entities.Producto;
import com.ubam.boutique_api.repositories.ProductoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository productoRepository;

    public List<Producto> getRopas(){
        List<Producto> productos = productoRepository.findAll();
        return productos;
    }
}
