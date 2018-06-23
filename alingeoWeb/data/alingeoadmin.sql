/*
Navicat MySQL Data Transfer

Source Server         : 111.231.191.63
Source Server Version : 50640
Source Host           : 111.231.191.63:3306
Source Database       : alingeoAdmin

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2018-06-24 00:33:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('27');
INSERT INTO `hibernate_sequence` VALUES ('27');
INSERT INTO `hibernate_sequence` VALUES ('27');
INSERT INTO `hibernate_sequence` VALUES ('27');

-- ----------------------------
-- Table structure for t_center
-- ----------------------------
DROP TABLE IF EXISTS `t_center`;
CREATE TABLE `t_center` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_center
-- ----------------------------
INSERT INTO `t_center` VALUES ('1', '北京市太阳宫爱琴海购物中心三层', '北京', 'images/center/center-img.png', '北京太阳宫早教中心', '010-57458852');
INSERT INTO `t_center` VALUES ('2', '北京市朝阳朝阳区湖景东路9号新奥购物中心H2-07', '北京', 'images/center/center-img.png', '北京亚运村早教中心', '010-84377989');
INSERT INTO `t_center` VALUES ('3', '北京市昌平区回龙观西大街美国悦宝园早教中心（上品折扣三层西侧）', '北京', 'images/center/center-img.png', '北京回龙观早教中心', '010-60728989');
INSERT INTO `t_center` VALUES ('4', '北京市昌平昌平区天通中苑F区华联购物中心三层F3-23', '北京', 'images/center/center-img.png', '北京天通苑早教中心', '010-57859868');
INSERT INTO `t_center` VALUES ('5', '北京市顺义顺义金街华联购物中心3F南侧', '北京', 'images/center/center-img.png', '北京顺义早教中心', '010-53672955');
INSERT INTO `t_center` VALUES ('6', '北京市朝阳区青年路甘露园南里尚街购物中心2层', '北京', 'images/center/center-img.png', '北京甘露园早教中心', '010-85590058');
INSERT INTO `t_center` VALUES ('7', '北京市朝阳区东坝中路金隅嘉品Mall三层L3/17/19', '北京', 'images/center/center-img.png', '北京东坝早教中心', '010-65766011');
INSERT INTO `t_center` VALUES ('8', '北京市大兴区亦庄经济技术开发区科创五街经海二路北京城乡世纪广场三层', '北京', 'images/center/center-img.png', '北京大兴城乡世纪早教中心', '010-67851196');
INSERT INTO `t_center` VALUES ('9', '北京市丰台区大成路6号院1号楼物美大卖场一层', '北京', 'images/center/center-img.png', '北京丰台大成物美早教中心', '57115358');
INSERT INTO `t_center` VALUES ('10', '北京市丰台区草桥东路上品折扣三层', '北京', 'images/center/center-img.png', '北京丰台草桥上品早教中心', '01067560508');
INSERT INTO `t_center` VALUES ('11', '北京市石景山区苹果园南路9号乐活美汇三层', '北京', 'images/center/center-img.png', '北京苹果园早教中心', '010-68860030､68863510');
INSERT INTO `t_center` VALUES ('12', '北京市通州区新华西街61号怡佳家园2层8-1-15', '北京', 'images/center/center-img.png', '北京通州北苑早教中心', '010-60530122');

-- ----------------------------
-- Table structure for t_join
-- ----------------------------
DROP TABLE IF EXISTS `t_join`;
CREATE TABLE `t_join` (
  `id` bigint(20) NOT NULL,
  `content` text,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_join
-- ----------------------------
INSERT INTO `t_join` VALUES ('1', '111', 'elviswu@aaxischina.com', 'elvis wu', '18380448929', '加盟咨询');
INSERT INTO `t_join` VALUES ('2', '1111111111111', 'elviswu@aaxischina.com', 'elvis wu', '18380448929', '加盟咨询');
INSERT INTO `t_join` VALUES ('3', '1111111111111', 'elviswu@aaxischina.com', 'elvis wu', '18380448929', '加盟咨询');
INSERT INTO `t_join` VALUES ('4', 'qqqqqqqqqqqqqq', 'elviswu@aaxischina.com', 'elvis wu', '18380448929', '加盟咨询');
INSERT INTO `t_join` VALUES ('5', '1111111111111111', 'elviswu@aaxischina.com', 'elvis wu', '18380448929', '加盟咨询');
INSERT INTO `t_join` VALUES ('6', '1111111111111111', 'elviswu@aaxischina.com', 'elvis wu', '18380448929', '加盟咨询');
INSERT INTO `t_join` VALUES ('8', '1111111111111111', 'elviswu@aaxischina.com', 'elvis wu', '18380448929', '加盟咨询');
INSERT INTO `t_join` VALUES ('7', '1111111111111111', 'elviswu@aaxischina.com', 'elvis wu', '18380448929', '加盟咨询');
INSERT INTO `t_join` VALUES ('9', '1111111111111111', 'elviswu@aaxischina.com', 'elvis wu', '18380448929', '加盟咨询');
INSERT INTO `t_join` VALUES ('10', '1111111111111111', 'elviswu@aaxischina.com', 'elvis wu', '18380448929', '加盟咨询');
INSERT INTO `t_join` VALUES ('11', '1111111111111111', 'elviswu@aaxischina.com', 'elvis wu', '18380448929', '加盟咨询');
INSERT INTO `t_join` VALUES ('12', '111', 'admin@admin', 'elvis wu', '1', '加盟咨询');
INSERT INTO `t_join` VALUES ('13', '111', 'admin@admin', 'elvis wu', '1', '加盟咨询');
INSERT INTO `t_join` VALUES ('14', '1111', 'admin@admin', 'elvis wu', '18380448929', '加盟咨询');
INSERT INTO `t_join` VALUES ('15', '2111', 'elviswu@aaxischina.com', '1', '1', '加盟咨询');
INSERT INTO `t_join` VALUES ('16', '555', 'elviswu@aaxischina.com', '1', '1', '加盟咨询');
INSERT INTO `t_join` VALUES ('17', '11111', 'wuyaoiot@163.com', 'elvis wu', '1', '联系我们');

-- ----------------------------
-- Table structure for t_news
-- ----------------------------
DROP TABLE IF EXISTS `t_news`;
CREATE TABLE `t_news` (
  `id` bigint(20) NOT NULL,
  `content` text,
  `date` datetime DEFAULT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_news
-- ----------------------------
INSERT INTO `t_news` VALUES ('2', '这是一条测试新闻', '2018-06-23 16:26:23', 'http://website.rompy.cn/images/rompycenter/2018/06/15/598x464_20180615032616615.jpg', '夏至古装pa!');
INSERT INTO `t_news` VALUES ('3', '这是一条测试新闻', '2018-06-23 16:26:23', 'http://website.rompy.cn/images/rompycenter/2018/06/15/598x464_20180615032616615.jpg', '夏至古装pa!');

-- ----------------------------
-- Table structure for t_teacher
-- ----------------------------
DROP TABLE IF EXISTS `t_teacher`;
CREATE TABLE `t_teacher` (
  `id` bigint(20) NOT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  `introduce` text,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_teacher
-- ----------------------------
INSERT INTO `t_teacher` VALUES ('1', 'images/teacher/b.png', '尚老师从教三十余年，从事“对外汉语教学”及“多语种教育研究”；近二十年专注于通过培养儿童超常学习能力，改革教材教法、学法，实现儿童身心解放的事业，是教育改革的实践家。');
INSERT INTO `t_teacher` VALUES ('2', 'images/teacher/c.png', '尚老师是目前国内少数几位能同时培养孩子成功掌握几门语言的老师，国内多位能用英语写作诗歌、散文、小说的儿童少年出自他的门下。');
INSERT INTO `t_teacher` VALUES ('3', 'images/teacher/d.png', '在早教领域深度耕耘25年，创造了多个早教界的传奇，可能是为数不多的为英语国家编英语教材的中国老师。');
SET FOREIGN_KEY_CHECKS=1;
