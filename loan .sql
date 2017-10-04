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
-- Table structure for table `loan`
--

CREATE TABLE IF NOT EXISTS `loan` (
  `acc_no` int(11) DEFAULT NULL,
  `loan_type` varchar(30) DEFAULT NULL,
  `loan_amt` int(11) DEFAULT NULL,
  `no_installment` int(11) DEFAULT NULL,
  `time_installment` varchar(30) DEFAULT NULL,
  `installment` int(11) DEFAULT NULL,
  `interest_rate` int(11) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `month_time` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loan`
--

INSERT INTO `loan` (`acc_no`, `loan_type`, `loan_amt`, `no_installment`, `time_installment`, `installment`, `interest_rate`, `password`, `month_time`) VALUES
(5011, 'Travel Loan', 20000, 20, '1', 104, 5, 'qw', 8),
(5016, 'Education Loan', 9000, 20, '1', 104, 5, 'priya', 8),
(5015, 'Travel Loan', 2000, 20, '1', 104, 5, 'ee', 8),
(5017, 'Education Loan', 2000, 20, '1', 104, 5, 'qwqw', 8),
(5007, 'Education Loan', 60000, 26, '2', 2440, 5, 'qwerty', 2);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
