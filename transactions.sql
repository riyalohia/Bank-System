-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 04, 2017 at 08:26 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE IF NOT EXISTS `transactions` (
  `send_to` int(11) DEFAULT NULL,
  `amount_send` int(11) DEFAULT NULL,
  `account_no` int(11) DEFAULT NULL,
  `to_bank` varchar(100) DEFAULT NULL,
  `balance` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`send_to`, `amount_send`, `account_no`, `to_bank`, `balance`) VALUES
(5010, 12, 5007, 'Axis Bank', 0),
(5007, 10, 5007, 'Axis Bank', 0),
(5010, 10, 5007, 'Axis Bank', 0),
(5010, 10, 5007, 'Axis Bank', 0),
(5010, 10, 5007, 'Axis Bank', 0),
(5010, 10, 5007, 'Axis Bank', 0),
(5010, 10, 5007, 'Axis Bank', 0),
(9000, 1, 5007, 'Yes Bank', 0),
(5010, 1, 5007, 'Axis Bank', 0),
(1234, 1, 5007, 'ICICI Bank', NULL),
(34, 1, 5007, 'ICICI Bank', NULL),
(123, 1, 5007, 'State Bank of India', NULL),
(123, 1, 5007, 'ICICI Bank', 76),
(5010, 1, 5007, 'Axis Bank', 75),
(5010, 1, 5007, 'Axis Bank', 74),
(5007, 10, 5010, 'Axis Bank', 824),
(5010, 1, 5007, 'Axis Bank', 83),
(5011, 1, 5007, 'Axis Bank', 81),
(5007, 1, 5007, 'State Bank of India', 80),
(5013, 1, 5007, 'Axis Bank', 168),
(5099, 2, 5007, 'ICICI Bank', 265),
(5007, 1, 5015, 'Axis Bank', 121),
(3456, 12, 5017, 'ICICI Bank', 1176),
(5016, 12, 5017, 'Axis Bank', 1164),
(5016, 1, 5011, 'State Bank of India', 112),
(5016, 1, 5011, 'Axis Bank', 111);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
