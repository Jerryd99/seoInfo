/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.1.73 : Database - seoinfo
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
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

/*Data for the table `projdes` */

insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (1,14,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(2,14,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(3,14,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(4,15,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(5,15,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(6,16,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(7,16,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(8,16,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(9,17,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(10,17,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(11,17,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(12,18,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(13,19,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(14,19,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(15,20,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(16,21,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(17,22,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(18,23,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(19,23,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(20,24,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(21,24,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(22,25,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(23,25,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(24,25,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(25,26,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(26,27,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(27,28,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(28,29,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(29,29,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(30,30,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(31,31,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1'),(32,32,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');

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
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `projinfo` */

insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (1,14,'2016-01-27 09:43:49','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(2,15,'2016-01-27 09:43:57','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(3,16,'2016-01-27 09:43:59','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(4,17,'2016-01-27 09:44:01','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(5,18,'2016-01-27 09:44:04','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(6,19,'2016-01-27 09:44:09','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(7,20,'2016-01-27 09:44:11','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(8,21,'2016-01-27 09:44:14','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(9,22,'2016-01-27 09:44:16','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(10,23,'2016-01-27 09:44:18','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(11,24,'2016-01-27 09:44:20','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(12,25,'2016-01-27 09:44:22','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(13,26,'2016-01-27 09:44:24','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(14,27,'2016-01-27 09:44:26','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(15,28,'2016-01-27 09:44:28','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(16,29,'2016-01-27 09:44:30','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(17,30,'2016-01-27 09:44:32','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(18,31,'2016-01-27 09:44:33','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx'),(19,32,'2016-01-27 09:44:35','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');

/*Table structure for table `projtype` */

DROP TABLE IF EXISTS `projtype`;

CREATE TABLE `projtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `projName` varchar(16) NOT NULL,
  `tabletype_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `tabletype_id` (`tabletype_id`),
  CONSTRAINT `projtype_ibfk_1` FOREIGN KEY (`tabletype_id`) REFERENCES `tabletype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

/*Data for the table `projtype` */

insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (14,'百度排名',1),(15,'百度下拉',1),(16,'百度指数',1),(17,'百姓口碑',1),(18,'百度图片',1),(19,'百度风云榜',1),(20,'百度知心',1),(21,'电商下拉',2),(22,'电商排名',2),(23,'新闻大平台',3),(24,'普通新闻平台',3),(25,'口碑平台',3),(26,'下拉及相关搜索',3),(27,'百度排名',4),(28,'百度下拉',4),(29,'360下拉',5),(30,'360优化',5),(31,'ASO',5),(32,'谷歌seo优化',5);

/*Table structure for table `tabletype` */

DROP TABLE IF EXISTS `tabletype`;

CREATE TABLE `tabletype` (
  `id` int(11) NOT NULL,
  `tableName` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tabletype` */

insert  into `tabletype`(`id`,`tableName`) values (1,'百度系'),(2,'电商系'),(3,'负面处理'),(4,'H5页面制作'),(5,'其他');

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
