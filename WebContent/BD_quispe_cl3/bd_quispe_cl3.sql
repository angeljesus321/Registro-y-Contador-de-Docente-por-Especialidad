CREATE DATABASE  IF NOT EXISTS `bd_quispe_cl3` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bd_quispe_cl3`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_quispe_cl3
-- ------------------------------------------------------
-- Server version	8.0.30

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

--
-- Table structure for table `tb_docente`
--

DROP TABLE IF EXISTS `tb_docente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_docente` (
  `cod_docente` int NOT NULL AUTO_INCREMENT,
  `nom_docente` varchar(25) NOT NULL,
  `ape_docente` varchar(25) NOT NULL,
  `dni_docente` int NOT NULL,
  `sueldo` double NOT NULL,
  `cod_sede` int NOT NULL,
  `cod_especialidad` int NOT NULL,
  PRIMARY KEY (`cod_docente`),
  KEY `cod_sede_idx` (`cod_sede`),
  KEY `cod_especialidad_idx` (`cod_especialidad`),
  CONSTRAINT `cod_especialidad` FOREIGN KEY (`cod_especialidad`) REFERENCES `tb_especialidad` (`cod_especialidad`),
  CONSTRAINT `cod_sede` FOREIGN KEY (`cod_sede`) REFERENCES `tb_sede` (`cod_sede`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_docente`
--

LOCK TABLES `tb_docente` WRITE;
/*!40000 ALTER TABLE `tb_docente` DISABLE KEYS */;
INSERT INTO `tb_docente` VALUES (19,'Angel','Quispe',75426025,7000,3,1),(20,'Abner','Durand',12345678,8000,3,1),(21,'Ariel','Buleje',76854930,9000,5,4),(22,'Mathias','Sanchez',87964523,10000,2,2),(23,'Pablo','Andres',98125643,1025,4,3);
/*!40000 ALTER TABLE `tb_docente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_especialidad`
--

DROP TABLE IF EXISTS `tb_especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_especialidad` (
  `cod_especialidad` int NOT NULL AUTO_INCREMENT,
  `nom_especialidad` varchar(25) NOT NULL,
  PRIMARY KEY (`cod_especialidad`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_especialidad`
--

LOCK TABLES `tb_especialidad` WRITE;
/*!40000 ALTER TABLE `tb_especialidad` DISABLE KEYS */;
INSERT INTO `tb_especialidad` VALUES (1,'Ingeniero'),(2,'Contador'),(3,'Psicologo'),(4,'Programador'),(5,'Tecnologia');
/*!40000 ALTER TABLE `tb_especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_sede`
--

DROP TABLE IF EXISTS `tb_sede`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_sede` (
  `cod_sede` int NOT NULL AUTO_INCREMENT,
  `nom_sede` varchar(25) NOT NULL,
  PRIMARY KEY (`cod_sede`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_sede`
--

LOCK TABLES `tb_sede` WRITE;
/*!40000 ALTER TABLE `tb_sede` DISABLE KEYS */;
INSERT INTO `tb_sede` VALUES (1,'San juan lurigancho'),(2,'Lima Centro'),(3,'Miraflores'),(4,'Breña'),(5,'Independencia');
/*!40000 ALTER TABLE `tb_sede` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bd_quispe_cl3'
--

--
-- Dumping routines for database 'bd_quispe_cl3'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-22 23:20:00
