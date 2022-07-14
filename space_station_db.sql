CREATE DATABASE  IF NOT EXISTS `space_station_db` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `space_station_db`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: space_station_db
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `naves_lanzaderas`
--

DROP TABLE IF EXISTS `naves_lanzaderas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `naves_lanzaderas` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `country` varchar(50) DEFAULT NULL,
  `activity_start` int DEFAULT NULL,
  `activity_end` int DEFAULT NULL,
  `fuel` varchar(50) DEFAULT NULL,
  `cargo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `naves_lanzaderas`
--

LOCK TABLES `naves_lanzaderas` WRITE;
/*!40000 ALTER TABLE `naves_lanzaderas` DISABLE KEYS */;
INSERT INTO `naves_lanzaderas` VALUES (1,'Saturno V','EE.UU.',1967,1973,'H(liq)+O(liq)','Nave tripulada Apolo'),(2,'Energía','Rusia/Ucrania',1987,1988,'Queroseno+O(liq)','El transbordador Buran'),(3,'H-IIA','Japón',2001,0,'Solido+N(liq)+O(liq)','Sonda SELENE');
/*!40000 ALTER TABLE `naves_lanzaderas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `naves_roboticas`
--

DROP TABLE IF EXISTS `naves_roboticas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `naves_roboticas` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `country` varchar(50) DEFAULT NULL,
  `activity_start` int DEFAULT NULL,
  `activity_end` int DEFAULT NULL,
  `fuel` varchar(50) DEFAULT NULL,
  `research` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `naves_roboticas`
--

LOCK TABLES `naves_roboticas` WRITE;
/*!40000 ALTER TABLE `naves_roboticas` DISABLE KEYS */;
INSERT INTO `naves_roboticas` VALUES (1,'Cassini-Huygens','EE.UU. NASA',1997,0,'NO4+MMH','Saturno y sus lunas'),(2,'Pionero X','EE.UU. NASA',1972,0,'NO4+MMH','Júpiter'),(3,'Venera IV','Rusia',1967,0,'','Venus');
/*!40000 ALTER TABLE `naves_roboticas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `naves_tripuladas`
--

DROP TABLE IF EXISTS `naves_tripuladas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `naves_tripuladas` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `country` varchar(50) DEFAULT NULL,
  `activity_start` int DEFAULT NULL,
  `activity_end` int DEFAULT NULL,
  `fuel` varchar(50) DEFAULT NULL,
  `capacity` int DEFAULT NULL,
  `objective` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `naves_tripuladas`
--

LOCK TABLES `naves_tripuladas` WRITE;
/*!40000 ALTER TABLE `naves_tripuladas` DISABLE KEYS */;
INSERT INTO `naves_tripuladas` VALUES (1,'Apolo','EE.UU.',1966,1975,'NO4+UDMH',0,'Misiones lunares'),(3,'Shenzou','China',1999,0,'N2O4+MMH',3,''),(4,'Vostok','Rusia',1960,1963,'NO+Amina',1,'Estudio humano');
/*!40000 ALTER TABLE `naves_tripuladas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-14 18:20:17
