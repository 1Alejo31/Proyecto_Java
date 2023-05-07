CREATE DATABASE IF NOT EXISTS `patin_renta`;
USE `patin_renta`;

CREATE TABLE IF NOT EXISTS `patines` (
  `id` int(11) NOT NULL,
  `marca` varchar(100) DEFAULT NULL,
  `modelo` varchar(100) DEFAULT NULL,
  `tamaño` varchar(100) DEFAULT NULL,
  `novedad` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=LATIN1;

INSERT INTO `patines` (`id`, `marca`, `modelo`, `tamaño`, `novedad`) VALUES
	(1, 'obrea', 'montaña', 'Grande', '2'),
	(2, 'obrea', 'montaña', 'Grande', '2'),
	(3, 'obrea', 'montaña', 'grande', '2'),
	(4, 'obrea', 'montaña', 'mediano', '2'),
	(5, 'obrea', 'montaña', 'mediano', '2'),
	(6, 'obrea', 'montaña', 'mediano', '2'),
	(7, 'gigant', 'sport', 'mediano', '2'),
	(8, 'gigant', 'sport', 'grande', '2'),
	(9, 'scott', 'cross', 'mediano', '2'),
	(10, 'scott', 'cross', 'pequeño', '2'),
	(11, 'scott', 'cross', 'pequeño', '2'),
	(12, 'trek', 'sport', 'grande', '2'),
	(13, 'trek', 'sport', 'grande', '2'),
	(14, 'scott', 'cross', 'mediano', '2'),
	(15, 'bh', 'montaña', 'grande ', '2'),
	(16, 'bh', 'montaña', 'grande', '2'),
	(17, 'bh', 'sport', 'grande', '2'),
	(18, 'obrea', 'sport', 'mediano', '2'),
	(19, 'scott', 'cross', 'grande', '2'),
	(20, 'trek', 'cross', 'grande', '2');

CREATE TABLE IF NOT EXISTS `usuarios` (
  `username` varchar(100) NOT NULL,
  `contrasena` varchar(100) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellidos` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `saldo` double(22,2) DEFAULT NULL,
  `premium` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=LATIN1;

CREATE TABLE IF NOT EXISTS `alquiler` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `fecha` DATETIME NOT NULL,
  PRIMARY KEY (`id`,`username`,`fecha`) USING BTREE,
  KEY `FK__usuarios` (`username`),
  CONSTRAINT `FK__patines` FOREIGN KEY (`id`) REFERENCES `patines` (`id`),
  CONSTRAINT `FK__usuarios` FOREIGN KEY (`username`) REFERENCES `usuarios` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=LATIN1;