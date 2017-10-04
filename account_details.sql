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
-- Table structure for table `account_details`
--

CREATE TABLE IF NOT EXISTS `account_details` (
  `date_` varchar(50) DEFAULT NULL,
  `customer_type1` varchar(100) DEFAULT NULL,
  `full_name` varchar(100) DEFAULT NULL,
  `father_name` varchar(100) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `marital_status` varchar(40) DEFAULT NULL,
  `mode_operation` varchar(100) DEFAULT NULL,
  `services1` varchar(100) DEFAULT NULL,
  `services2` varchar(100) DEFAULT NULL,
  `services3` varchar(100) DEFAULT NULL,
  `current_address` varchar(200) DEFAULT NULL,
  `permanent_address` varchar(200) DEFAULT NULL,
  `mobile_no` varchar(10) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `balance` int(11) DEFAULT NULL,
  `nationaliy` varchar(100) DEFAULT NULL,
  `account_no` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`account_no`),
  KEY `Account_no` (`account_no`),
  KEY `Account_no_2` (`account_no`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5021 ;

--
-- Dumping data for table `account_details`
--

INSERT INTO `account_details` (`date_`, `customer_type1`, `full_name`, `father_name`, `sex`, `marital_status`, `mode_operation`, `services1`, `services2`, `services3`, `current_address`, `permanent_address`, `mobile_no`, `city`, `state`, `email`, `balance`, `nationaliy`, `account_no`, `password`) VALUES
('2012-08-09', 'Public', 'sanju', 'asd', 'FEMALE', 'UNMARRIED', 'SELF ONLY', 'ATM cum CREDIT CARD', 'INTERNET BANKING', 'SMS ALERT', 'asdwad', 'asdasd', '123', 'dad', 'sdwa', 'asds', 789, 'asd', 5006, 'qwerwty'),
('2012-03-09', 'Public', 'riya lohia', 'sanjeev lohia', 'FEMALE', 'UNMARRIED', 'SELF ONLY', 'ATM cum CREDIT CARD', 'INTERNET BANKING', 'null', 'jaipur', 'fvhf', '1234567890', 'sgnr', 'raj', 'gmail.com', -926, 'null', 5007, 'qwerty'),
('2012-09-08', 'Public', 'simran', 'dad', 'FEMALE', 'UNMARRIED', 'SELF ONLY', 'null', 'INTERNET BANKING', 'SMS ALERT', 'WDW', 'qwqe', '1234', 'iuik', 'raj', 'gmail', 789, 'null', 5008, 'wertu'),
('2012-09-09', 'Public', 'fc', 'dad', 'MALE', 'UNMARRIED', 'EITHER OR SURVIVOR', 'null', 'null', 'SMS ALERT', 'hkjhk', 'jhkjh', '900', 'hgjhg', 'jhk', 'gmail.com', 794, 'null', 5009, 'fc'),
('2012-09-09', 'Public', 'dikshit', 'wqed', 'MALE', 'MARRIED', 'SELF ONLY', 'ATM cum CREDIT CARD', 'null', 'null', 'wdwq', 'wqewq', '11', 'wqeqwrrre', 'wew', 'weq', 111, 'null', 5011, 'qw'),
('2012-09-09', 'Public', 'ateet', 'dad', 'MALE', 'UNMARRIED', 'EITHER OR SURVIVOR', 'null', 'INTERNET BANKING', 'null', 'edfewdfsf', 'werw', '12', 'wrw', 'wrw', 'ewrewr', 1246, 'null', 5013, 'qq'),
('2012-09-09', 'Public', 'riya lohia', 'dad', 'FEMALE', 'UNMARRIED', 'EITHER OR SURVIVOR', 'null', 'INTERNET BANKING', 'SMS ALERT', 'wqerwqr', 'wqrqrewgfw', '9234567890', 'sgnr', 'raj', 'riyalh@gmail.com', 978925, 'null', 5016, 'priya'),
('2017-04-08', 'Public', 'Riya Lohia', 'Sanjeev Lohia', 'FEMALE', 'UNMARRIED', 'EITHER OR SURVIVOR', 'null', 'INTERNET BANKING', 'SMS ALERT', '45-d block', '45-d block', '1234567890', 'sgnr', 'raj', 'riya@gmail.com', 1164, 'null', 5017, 'qwqw'),
('2016-09-09', 'Public', 'Riya Lohia', 'Sanjeev Lohia', 'FEMALE', 'UNMARRIED', 'EITHER OR SURVIVOR', 'null', 'INTERNET BANKING', 'null', '45-d block', 'lnmiit', '1234567890', 'sgnr', 'raj', 'riya@lnmit.ac.in', 12345, 'null', 5018, '****'),
('2019-09-09', 'Public', 'rafas', 'serfs', 'FEMALE', 'UNMARRIED', 'EITHER OR SURVIVOR', 'null', 'INTERNET BANKING', 'null', 'awerew', 'esrfSE', '123245353', 'DFGDerdse', 'dsfs', 'dsfsf', 213, 'dfs', 5019, '*****'),
('2012-09-09', 'Public', 'Riyafv', 'vs', 'FEMALE', 'UNMARRIED', 'EITHER OR SURVIVOR', 'null', 'INTERNET BANKING', 'null', 'sdF', 'sFEf', '1234567890', 'sef', 'sdfs', 'sdad', 12, 'we', 5020, 'qwe');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
