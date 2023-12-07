-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Des 2023 pada 13.01
-- Versi server: 10.4.25-MariaDB
-- Versi PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `karyawanpro_db`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_karyawan`
--

CREATE TABLE `data_karyawan` (
  `nik` varchar(8) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tgll` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `alamat` varchar(35) NOT NULL,
  `nomor` varchar(12) NOT NULL,
  `email` varchar(30) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_karyawan`
--

INSERT INTO `data_karyawan` (`nik`, `nama`, `tgll`, `gender`, `alamat`, `nomor`, `email`, `status`) VALUES
('50420080', 'Ahmad Muhamad Salim Alhadar', '13 Desember 2001', 'Laki-laki', 'Jakasampurna', '083815599492', 'putraalhadar@gmail.com', 'Karyawan Tetap'),
('51531191', 'Imam Abdul Hakim', '16 Agustus 2002', 'Laki-laki', 'Bogor', '083815599492', 'abdul@gmail.com', 'Karyawan Magang'),
('50310070', 'Meli Sunandi', '15 November 2001', 'Perempuan', 'Jakarta', '082704488381', 'melisunandi@gmail.com', 'Karyawan Kontrak');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
