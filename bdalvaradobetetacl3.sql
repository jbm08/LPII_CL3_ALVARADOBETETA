-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 26-11-2023 a las 04:47:02
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdalvaradobetetacl3`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_productocl3`
--

CREATE TABLE IF NOT EXISTS `tbl_productocl3` (
  `IDPRODUCTOCL3` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRECL3` varchar(255) DEFAULT NULL,
  `PRECIOVENTACL3` double DEFAULT NULL,
  `STOCKCL3` int(11) DEFAULT NULL,
  `PRECIOCOMPRACL3` double DEFAULT NULL,
  `ESTADOCL3` varchar(255) DEFAULT NULL,
  `DESCRIPCIONCL3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`IDPRODUCTOCL3`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `tbl_productocl3`
--

INSERT INTO `tbl_productocl3` (`IDPRODUCTOCL3`, `NOMBRECL3`, `PRECIOVENTACL3`, `STOCKCL3`, `PRECIOCOMPRACL3`, `ESTADOCL3`, `DESCRIPCIONCL3`) VALUES
(1, 'Leche', 30, 3, 50, 'vigente', 'oferta');
(2, 'Aceite', 50, 5, 60, 'vigente', 'oferta');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
