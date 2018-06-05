/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : alingeoadmin

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-06-05 23:08:47
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
INSERT INTO `hibernate_sequence` VALUES ('1');

-- ----------------------------
-- Table structure for t_message
-- ----------------------------
DROP TABLE IF EXISTS `t_message`;
CREATE TABLE `t_message` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `message` text,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_message
-- ----------------------------
INSERT INTO `t_message` VALUES ('1', 'wuyaoiot@163.com', '中国家长最舍得为孩子投资教育：据《2016中国家庭教育消费者图谱》显示，约65%的家庭每年教育产品支出大于3000元，38.6%的家庭大于6000元！中国家长最舍得为孩子投资教育：据《2016中国家庭教育消费者图谱》显示，约65%的家庭每年教育产品支出大于3000元，38.6%的家庭大于6000元！中国家长最舍得为孩子投资教育：据《2016中国家庭教育消费者图谱》显示，约65%的家庭每年教育产品支出大于3000元，38.6%的家庭大于6000元！中国家长最舍得为孩子投资教育：据《2016中国家庭教育消费者图谱》显示，约65%的家庭每年教育产品支出大于3000元，38.6%的家庭大于6000元！', 'wuyao');
INSERT INTO `t_message` VALUES ('2', 'wuyaoiot@163.com', '中国家长最舍得为孩子投资教育：据《2016中国家庭教育消费者图谱》显示，约65%的家庭每年教育产品支出大于3000元，38.6%的家庭大于6000元！', 'wuyao');
INSERT INTO `t_message` VALUES ('3', 'wuyaoiot@163.com', '中国家长最舍得为孩子投资教育：据《2016中国家庭教育消费者图谱》显示，约65%的家庭每年教育产品支出大于3000元，38.6%的家庭大于6000元！', 'wuyao');
INSERT INTO `t_message` VALUES ('4', 'wuyaoiot@163.com', '中国家长最舍得为孩子投资教育：据《2016中国家庭教育消费者图谱》显示，约65%的家庭每年教育产品支出大于3000元，38.6%的家庭大于6000元！', 'wuyao');
SET FOREIGN_KEY_CHECKS=1;
