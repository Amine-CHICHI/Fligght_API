-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 05, 2021 at 04:01 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fligght`
--

-- --------------------------------------------------------

--
-- Table structure for table `aeroport`
--

DROP TABLE IF EXISTS `aeroport`;
CREATE TABLE IF NOT EXISTS `aeroport` (
  `id_aeroport` int(11) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `id_ville` int(11) NOT NULL,
  PRIMARY KEY (`id_aeroport`),
  KEY `FKqq9bl0n2v7g7wxreouhnmgqli` (`id_ville`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `aeroport`
--

INSERT INTO `aeroport` (`id_aeroport`, `nom`, `id_ville`) VALUES
(1, 'Aéroport de Casablanca Mohammed V', 1),
(2, 'Aéroport de Marrakech-Ménara', 2),
(3, 'Aéroport Agadir Al Massira', 3),
(4, 'Aéroport Fès Saïss', 4),
(5, 'Aéroport de Tanger-Ibn Batouta', 5),
(6, ' Aéroport Rabat-Salé', 6),
(7, 'Aéroport de Nador-Al Aroui ', 7),
(8, 'Aéroport d\'Oujda-Angad', 8),
(9, 'Aéroport de Dakhla', 9),
(10, 'Aéroport de Laâyoune Hassan 1er', 10),
(11, 'Aéroport d\'Ouarzazate', 11),
(12, 'Aéroport d\'Essaouira-Mogador', 12),
(13, 'Aéroport Al Hoceima Cherif Al Idrissi', 13),
(14, ' Paris-Charles de Gaulle', 14),
(15, 'Aéroport Nice Côte d\'Azur', 15),
(16, 'Aéroport Marseille Provence', 16),
(17, 'Aéroport de Lyon-Saint Exupéry', 17),
(18, 'Aéroport Toulouse-Blagnac', 18),
(19, 'EuroAirport Basel-Mulhouse-Freiburg', 19),
(20, 'Aéroport Montpellier Méditerranée', 20),
(21, 'Aéroport de Grenoble-Isère', 21),
(22, 'Aéroport de Cannes-Mandelieu', 22),
(23, 'Aéroport Nantes Atlantique', 23),
(24, 'Aéroport de Francfort', 24),
(25, 'Aéroport Franz-Josef-Strauss de Munich', 25),
(26, 'Aéroport international de Düsseldorf', 26),
(27, 'Aéroport de Berlin-Tempelhof', 27),
(28, 'Aéroport Léonard-de-Vinci de Rome Fiumicino', 28),
(29, 'Aéroport de Milan Malpensa', 29),
(30, 'Aéroport international Galileo Galilei de Pis', 30),
(31, 'Genève Aéroport', 31),
(32, 'Aéroport Adolfo-Suárez de Madrid-Barajas', 32),
(33, 'Aéroport de Stockholm-Arlanda', 33),
(34, 'Aéroport international d\'Athènes Elefthérios-', 34),
(35, 'Aéroport de Varsovie-Chopin', 35),
(36, 'Aéroport de Bruxelles', 36),
(37, 'Aéroport international de Dublin', 37),
(38, 'Aéroport d\'Helsinki-Vantaa\r\n\r\n', 38),
(39, 'Aéroport d\'Oslo-Gardermoen', 39),
(40, 'Aéroport international de Malte', 40),
(41, 'Aéroport de Zagreb', 41),
(42, ' Aéroport de Kaunas ', 42),
(43, ' Aéroport de Luxembourg', 43),
(44, 'Aéroport d\'Amsterdam Schiphol', 44),
(45, 'Aéroport de Tirana', 45),
(46, 'solalo', 2);

-- --------------------------------------------------------

--
-- Table structure for table `cabine`
--

DROP TABLE IF EXISTS `cabine`;
CREATE TABLE IF NOT EXISTS `cabine` (
  `id_cabine` bigint(20) NOT NULL,
  `capacite` int(11) DEFAULT NULL,
  `type_cabine` varchar(45) NOT NULL,
  PRIMARY KEY (`id_cabine`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cabine`
--

INSERT INTO `cabine` (`id_cabine`, `capacite`, `type_cabine`) VALUES
(1, 9, 'Première'),
(2, 80, 'Affaire'),
(3, 88, 'Éco-premium'),
(4, 343, 'Économie'),
(5, 20, 'LOLA');

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `id_client` int(11) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `numero_passport` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_client`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`id_client`, `nom`, `numero_passport`) VALUES
(1, 'Hamza', '22'),
(2, 'Hafsa', '22'),
(3, 'amine', '22'),
(4, 'mouad', '22'),
(5, 'jalil', '22'),
(6, 'Haf', '22');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `pays`
--

DROP TABLE IF EXISTS `pays`;
CREATE TABLE IF NOT EXISTS `pays` (
  `idpays` int(11) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idpays`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pays`
--

INSERT INTO `pays` (`idpays`, `nom`) VALUES
(1, 'Maroc'),
(2, 'France'),
(3, 'Allemagne'),
(4, 'Italie'),
(5, 'Suisse'),
(6, 'Espagne'),
(7, 'Suède'),
(8, 'Grèce'),
(9, 'Pologne'),
(10, 'Belgique'),
(11, 'Autriche'),
(12, 'Irlande'),
(13, 'Finlande'),
(14, 'Norvège'),
(15, 'Malte'),
(16, 'Croatie'),
(17, 'Lituanie'),
(18, 'Luxembourg'),
(19, 'Pays-bas'),
(20, 'Albanie');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `id_reservation` int(11) NOT NULL,
  `date_reservation` varchar(45) DEFAULT NULL,
  `heure_reservation` varchar(45) DEFAULT NULL,
  `client_id` int(11) NOT NULL,
  `vol_id` int(11) NOT NULL,
  PRIMARY KEY (`id_reservation`),
  KEY `FKoewar6f18rkn4iptr6da4oysv` (`client_id`),
  KEY `FKfj4ypmo6yenc9x7fl8ndcu29b` (`vol_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`id_reservation`, `date_reservation`, `heure_reservation`, `client_id`, `vol_id`) VALUES
(1, '2021-02-28', '09:00:00', 1, 1),
(2, '2021-02-28', '09:00:00', 1, 2),
(3, '2021-02-28', '09:00:00', 2, 2),
(4, '2021-02-28', '09:00:00', 3, 2),
(5, '2021-02-28', '09:00:00', 4, 2);

-- --------------------------------------------------------

--
-- Table structure for table `ville`
--

DROP TABLE IF EXISTS `ville`;
CREATE TABLE IF NOT EXISTS `ville` (
  `id_ville` int(11) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `pays_id` int(11) NOT NULL,
  PRIMARY KEY (`id_ville`),
  KEY `FK5ak72iyy65hfya4frs9pkprin` (`pays_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ville`
--

INSERT INTO `ville` (`id_ville`, `nom`, `pays_id`) VALUES
(1, 'Casablanca', 1),
(2, 'Marrakech', 1),
(3, 'Agadir', 1),
(4, 'Fès', 1),
(5, 'Tanger', 1),
(6, 'Salé', 1),
(7, 'Nador', 1),
(8, 'Oujda', 1),
(9, 'Dakhla', 1),
(10, 'Laayoune', 1),
(11, 'Ouarzazate', 1),
(12, 'Essaouira', 1),
(13, 'Al Hoceima', 1),
(14, 'Paris', 2),
(15, 'Nice', 2),
(16, 'Marseille', 2),
(17, 'Lyon', 2),
(18, 'Toulouse', 2),
(19, 'Mulhouse', 2),
(20, 'Montpellier', 2),
(21, 'Grenoble', 2),
(22, 'Cannes', 2),
(23, 'Nantes', 2),
(24, 'Francfort', 3),
(25, 'Munich', 3),
(26, 'Düsseldorf', 3),
(27, 'berlin', 3),
(28, 'Rome', 4),
(29, 'milan', 4),
(30, 'Pise', 4),
(31, 'Genève', 5),
(32, 'Madrid', 6),
(33, 'Stockholm', 7),
(34, 'Athènes', 8),
(35, 'Varsovie', 9),
(36, 'Bruxelles', 10),
(37, 'Dublin', 12),
(38, 'Helsinki', 13),
(39, 'oslo', 14),
(40, 'Gudja', 15),
(41, 'Zagreb', 16),
(42, 'Kaunas', 17),
(43, 'Sandweiler', 18),
(44, 'Amsterdam', 19),
(45, 'Tirana', 20);

-- --------------------------------------------------------

--
-- Table structure for table `vol`
--

DROP TABLE IF EXISTS `vol`;
CREATE TABLE IF NOT EXISTS `vol` (
  `id` bigint(20) NOT NULL,
  `date_arrivee` date NOT NULL,
  `date_depart` date NOT NULL,
  `heure_arrivee` time NOT NULL,
  `heure_depart` time NOT NULL,
  `isreservationavailable` int(11) DEFAULT NULL,
  `price` decimal(4,0) NOT NULL,
  `aeroport_arrivee_id` bigint(20) NOT NULL,
  `aeroport_depart_id` bigint(20) NOT NULL,
  `cabine_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKoomtu08ssdun0pekmeetciw74` (`aeroport_arrivee_id`),
  KEY `FKm773v9l73ghorcxki540erbyt` (`aeroport_depart_id`),
  KEY `FKbqn94brlf9ibi9y9qyi5o9ow4` (`cabine_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vol`
--

INSERT INTO `vol` (`id`, `date_arrivee`, `date_depart`, `heure_arrivee`, `heure_depart`, `isreservationavailable`, `price`, `aeroport_arrivee_id`, `aeroport_depart_id`, `cabine_id`) VALUES
(1, '2021-02-28', '2021-02-28', '11:45:00', '09:00:00', 0, '1628', 14, 6, 3),
(2, '2021-03-02', '2021-03-02', '20:20:00', '17:00:00', 0, '2930', 36, 1, 3),
(3, '2021-03-02', '2021-03-02', '07:25:00', '06:10:00', 0, '2971', 28, 2, 1),
(4, '2021-03-02', '2021-03-02', '17:12:00', '15:00:00', 0, '2736', 14, 6, 2),
(5, '2021-03-17', '2021-03-17', '16:36:00', '14:00:00', 0, '1543', 17, 4, 3),
(6, '2021-03-10', '2021-03-10', '11:00:00', '08:35:00', 0, '2109', 16, 1, 4),
(7, '2021-03-12', '2021-03-12', '17:00:00', '16:15:00', 0, '548', 22, 17, 1),
(8, '2021-03-13', '2021-03-13', '12:55:00', '10:20:00', 0, '2071', 18, 7, 2),
(9, '2021-02-14', '2021-03-14', '16:44:00', '14:05:00', 0, '945', 33, 37, 4),
(10, '2021-03-15', '2021-03-15', '15:30:00', '13:00:00', 0, '887', 26, 29, 3),
(11, '2021-03-16', '2021-03-16', '08:50:00', '07:15:00', 0, '1040', 32, 36, 1),
(12, '2021-03-18', '2021-03-17', '01:30:00', '20:00:00', 0, '1732', 24, 39, 4),
(13, '2021-03-18', '2021-03-18', '21:30:00', '19:20:00', 0, '1927', 15, 8, 2),
(14, '2021-03-19', '2021-03-19', '13:05:00', '09:30:00', 0, '2104', 43, 28, 2),
(15, '2021-03-19', '2021-03-19', '15:30:00', '11:40:00', 0, '2887', 38, 44, 3),
(16, '2021-03-20', '2021-03-20', '12:05:00', '09:10:00', 0, '1628', 9, 6, 3),
(17, '2021-03-20', '2021-03-20', '20:20:00', '17:00:00', 0, '2130', 14, 1, 3),
(18, '2021-03-21', '2021-03-20', '01:55:00', '23:35:00', 0, '2971', 2, 24, 1),
(19, '2021-03-21', '2021-03-21', '16:36:00', '14:00:00', 0, '1543', 34, 4, 3),
(20, '2021-03-21', '2021-03-21', '18:12:00', '15:20:00', 0, '2736', 30, 8, 2),
(21, '2021-03-21', '2021-03-21', '18:26:00', '16:00:00', 0, '1743', 10, 1, 4),
(22, '2021-03-21', '2021-03-21', '16:36:00', '17:00:00', 0, '2308', 16, 6, 1),
(23, '2021-03-21', '2021-03-21', '16:36:00', '18:00:00', 0, '2245', 17, 4, 3),
(24, '2021-03-21', '2021-03-21', '16:36:00', '19:00:00', 0, '1860', 21, 1, 4),
(25, '2021-03-21', '2021-03-21', '16:36:00', '10:00:00', 0, '1798', 22, 6, 3),
(26, '2021-03-21', '2021-03-21', '16:36:00', '12:00:00', 0, '2369', 20, 8, 1),
(27, '2021-03-20', '2021-03-20', '17:20:00', '15:00:00', 0, '2130', 14, 1, 3),
(28, '2021-03-20', '2021-03-20', '18:30:00', '16:00:00', 0, '2030', 14, 1, 3),
(29, '2021-03-20', '2021-03-20', '20:10:00', '17:00:00', 0, '2100', 14, 1, 3),
(30, '2021-03-20', '2021-03-20', '22:20:00', '20:00:00', 0, '1930', 14, 1, 3),
(31, '2021-03-20', '2021-03-20', '10:30:00', '08:00:00', 0, '2030', 14, 6, 3),
(32, '2021-03-20', '2021-03-20', '12:20:00', '10:00:00', 0, '2250', 14, 6, 3),
(33, '2021-03-20', '2021-03-20', '14:00:00', '11:30:00', 0, '2100', 14, 6, 3),
(34, '2021-03-20', '2021-03-20', '20:15:00', '18:00:00', 0, '1800', 14, 6, 3);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
