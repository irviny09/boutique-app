CREATE DATABASE  IF NOT EXISTS `db_boutique` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_boutique`;
-- MySQL dump 10.13  Distrib 8.0.31, for macos12 (x86_64)
--
-- Host: 127.0.0.1    Database: db_boutique
-- ------------------------------------------------------
-- Server version	9.6.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ '2a366d86-1a94-11f1-886d-0efed0190cf0:1-364';

--
-- Table structure for table `tbl_cat_colores`
--

DROP TABLE IF EXISTS `tbl_cat_colores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_colores` (
  `ColorId` int NOT NULL AUTO_INCREMENT,
  `Color_Nombre` varchar(45) DEFAULT NULL,
  `Color_Hexa` char(7) DEFAULT NULL,
  PRIMARY KEY (`ColorId`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_colores`
--

LOCK TABLES `tbl_cat_colores` WRITE;
/*!40000 ALTER TABLE `tbl_cat_colores` DISABLE KEYS */;
INSERT INTO `tbl_cat_colores` VALUES (1,'Negro','#000000'),(2,'Blanco','#FFFFFF'),(3,'Rojo Pasión','#FF0000'),(4,'Azul Marino','#000080'),(5,'Palo de Rosa','#D6A2AD'),(6,'Negro','#000000'),(7,'Blanco','#FFFFFF'),(8,'Rojo Pasión','#FF0000'),(9,'Azul Marino','#000080'),(10,'Palo de Rosa','#D6A2AD'),(11,'Negro Absoluto','#000000'),(12,'Blanco Nieve','#FFFFFF'),(13,'Rojo Pasión','#FF0000'),(14,'Azul Marino','#000080'),(15,'Gris Oxford','#373737'),(16,'Beige Arena','#F5F5DC'),(17,'Verde Esmeralda','#50C878'),(18,'Rosa Pastel','#FFD1DC'),(19,'Vino / Tinto','#722F37'),(20,'Mostaza','#E1AD01'),(21,'Azul Cielo','#87CEEB'),(22,'Verde Olivo','#556B2F'),(23,'Café Tabaco','#3E2723'),(24,'Lila','#C8A2C8'),(25,'Dorado','#D4AF37');
/*!40000 ALTER TABLE `tbl_cat_colores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_departamentos`
--

DROP TABLE IF EXISTS `tbl_cat_departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_departamentos` (
  `DepartamentoId` int NOT NULL AUTO_INCREMENT,
  `Departamento_Nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`DepartamentoId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_departamentos`
--

LOCK TABLES `tbl_cat_departamentos` WRITE;
/*!40000 ALTER TABLE `tbl_cat_departamentos` DISABLE KEYS */;
INSERT INTO `tbl_cat_departamentos` VALUES (1,'Damas'),(2,'Caballeros'),(3,'Niños'),(4,'Accesorios');
/*!40000 ALTER TABLE `tbl_cat_departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_marcas`
--

DROP TABLE IF EXISTS `tbl_cat_marcas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_marcas` (
  `MarcaId` int NOT NULL AUTO_INCREMENT,
  `Marca_Nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`MarcaId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_marcas`
--

LOCK TABLES `tbl_cat_marcas` WRITE;
/*!40000 ALTER TABLE `tbl_cat_marcas` DISABLE KEYS */;
INSERT INTO `tbl_cat_marcas` VALUES (1,'Zara'),(2,'Levi\'s'),(3,'Nike'),(4,'Adidas'),(5,'Genérica');
/*!40000 ALTER TABLE `tbl_cat_marcas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_roles`
--

DROP TABLE IF EXISTS `tbl_cat_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_roles` (
  `RolId` int NOT NULL AUTO_INCREMENT,
  `Rol_Nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`RolId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_roles`
--

LOCK TABLES `tbl_cat_roles` WRITE;
/*!40000 ALTER TABLE `tbl_cat_roles` DISABLE KEYS */;
INSERT INTO `tbl_cat_roles` VALUES (1,'Administrador'),(2,'Vendedor'),(3,'Cliente');
/*!40000 ALTER TABLE `tbl_cat_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_tallas`
--

DROP TABLE IF EXISTS `tbl_cat_tallas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_tallas` (
  `TallaId` int NOT NULL AUTO_INCREMENT,
  `Talla_Nombre` varchar(15) DEFAULT NULL,
  `Talla_Categoria` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TallaId`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_tallas`
--

LOCK TABLES `tbl_cat_tallas` WRITE;
/*!40000 ALTER TABLE `tbl_cat_tallas` DISABLE KEYS */;
INSERT INTO `tbl_cat_tallas` VALUES (1,'XSS','Ropa Adulto'),(2,'XS','Ropa Adulto'),(3,'S','Ropa Adulto'),(4,'M','Ropa Adulto'),(5,'L','Ropa Adulto'),(6,'XL','Ropa Adulto'),(7,'XXL','Ropa Adulto'),(8,'28','Pantalones'),(9,'30','Pantalones'),(10,'32','Pantalones'),(11,'34','Pantalones'),(12,'36','Pantalones'),(13,'23 MX','Calzado'),(14,'24 MX','Calzado'),(15,'25 MX','Calzado'),(16,'26 MX','Calzado'),(17,'27 MX','Calzado'),(18,'28 MX','Calzado'),(19,'0-3M','Bebés'),(20,'6-12M','Bebés'),(21,'2T','Niños'),(22,'4T','Niños'),(23,'6T','Niños');
/*!40000 ALTER TABLE `tbl_cat_tallas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_tipos`
--

DROP TABLE IF EXISTS `tbl_cat_tipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_tipos` (
  `TipoId` int NOT NULL AUTO_INCREMENT,
  `Tipo_DepartamentoId` int DEFAULT NULL,
  `Tipo_Nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TipoId`),
  KEY `DepartamentoId_idx` (`Tipo_DepartamentoId`),
  CONSTRAINT `DepartamentoId` FOREIGN KEY (`Tipo_DepartamentoId`) REFERENCES `tbl_cat_departamentos` (`DepartamentoId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_tipos`
--

LOCK TABLES `tbl_cat_tipos` WRITE;
/*!40000 ALTER TABLE `tbl_cat_tipos` DISABLE KEYS */;
INSERT INTO `tbl_cat_tipos` VALUES (1,1,'Blusas'),(2,1,'Vestidos'),(3,1,'Faldas'),(4,2,'Camisas'),(5,2,'Pantalones'),(6,2,'Chamarras'),(7,3,'Conjuntos'),(8,4,'Bolsos'),(9,4,'Cinturones'),(10,1,'Jeans');
/*!40000 ALTER TABLE `tbl_cat_tipos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_ope_credenciales`
--

DROP TABLE IF EXISTS `tbl_ope_credenciales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_ope_credenciales` (
  `CredencialId` int NOT NULL AUTO_INCREMENT,
  `Credencial_UsuarioId` int DEFAULT NULL,
  `Credencial_Email` varchar(45) DEFAULT NULL,
  `Credencial_PasswordHash` varchar(200) DEFAULT NULL,
  `Credencial_RolId` int DEFAULT NULL,
  `Credencial_Estado` tinyint DEFAULT NULL,
  PRIMARY KEY (`CredencialId`),
  KEY `UsuarioId_idx` (`Credencial_UsuarioId`),
  KEY `RolId_idx` (`Credencial_RolId`),
  CONSTRAINT `RolId` FOREIGN KEY (`Credencial_RolId`) REFERENCES `tbl_cat_roles` (`RolId`),
  CONSTRAINT `UsuarioId` FOREIGN KEY (`Credencial_UsuarioId`) REFERENCES `tbl_ope_usuarios` (`UsuarioId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_ope_credenciales`
--

LOCK TABLES `tbl_ope_credenciales` WRITE;
/*!40000 ALTER TABLE `tbl_ope_credenciales` DISABLE KEYS */;
INSERT INTO `tbl_ope_credenciales` VALUES (1,1,'irvin@irvin.com','$2a$10$/.8gl2.RJ4mhZ1tvplZPHunACf8fqSYBNDRxEjWJMrBY1JpemA7Ke',3,1);
/*!40000 ALTER TABLE `tbl_ope_credenciales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_ope_productos`
--

DROP TABLE IF EXISTS `tbl_ope_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_ope_productos` (
  `ProductoId` int NOT NULL,
  `Producto_Nombre` varchar(45) DEFAULT NULL,
  `Producto_Descripcion` text CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci,
  `Producto_Precio` decimal(10,2) DEFAULT NULL,
  `Producto_TipoId` int DEFAULT NULL,
  `Producto_MarcaId` int DEFAULT NULL,
  PRIMARY KEY (`ProductoId`),
  KEY `TipoId_idx` (`Producto_TipoId`),
  KEY `MarcaId_idx` (`Producto_MarcaId`),
  CONSTRAINT `MarcaId` FOREIGN KEY (`Producto_MarcaId`) REFERENCES `tbl_cat_marcas` (`MarcaId`),
  CONSTRAINT `TipoId` FOREIGN KEY (`Producto_TipoId`) REFERENCES `tbl_cat_tipos` (`TipoId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_ope_productos`
--

LOCK TABLES `tbl_ope_productos` WRITE;
/*!40000 ALTER TABLE `tbl_ope_productos` DISABLE KEYS */;
INSERT INTO `tbl_ope_productos` VALUES (1,'Vestido Midi Floral','Vestido de corte campestre con estampado de flores',700.00,2,1),(2,'Camisa Oxford Premium','Camisa de algodón 100% corte regular fit',300.00,4,3),(3,'Jeans Skinny High Rise','Pantalón de mezclilla con elastano',350.00,10,2);
/*!40000 ALTER TABLE `tbl_ope_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_ope_usuarios`
--

DROP TABLE IF EXISTS `tbl_ope_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_ope_usuarios` (
  `UsuarioId` int NOT NULL AUTO_INCREMENT,
  `Usuario_Nombre` varchar(45) DEFAULT NULL,
  `Usuario_Apellidos` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `Usuario_Telefono` varchar(45) DEFAULT NULL,
  `Usuario_Talla` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`UsuarioId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_ope_usuarios`
--

LOCK TABLES `tbl_ope_usuarios` WRITE;
/*!40000 ALTER TABLE `tbl_ope_usuarios` DISABLE KEYS */;
INSERT INTO `tbl_ope_usuarios` VALUES (1,'irvin','marquez islas','7297062104',NULL);
/*!40000 ALTER TABLE `tbl_ope_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_ope_variantesProd`
--

DROP TABLE IF EXISTS `tbl_ope_variantesProd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_ope_variantesProd` (
  `VarianteProdId` int NOT NULL,
  `Variante_ProductoId` int DEFAULT NULL,
  `Variante_TallaId` int DEFAULT NULL,
  `Variante_ColorId` int NOT NULL,
  `Variante_SKU` varchar(100) DEFAULT NULL,
  `Variante_Stock` int DEFAULT NULL,
  PRIMARY KEY (`VarianteProdId`),
  UNIQUE KEY `Variante_SKU_UNIQUE` (`Variante_SKU`),
  KEY `ProductoId_idx` (`Variante_ProductoId`),
  KEY `TallaId_idx` (`Variante_TallaId`),
  KEY `ColoresId_idx` (`Variante_ColorId`),
  CONSTRAINT `ColoresId` FOREIGN KEY (`Variante_ColorId`) REFERENCES `tbl_cat_colores` (`ColorId`),
  CONSTRAINT `fk_variantes_tallas` FOREIGN KEY (`Variante_TallaId`) REFERENCES `tbl_cat_tallas` (`TallaId`),
  CONSTRAINT `ProductoId` FOREIGN KEY (`Variante_ProductoId`) REFERENCES `tbl_ope_productos` (`ProductoId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_ope_variantesProd`
--

LOCK TABLES `tbl_ope_variantesProd` WRITE;
/*!40000 ALTER TABLE `tbl_ope_variantesProd` DISABLE KEYS */;
INSERT INTO `tbl_ope_variantesProd` VALUES (1,1,3,8,'VES-FLOR-S-ROS',15),(2,1,4,8,'VES-FLOR-M-ROS',20),(3,1,5,14,'VES-FLOR-L-LIL',10),(4,2,4,2,'CAM-OXF-M-BLA',25),(5,2,5,2,'CAM-OXF-L-BLA',25),(6,2,6,11,'CAM-OXF-XL-AZC',12),(7,2,4,4,'CAM-OXF-M-AZM',15),(8,3,8,1,'JNS-SKN-28-NEG',30),(9,3,9,1,'JNS-SKN-30-NEG',40),(10,3,10,4,'JNS-SKN-32-AZM',20),(11,3,11,4,'JNS-SKN-34-AZM',15);
/*!40000 ALTER TABLE `tbl_ope_variantesProd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_ope_ventas`
--

DROP TABLE IF EXISTS `tbl_ope_ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_ope_ventas` (
  `VentaId` int NOT NULL AUTO_INCREMENT,
  `Venta_UsuarioId` int DEFAULT NULL,
  `Venta_Fecha` date DEFAULT NULL,
  `Venta_Total` decimal(10,2) DEFAULT NULL,
  `Venta_MetodoPago` varchar(45) DEFAULT NULL,
  `Venta_TransaccionId` varchar(100) NOT NULL,
  `Venta_Estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`VentaId`),
  KEY `UsuarioId_idx` (`Venta_UsuarioId`),
  CONSTRAINT `UsuarioVentasId` FOREIGN KEY (`Venta_UsuarioId`) REFERENCES `tbl_ope_usuarios` (`UsuarioId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_ope_ventas`
--

LOCK TABLES `tbl_ope_ventas` WRITE;
/*!40000 ALTER TABLE `tbl_ope_ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_ope_ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_rel_carrito`
--

DROP TABLE IF EXISTS `tbl_rel_carrito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_rel_carrito` (
  `CarritoId` int NOT NULL,
  `Carrito_UsuarioId` int DEFAULT NULL,
  `Carrito_VarianteId` int DEFAULT NULL,
  `Carrito_Cantidad` int DEFAULT NULL,
  `Carrito_FechaAgregado` date DEFAULT NULL,
  PRIMARY KEY (`CarritoId`),
  KEY `UsuarioId_idx` (`Carrito_UsuarioId`),
  KEY `VarianteId_idx` (`Carrito_VarianteId`),
  CONSTRAINT `UsuarioCarrId` FOREIGN KEY (`Carrito_UsuarioId`) REFERENCES `tbl_ope_usuarios` (`UsuarioId`),
  CONSTRAINT `VarianteId` FOREIGN KEY (`Carrito_VarianteId`) REFERENCES `tbl_ope_variantesProd` (`VarianteProdId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_rel_carrito`
--

LOCK TABLES `tbl_rel_carrito` WRITE;
/*!40000 ALTER TABLE `tbl_rel_carrito` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_rel_carrito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_rel_detalleVentas`
--

DROP TABLE IF EXISTS `tbl_rel_detalleVentas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_rel_detalleVentas` (
  `DetalleId` int NOT NULL AUTO_INCREMENT,
  `Detalle_VentaId` int DEFAULT NULL,
  `Detalle_VarianteId` int DEFAULT NULL,
  `Detalle_Cantidad` int DEFAULT NULL,
  `Detalle_PrecioUnit` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`DetalleId`),
  KEY `VentaId_idx` (`Detalle_VentaId`),
  KEY `VarianteId_idx` (`Detalle_VarianteId`),
  CONSTRAINT `VarianteDetalleId` FOREIGN KEY (`Detalle_VarianteId`) REFERENCES `tbl_ope_variantesProd` (`VarianteProdId`),
  CONSTRAINT `VentaId` FOREIGN KEY (`Detalle_VentaId`) REFERENCES `tbl_ope_ventas` (`VentaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_rel_detalleVentas`
--

LOCK TABLES `tbl_rel_detalleVentas` WRITE;
/*!40000 ALTER TABLE `tbl_rel_detalleVentas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_rel_detalleVentas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_rel_direcciones`
--

DROP TABLE IF EXISTS `tbl_rel_direcciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_rel_direcciones` (
  `DireccionId` int NOT NULL,
  `Direccion_UsuarioId` int DEFAULT NULL,
  `Direccion_Calle` varchar(45) DEFAULT NULL,
  `Direccion_NumExt` varchar(15) DEFAULT NULL,
  `Direccion_NumInt` varchar(15) DEFAULT NULL,
  `Direccion_Colonia` varchar(45) DEFAULT NULL,
  `Direccion_CP` char(5) DEFAULT NULL,
  `Direccion_Municipio` varchar(45) DEFAULT NULL,
  `Direccion_Estado` varchar(45) DEFAULT NULL,
  `Direccion_EsPrincipal` tinyint DEFAULT NULL,
  PRIMARY KEY (`DireccionId`),
  KEY `UsuarioId_idx` (`Direccion_UsuarioId`),
  CONSTRAINT `UsuarioDireccId` FOREIGN KEY (`Direccion_UsuarioId`) REFERENCES `tbl_ope_usuarios` (`UsuarioId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_rel_direcciones`
--

LOCK TABLES `tbl_rel_direcciones` WRITE;
/*!40000 ALTER TABLE `tbl_rel_direcciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_rel_direcciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_rel_imagenes`
--

DROP TABLE IF EXISTS `tbl_rel_imagenes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_rel_imagenes` (
  `ImagenId` int NOT NULL,
  `Imagen_ProductoId` int DEFAULT NULL,
  `ImagenURL` varchar(200) DEFAULT NULL,
  `Imagen_EsPrincipal` tinyint DEFAULT NULL,
  PRIMARY KEY (`ImagenId`),
  KEY `ProductoId_idx` (`Imagen_ProductoId`),
  CONSTRAINT `ProductoImgId` FOREIGN KEY (`Imagen_ProductoId`) REFERENCES `tbl_ope_productos` (`ProductoId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_rel_imagenes`
--

LOCK TABLES `tbl_rel_imagenes` WRITE;
/*!40000 ALTER TABLE `tbl_rel_imagenes` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_rel_imagenes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_rel_wishlist`
--

DROP TABLE IF EXISTS `tbl_rel_wishlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_rel_wishlist` (
  `WishlistId` int NOT NULL,
  `Wishlist_UsuarioId` int DEFAULT NULL,
  `Wishlist_ProductoId` int DEFAULT NULL,
  PRIMARY KEY (`WishlistId`),
  KEY `UsuarioId_idx` (`Wishlist_UsuarioId`),
  KEY `ProductoId_idx` (`Wishlist_ProductoId`),
  CONSTRAINT `ProductoWishId` FOREIGN KEY (`Wishlist_ProductoId`) REFERENCES `tbl_ope_productos` (`ProductoId`),
  CONSTRAINT `UsuarioWishId` FOREIGN KEY (`Wishlist_UsuarioId`) REFERENCES `tbl_ope_usuarios` (`UsuarioId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_rel_wishlist`
--

LOCK TABLES `tbl_rel_wishlist` WRITE;
/*!40000 ALTER TABLE `tbl_rel_wishlist` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_rel_wishlist` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-03-26  0:24:42
