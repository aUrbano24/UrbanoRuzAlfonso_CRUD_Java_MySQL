-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         5.7.19-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para restaurante
CREATE DATABASE restaurante
CREATE DATABASE IF NOT EXISTS `restaurante` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `restaurante`;

-- Volcando estructura para tabla restaurante.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `idclientes` int(11) NOT NULL,
  `identificacion` varchar(45) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  PRIMARY KEY (`idclientes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla restaurante.clientes: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
REPLACE INTO `clientes` (`idclientes`, `identificacion`, `nombres`, `apellidos`, `direccion`, `telefono`) VALUES
	(43971265, 'CEDULA', 'DIANA', 'PEREZ', 'CALLE 60 #15-30 INT 201', '3004157942'),
	(89754258, 'CEDULA', 'HERNAN', 'ECHAVARRIA DUQUE', 'CRA 15 # 10-85', '3004158796'),
	(890564871, 'NIT', 'CARLOS MARIO', 'TAPIA QUINTERO', 'AVENIDA 23 #15-80', '2841187');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;

-- Volcando estructura para tabla restaurante.empleados
CREATE TABLE IF NOT EXISTS `empleados` (
  `identificacion` int(11) NOT NULL,
  `tidentificacion` varchar(45) NOT NULL DEFAULT '',
  `nombres` varchar(45) NOT NULL DEFAULT '',
  `apellidos` varchar(45) NOT NULL DEFAULT '',
  `direccion` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`identificacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla restaurante.empleados: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
REPLACE INTO `empleados` (`identificacion`, `tidentificacion`, `nombres`, `apellidos`, `direccion`) VALUES
	(43564897, 'CEDULA', 'FLOR MARIA', 'HOYOS HERRERA', 'CRA 90 # 15-70'),
	(101754654, 'CEDULA DE EXTRANJERIA', 'CARLOS MARIO', 'RESTREPO VASQUEZ', 'CRA 20 #15-80'),
	(1017151606, 'CEDULA', 'WILMAR', 'GARCIA DUQUE', 'CRA 80 #20-15');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;

-- Volcando estructura para tabla restaurante.facturas
CREATE TABLE IF NOT EXISTS `facturas` (
  `idfactura` int(11) NOT NULL AUTO_INCREMENT,
  `idcliente` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `idempleado` int(11) NOT NULL,
  PRIMARY KEY (`idfactura`) USING BTREE,
  KEY `FK_facturas_clientes` (`idcliente`),
  KEY `FK_facturas_empleados` (`idempleado`),
  KEY `FK_facturas_productos` (`idproducto`),
  CONSTRAINT `FK_facturas_clientes` FOREIGN KEY (`idcliente`) REFERENCES `clientes` (`idclientes`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_facturas_empleados` FOREIGN KEY (`idempleado`) REFERENCES `empleados` (`identificacion`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_facturas_productos` FOREIGN KEY (`idproducto`) REFERENCES `productos` (`idproducto`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla restaurante.facturas: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
REPLACE INTO `facturas` (`idfactura`, `idcliente`, `idproducto`, `fecha`, `idempleado`) VALUES
	(1, 43971265, 3000, '2020-01-20', 1017151606),
	(2, 89754258, 4000, '2020-03-01', 101754654),
	(3, 89754258, 5000, '2020-04-12', 43564897);
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;

-- Volcando estructura para tabla restaurante.productos
CREATE TABLE IF NOT EXISTS `productos` (
  `idproducto` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `precio` varchar(45) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla restaurante.productos: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
REPLACE INTO `productos` (`idproducto`, `nombre`, `precio`, `descripcion`) VALUES
	(3000, 'GASEOSA PERSONAL', '2500', 'GASEOSA 350'),
	(4000, 'CAFE', '1500', 'CAFE 200 ONZ'),
	(5000, 'DESAYUNO', '8000', 'DESAYUNO DEL DIA');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
