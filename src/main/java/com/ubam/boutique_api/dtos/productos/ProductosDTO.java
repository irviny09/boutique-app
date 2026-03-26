package com.ubam.boutique_api.dtos.productos;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductosDTO {
    String nombre;
    String descripcion;
    BigDecimal precio;
    
} 
