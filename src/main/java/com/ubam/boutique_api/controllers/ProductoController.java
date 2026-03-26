package com.ubam.boutique_api.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubam.boutique_api.dtos.productos.ProductoDTO;
import com.ubam.boutique_api.dtos.productos.ProductosDTO;
import com.ubam.boutique_api.services.ProductoService;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductoController {

    private final ProductoService productoService;

    @GetMapping("/ropaAll")
    public ResponseEntity<List<ProductosDTO>> getProductos(){
        return ResponseEntity.ok(productoService.getRopas());
    }

    @GetMapping("/producto/{id}")
    public ResponseEntity<ProductoDTO> getRopaBuId(@PathVariable int id) {
        return ResponseEntity.ok(productoService.getProductoById(id));
    }
    
}
