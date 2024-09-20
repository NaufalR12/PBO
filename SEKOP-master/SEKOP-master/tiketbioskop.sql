/*
SQLyog Ultimate v12.14 (64 bit)
MySQL - 10.1.10-MariaDB : Database - tiketbioskop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tiketbioskop` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `tiketbioskop`;

/*Table structure for table `film` */

DROP TABLE IF EXISTS `film`;

CREATE TABLE `film` (
  `id_film` int(11) NOT NULL AUTO_INCREMENT,
  `nama_film` varchar(20) DEFAULT NULL,
  `genre` varchar(20) DEFAULT NULL,
  `jam_mulai_pertama` varchar(5) DEFAULT NULL,
  `jam_selesai_pertama` varchar(5) DEFAULT NULL,
  `jam_mulai_kedua` varchar(5) DEFAULT NULL,
  `jam_selesai_kedua` varchar(5) DEFAULT NULL,
  `jam_mulai_ketiga` varchar(5) DEFAULT NULL,
  `jam_selesai_ketiga` varchar(5) DEFAULT NULL,
  `ruang` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`id_film`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `film` */

insert  into `film`(`id_film`,`nama_film`,`genre`,`jam_mulai_pertama`,`jam_selesai_pertama`,`jam_mulai_kedua`,`jam_selesai_kedua`,`jam_mulai_ketiga`,`jam_selesai_ketiga`,`ruang`) values 
(1,'AADC 2','Drama','09:00','12:45','11:30','13:00','10:15','12:45','A'),
(2,'Zootopia','Animasi','09:00','11:30','12:45','14:15','15:30','17:00','C'),
(3,'Single','Komedi','09:00','11:30','12:45','13:00','14:15','15:30','B'),
(4,'Petualangan Si Didit','Petualangan','09:00','11:30','12:45','14:15','15:30','17:00','B'),
(5,'Subar si Bolang','Dokumenter','09:00','12:45','13:00','15:30','16:45','17:00','C'),
(6,'Civil War','Laga','09:00','11:30','12:45','13:00','14:15','15:30','B'),
(7,'Harry Potter','Fantasi','09:00','11:30','12:45','14:15','15:30','17:00','C'),
(8,'Memedi','Horror','09:00','11:30','12:45','14:15','14:15','15:30','A'),
(9,'Modus','Komedi','09:00','11:30','12:45','13:00','14:15','16:45','A');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`username`,`password`) values 
('admin','admin');

/*Table structure for table `transaksi` */

DROP TABLE IF EXISTS `transaksi`;

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL AUTO_INCREMENT,
  `show` varchar(5) DEFAULT NULL,
  `nama_film` varchar(20) DEFAULT NULL,
  `barisan` varchar(5) DEFAULT NULL,
  `kelas` varchar(10) DEFAULT NULL,
  `kursi` varchar(5) DEFAULT NULL,
  `jumlah` varchar(5) DEFAULT NULL,
  `total_harga` int(8) DEFAULT NULL,
  PRIMARY KEY (`id_transaksi`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;

/*Data for the table `transaksi` */

insert  into `transaksi`(`id_transaksi`,`show`,`nama_film`,`barisan`,`kelas`,`kursi`,`jumlah`,`total_harga`) values 
(1,'2','Single','A','1','2','VIP',100000),
(2,'2','Single','A','1','2','VIP',100000),
(3,'2','Single','A','1','2','VIP',100000),
(4,'2','Single','A','1','2','VIP',100000),
(5,'2','Single','A','1','2','VIP',100000),
(6,'2','Single','A','1','2','VIP',100000),
(7,'2','Single','A','1','2','VIP',100000),
(8,'2','Zootopia','A','1','2','VIP',100000),
(9,'2','Zootopia','A','1','2','VIP',100000),
(10,'2','Zootopia','A','1','2','VIP',100000),
(11,'2','Zootopia','A','1','2','VIP',100000),
(12,'2','Zootopia','A','1','2','VIP',100000),
(13,'2','Zootopia','A','1','2','VIP',100000),
(14,'1','Zootopia','C','1','2','VIP',100000),
(15,'1','Zootopia','C','1','2','VIP',100000),
(16,'1','Zootopia','C','1','2','VIP',100000),
(17,'1','Zootopia','C','1','2','VIP',100000),
(18,'1','Zootopia','C','1','2','VIP',100000),
(19,'1','Zootopia','C','1','2','VIP',100000),
(20,'1','Zootopia','C','1','2','VIP',100000),
(21,'1','Zootopia','C','1','2','VIP',100000),
(22,'1','Zootopia','C','1','2','VIP',100000),
(23,'1','Zootopia','C','1','2','VIP',100000),
(24,'1','Zootopia','C','1','2','VIP',100000),
(25,'1','Zootopia','C','1','2','VIP',100000),
(26,'2','Subar si Bolang','C','1','1','VIP',100000),
(27,'2','Zootopia','B','1','1','VIP',100000),
(28,'1','Zootopia','B','2','6','VIP',200000),
(29,'3','Modus','A','1','17','VIP',100000);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
