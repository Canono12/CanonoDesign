-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 05, 2023 at 01:34 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `scc_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `table_department`
--

CREATE TABLE `table_department` (
  `dept_id` int(10) NOT NULL,
  `dept_code` varchar(50) NOT NULL,
  `dept_desc` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table_department`
--

INSERT INTO `table_department` (`dept_id`, `dept_code`, `dept_desc`) VALUES
(1, 'BSIT', 'Bachelor of Science Information Technology'),
(3, 'BSBA', 'Bachelor of Science in Business Administration');

-- --------------------------------------------------------

--
-- Table structure for table `table_enrolle`
--

CREATE TABLE `table_enrolle` (
  `en_id` int(10) NOT NULL,
  `st_id` int(10) NOT NULL,
  `dept_id` int(10) NOT NULL,
  `en_status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table_enrolle`
--

INSERT INTO `table_enrolle` (`en_id`, `st_id`, `dept_id`, `en_status`) VALUES
(3, 5, 3, 'Suspended'),
(4, 10, 1, 'Suspended');

-- --------------------------------------------------------

--
-- Table structure for table `table_user`
--

CREATE TABLE `table_user` (
  `user_id` int(10) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `user_email` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `user_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table_user`
--

INSERT INTO `table_user` (`user_id`, `firstname`, `lastname`, `user_email`, `username`, `password`, `user_status`) VALUES
(9, 'Christian', 'Canono', 'christiancanono33@gmail.com', 'Canono12', '[C@505dcb77', 'Pending'),
(10, 'Joanna', 'dela Cruz', 'a@gmail.com', 'Joanna12', '[C@23c76f30', 'Pending'),
(11, 'qwee', 'rwerwe', 'sadfsf', '123', '[C@fe12de3', 'Pending'),
(12, 'update', 'qweq', 'qwe', 'qweqe', '[C@6d533cd6', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_student`
--

CREATE TABLE `tbl_student` (
  `st_id` int(10) NOT NULL,
  `st_name` varchar(50) NOT NULL,
  `st_address` varchar(100) NOT NULL,
  `st_status` varchar(10) NOT NULL,
  `st_gender` varchar(10) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `mname` varchar(50) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `violation` varchar(100) NOT NULL,
  `image` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_student`
--

INSERT INTO `tbl_student` (`st_id`, `st_name`, `st_address`, `st_status`, `st_gender`, `contact`, `mname`, `fname`, `violation`, `image`) VALUES
(5, 'Joanna dela Cruz', 'San Isidro, City of San Fernando, Cebu', 'Single', 'Female', '09756543114', 'Josephine', 'Antonio', 'Using profane, obscene, or ethnically offensive language', 'src/images/LOGO.png'),
(10, 'Christian O. Canono', 'Langtad, City of Naga, Cebu', 'Single', 'Male', '09208044382', 'lorena', 'cristino', 'Threatening the safety of another student', '????\0JFIF\0\0\0\0\0\0???ICC_PROFILE\0\0\0?lcms\0\0mntrRGB XYZ ?\0\0\0	\0\0acspMSFT\0\0\0\0sawsctrl\0\0\0\0\0\0\0\0\0\0\0\0\0\0??\0\0\0\0\0?-hand??\0=@??=@t,???\"?\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0	desc\0\0\0?\0\0\0_cprt\0\0\0\0\0wtpt\0\0\0\0\0rXYZ\0\0,\0\0\0gXYZ\0\0@\0\0\0bXYZ\0\0T\0\0\0rTRC\0\0h\0\0\0`gTRC\0\0h\0\0\0`bTRC\0\0h\0\0\0`desc\0\0\0\0\0\0\0uRGB\0\0\0\0\0\0\0\0\0\0\0\0text\0\0\0\0CC0\0XYZ \0\0\0\0\0\0?T\0\0\0\0?XYZ \0\0\0\0\0\0o?\0\08?\0\0?XYZ \0\0\0\0\0\0b?\0\0??\0\0?XYZ \0\0\0\0\0\0$?\0\0?\0\0??curv\0\0\0\0\0\0\0*\0\0\0|\0??u??N\nb???j. C$?)j.~3?9???FWM6Tv\\dl?uV~??,?6?????۾????e?w??????\0C\0\n'),
(15, 'fgfg', 'fgfg', 'Single', 'Female', 'fgfgf', 'fgf', 'fgf', 'Cheating or plagiarizing', 'src/images/5 years LTO.jpg'),
(16, 'hjhj', 'hjhj', 'Single', 'Female', 'hjhj', 'hjh', 'jhjhj', 'Cheating or plagiarizing', 'src/images/5 years LTO.jpg'),
(18, 'fgfg', 'fgfg', 'Single', 'Male', 'fgf', 'fgf', 'fgfg', 'Cheating or plagiarizing', 'src/images/pagkakaroon ng feeding programs.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `ID` int(10) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `user_email` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `confirmpass` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `firstname`, `lastname`, `user_email`, `username`, `password`, `confirmpass`) VALUES
(4, 'Christian', 'Canono', 'christiancanono33@gmail.com', 'qweqwe', '18138372fad4b94533cd4881f03dc6c69296dd897234e0cee83f727e2e6b1f63', '18138372fad4b94533cd4881f03dc6c69296dd897234e0cee83f727e2e6b1f63'),
(5, 'v', 'v', 'v', 'v', '4c94485e0c21ae6c41ce1dfe7b6bfaceea5ab68e40a2476f50208e526f506080', '4c94485e0c21ae6c41ce1dfe7b6bfaceea5ab68e40a2476f50208e526f506080');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `table_department`
--
ALTER TABLE `table_department`
  ADD PRIMARY KEY (`dept_id`);

--
-- Indexes for table `table_enrolle`
--
ALTER TABLE `table_enrolle`
  ADD PRIMARY KEY (`en_id`),
  ADD KEY `enroll_st` (`st_id`),
  ADD KEY `enroll_dept` (`dept_id`);

--
-- Indexes for table `table_user`
--
ALTER TABLE `table_user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `tbl_student`
--
ALTER TABLE `tbl_student`
  ADD PRIMARY KEY (`st_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `table_department`
--
ALTER TABLE `table_department`
  MODIFY `dept_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `table_enrolle`
--
ALTER TABLE `table_enrolle`
  MODIFY `en_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `table_user`
--
ALTER TABLE `table_user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `tbl_student`
--
ALTER TABLE `tbl_student`
  MODIFY `st_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `table_enrolle`
--
ALTER TABLE `table_enrolle`
  ADD CONSTRAINT `enroll_dept` FOREIGN KEY (`dept_id`) REFERENCES `table_department` (`dept_id`),
  ADD CONSTRAINT `enroll_st` FOREIGN KEY (`st_id`) REFERENCES `tbl_student` (`st_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
