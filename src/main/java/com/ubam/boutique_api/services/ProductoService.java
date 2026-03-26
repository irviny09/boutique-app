package com.ubam.boutique_api.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ubam.boutique_api.dtos.productos.ProductoDTO;
import com.ubam.boutique_api.dtos.productos.ProductosDTO;
import com.ubam.boutique_api.entities.ImagenProducto;
import com.ubam.boutique_api.entities.Producto;
import com.ubam.boutique_api.repositories.ProductoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository productoRepository;

    public List<ProductosDTO> getRopas(){
        List<Producto> productos = productoRepository.findAll();
        return productos.stream().map(producto -> ProductosDTO.builder()
            .productoId(producto.getProductoId())
            .nombre(producto.getNombre())
            .descripcion(producto.getDescripcion())
            .precio(producto.getPrecio())
            .tipo(producto.getTipo().getNombre())
            .marca(producto.getMarca().getNombre())
            .imagen(isPrincipal(producto.getImagenes()))
            .build()).collect(Collectors.toList());
    }

    public String isPrincipal(List<ImagenProducto> imagenProducto){
        String estaEs = "";
        for (var imagen : imagenProducto) {
            estaEs += (imagen.getEsPrincipal() == 1 ? imagen.getImagenURL() : "");
        }
        return estaEs;
    }

    public ProductoDTO getProductoById(Integer productoId){
        Producto producto = productoRepository.findById(productoId).orElseThrow(() -> new RuntimeException("Producto not found"));
        return ProductoDTO.builder()
                .productoId(producto.getProductoId())
                .nombre(producto.getNombre())
                .descripcion(producto.getDescripcion())
                .precio(producto.getPrecio())
                .marca(producto.getMarca().getNombre())
                .variantes(producto.getVariantes())
                .imagenes(producto.getImagenes())
                .build();
    }


}
