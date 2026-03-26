package com.ubam.boutique_api.dtos.productos;

import java.math.BigDecimal;
import java.util.List;

import com.ubam.boutique_api.entities.ImagenProducto;
import com.ubam.boutique_api.entities.VarianteProducto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO {
    Integer productoId;
    String nombre;
    String descripcion;
    BigDecimal precio;
    String marca;
    List<VarianteProducto> variantes;
    List<ImagenProducto> imagenes;
}
