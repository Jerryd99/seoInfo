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

insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (1,14,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (4,15,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (5,15,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (6,16,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (7,16,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (8,16,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (9,17,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (10,17,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (11,17,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (12,18,'百度图片优化','通过优化技术，抢占百度图片搜索区域，达到提升品牌曝光量、纠正错误品牌形象、提升网站流量等目的。');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (13,19,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (14,19,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (15,20,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (16,21,'下拉优化','通过优化电商网站搜索下拉框，有效引导搜索行为，增加曝光，导入流量。');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (17,22,'排名优化','通过技术及其他方法，影响电商网站搜索结果页中的商品排名权重，达到提升排名的效果。');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (18,23,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (19,23,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (20,24,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (21,24,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (22,25,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (23,25,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (24,25,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (25,26,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (26,27,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (27,28,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (28,29,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (29,29,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (30,30,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (31,31,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');
insert  into `projdes`(`id`,`projtype_id`,`title`,`content`) values (32,32,'标题1','内容1内容1内容1内容1内容1内容1内容1内容1');

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

insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (1,14,'2016-01-27 09:43:49','pc:85%;移动:90%','很便宜很好很强大的','baidu_price_0126.docx','确实非常好','baidu_detail_0126.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (2,15,'2016-01-27 09:43:57','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (3,16,'2016-01-27 09:43:59','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (4,17,'2016-01-27 09:44:01','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (5,18,'2016-02-01 15:44:04','整体:90%','按照指数报价','upload/price3.jpg','','upload/baidupic.pptx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (6,19,'2016-01-27 09:44:09','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (7,20,'2016-01-27 09:44:11','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (8,21,'2016-02-01 14:44:14','整体:96.5%','按照指数报价','upload/price1.jpg','','upload/EC.pptx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (9,22,'2016-02-01 14:44:16','整体:65%','按照指数报价','upload/price2.jpg','','upload/EC.pptx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (10,23,'2016-01-27 09:44:18','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (11,24,'2016-01-27 09:44:20','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (12,25,'2016-01-27 09:44:22','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (13,26,'2016-01-27 09:44:24','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (14,27,'2016-01-27 09:44:26','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (15,28,'2016-01-27 09:44:28','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (16,29,'2016-01-27 09:44:30','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (17,30,'2016-01-27 09:44:32','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (18,31,'2016-01-27 09:44:33','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');
insert  into `projinfo`(`id`,`projtype_id`,`updateTime`,`rateResult`,`priceDes`,`priceFileName`,`detailDes`,`detailFileName`) values (19,32,'2016-01-27 09:44:35','pc:85%;移动:90%','很便宜很好很强大的','price1.docx','确实非常好','price2.docx');

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

insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (14,'百度排名',1);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (15,'百度下拉',1);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (16,'百度指数',1);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (17,'百姓口碑',1);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (18,'百度图片',1);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (19,'百度风云榜',1);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (20,'百度知心',1);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (21,'电商下拉',2);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (22,'电商排名',2);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (23,'新闻大平台',3);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (24,'普通新闻平台',3);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (25,'口碑平台',3);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (26,'下拉及相关搜索',3);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (27,'百度排名',4);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (28,'百度下拉',4);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (29,'360下拉',5);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (30,'360优化',5);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (31,'ASO',5);
insert  into `projtype`(`id`,`projName`,`tabletype_id`) values (32,'谷歌seo优化',5);

/*Table structure for table `tabletype` */

DROP TABLE IF EXISTS `tabletype`;

CREATE TABLE `tabletype` (
  `id` int(11) NOT NULL,
  `tableName` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tabletype` */

insert  into `tabletype`(`id`,`tableName`) values (1,'百度系');
insert  into `tabletype`(`id`,`tableName`) values (2,'电商系');
insert  into `tabletype`(`id`,`tableName`) values (3,'负面处理');
insert  into `tabletype`(`id`,`tableName`) values (4,'H5页面制作');
insert  into `tabletype`(`id`,`tableName`) values (5,'其他');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(128) NOT NULL,
  `email` varchar(128) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`nickname`,`email`) values (1,'JerryDD','99333566@qq.com');
insert  into `user`(`id`,`nickname`,`email`) values (3,'戴戴test123','ling.dai@winndoo.com');
insert  into `user`(`id`,`nickname`,`email`) values (4,'ghjjj3','994234423asd');
insert  into `user`(`id`,`nickname`,`email`) values (5,'z12','314476695@qq.com');
insert  into `user`(`id`,`nickname`,`email`) values (6,'咩咩羊2','dasdasd@dasdasdsa.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
