-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: botpoc
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `bot_condition`
--

DROP TABLE IF EXISTS `bot_condition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bot_condition` (
  `id` bigint NOT NULL,
  `conditions` varchar(255) DEFAULT NULL,
  `time_frame` varchar(255) DEFAULT NULL,
  `condition` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bot_condition`
--

LOCK TABLES `bot_condition` WRITE;
/*!40000 ALTER TABLE `bot_condition` DISABLE KEYS */;
/*!40000 ALTER TABLE `bot_condition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bot_content`
--

DROP TABLE IF EXISTS `bot_content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bot_content` (
  `id` bigint NOT NULL,
  `message` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bot_content`
--

LOCK TABLES `bot_content` WRITE;
/*!40000 ALTER TABLE `bot_content` DISABLE KEYS */;
/*!40000 ALTER TABLE `bot_content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bot_info`
--

DROP TABLE IF EXISTS `bot_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bot_info` (
  `id` bigint NOT NULL,
  `bot_type` varchar(255) DEFAULT NULL,
  `client_id` varchar(255) DEFAULT NULL,
  `client_secret` varchar(255) DEFAULT NULL,
  `tenant_id` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bot_info`
--

LOCK TABLES `bot_info` WRITE;
/*!40000 ALTER TABLE `bot_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `bot_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bot_info_methods`
--

DROP TABLE IF EXISTS `bot_info_methods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bot_info_methods` (
  `bot_info_id` bigint NOT NULL,
  `methods_day` bigint NOT NULL,
  UNIQUE KEY `UK_c8j0x0catirpql3iksl5tfrh8` (`methods_day`),
  KEY `FKmc6jhcu7030wudkqt3hbw2tt0` (`bot_info_id`),
  CONSTRAINT `FKmc6jhcu7030wudkqt3hbw2tt0` FOREIGN KEY (`bot_info_id`) REFERENCES `bot_info` (`id`),
  CONSTRAINT `FKnqoxb5m4ycp9709vglgvxl0ih` FOREIGN KEY (`methods_day`) REFERENCES `bot_schedule` (`day`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bot_info_methods`
--

LOCK TABLES `bot_info_methods` WRITE;
/*!40000 ALTER TABLE `bot_info_methods` DISABLE KEYS */;
/*!40000 ALTER TABLE `bot_info_methods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bot_receiver`
--

DROP TABLE IF EXISTS `bot_receiver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bot_receiver` (
  `id` bigint NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bot_receiver`
--

LOCK TABLES `bot_receiver` WRITE;
/*!40000 ALTER TABLE `bot_receiver` DISABLE KEYS */;
/*!40000 ALTER TABLE `bot_receiver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bot_schedule`
--

DROP TABLE IF EXISTS `bot_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bot_schedule` (
  `day` bigint NOT NULL,
  `method` varchar(255) DEFAULT NULL,
  `triggers` varchar(255) DEFAULT NULL,
  `trigger_type` varchar(255) DEFAULT NULL,
  `week` bigint DEFAULT NULL,
  `trigger` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`day`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bot_schedule`
--

LOCK TABLES `bot_schedule` WRITE;
/*!40000 ALTER TABLE `bot_schedule` DISABLE KEYS */;
/*!40000 ALTER TABLE `bot_schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-15 17:26:56
