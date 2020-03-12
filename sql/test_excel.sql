/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.56 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET gbk */;

USE `test`;

/*Table structure for table `test_excel` */

DROP TABLE IF EXISTS `test_excel`;

CREATE TABLE `test_excel` (
  `name` varchar(100) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `phone_number` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `test_excel` */

insert  into `test_excel`(`name`,`user_name`,`phone_number`) values ('小明','xiaoming','12345678910'),('小红','xiaohong','12378945630'),('小强','xiaoqiang','12378945690'),('小肖','xiaoxiao','12378945670');

/*Table structure for table `test_spring` */

DROP TABLE IF EXISTS `test_spring`;

CREATE TABLE `test_spring` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=gbk;

/*Data for the table `test_spring` */

insert  into `test_spring`(`id`,`name`,`age`) values (1,'测试',20),(14,'小敏',20),(15,'小强',20),(16,'小懒',20),(17,'小红',20),(18,'小虎',20),(19,'小明',20);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
