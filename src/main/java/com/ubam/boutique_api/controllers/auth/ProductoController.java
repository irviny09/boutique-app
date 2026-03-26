package com.ubam.boutique_api.controllers.auth;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubam.boutique_api.entities.Producto;
import com.ubam.boutique_api.services.ProductoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductoController {

    private final ProductoService productoService;

    @GetMapping("/ropaAll")
    public ResponseEntity<List<Producto>> getProductos(){
        return ResponseEntity.ok(productoService.getRopas());
    }
}
