/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.28 : Database - seoinfo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`seoinfo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `seoinfo`;

/*Table structure for table `advice` */

DROP TABLE IF EXISTS `advice`;

CREATE TABLE `advice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `weixinName` varchar(32) NOT NULL,
  `msg` varchar(512) DEFAULT NULL,
  `type` varchar(8) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `advice` */

/*Table structure for table `projdes` */

DROP TABLE IF EXISTS `projdes`;

CREATE TABLE `projdes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `projtype_id` int(11) NOT NULL,
  `title` varchar(32) DEFAULT NULL,
  `content` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `projtype_id` (`projtype_id`),
  CONSTRAINT `projdes_ibfk_1` FOREIGN KEY (`projtype_id`) REFERENCES `projtype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `projdes` */

insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (7,7,'aa','sssss'),(8,7,'bb','sssss'),(9,7,'cc','sssss'),(10,8,'aa','sssss'),(11,8,'bb','sssss'),(12,8,'cc','sssss'),(13,9,'ee','sssss'),(14,9,'ff','sssss'),(15,9,'gg','sssss'),(16,10,'tt','sssss'),(17,11,'yy','sssss'),(18,11,'uu','sssss'),(19,12,'ii','sssss');

/*Table structure for table `projinfo` */

DROP TABLE IF EXISTS `projinfo`;

CREATE TABLE `projinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `projtype_id` int(11) NOT NULL COMMENT '项目类型',
  `updateTime` datetime NOT NULL COMMENT '更新时间',
  `rateResult` varchar(128) DEFAULT NULL COMMENT '结果',
  `priceDes` varchar(512) DEFAULT NULL,
  `priceFileName` varchar(128) DEFAULT NULL,
  `detailDes` varchar(512) DEFAULT NULL,
  `detailFileName` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `projtype_id` (`projtype_id`),
  CONSTRAINT `projinfo_ibfk_1` FOREIGN KEY (`projtype_id`) REFERENCES `projtype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

/*Data for the table `projinfo` */

insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (22,7,'2016-01-23 14:34:51','xx98;ss99',NULL,'name1',NULL,'name2'),(23,8,'2016-01-23 14:34:52','xx98;ss99','des1','','des2',''),(24,9,'2016-01-23 14:34:54','xx98;ss99',NULL,'name3',NULL,'name4'),(25,10,'2016-01-23 14:34:56','xx98;ss99','des3','','des4',''),(26,11,'2016-01-23 14:34:57','',NULL,'','des',''),(27,12,'2016-01-23 14:35:00','xx98;ss99','des5','','des6','');

/*Table structure for table `projtype` */

DROP TABLE IF EXISTS `projtype`;

CREATE TABLE `projtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `projName` varchar(16) NOT NULL,
  `tabletype_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `tabletype_id` (`tabletype_id`),
  CONSTRAINT `projtype_ibfk_1` FOREIGN KEY (`tabletype_id`) REFERENCES `tabletype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `projtype` */

insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (7,'百度1',6),(8,'百度2',6),(9,'百度3',6),(10,'电商1',7),(11,'电商2',7),(12,'其他1',9);

/*Table structure for table `tabletype` */

DROP TABLE IF EXISTS `tabletype`;

CREATE TABLE `tabletype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tableName` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `tabletype` */

insert  into `tabletype`(`id`,`tableName`) values (6,'百度系'),(7,'电商系'),(8,'360系'),(9,'其他系');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(16) NOT NULL,
  `password` varchar(32) NOT NULL,
  `level` int(10) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
