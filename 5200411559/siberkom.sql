-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 06, 2021 at 02:14 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_responsi2pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `siberkom`
--

CREATE TABLE `siberkom` (
  `id` int(11) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jumlah_unit` int(11) NOT NULL,
  `jenis_produk` varchar(20) NOT NULL,
  `penerima` varchar(50) NOT NULL,
  `supplier` varchar(50) NOT NULL,
  `harga_perunit` int(11) NOT NULL,
  `catatan` text DEFAULT NULL,
  `tanggal` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `siberkom`
--

INSERT INTO `siberkom` (`id`, `nama_barang`, `jumlah_unit`, `jenis_produk`, `penerima`, `supplier`, `harga_perunit`, `catatan`, `tanggal`) VALUES
(2, 'Kipas Angin Sekai mini 12cm', 120, 'impor', 'Cabang Semarang', 'Cabang Surabaya', 120000, '-', '2001-05-12'),
(3, 'TV Polytron 22inch Tabung', 30, 'impor', 'Cabang Yogyakarta', 'Pusat', 1100000, '', '2021-06-05');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `siberkom`
--
ALTER TABLE `siberkom`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `siberkom`
--
ALTER TABLE `siberkom`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
