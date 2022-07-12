/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : course_selection_system

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2022-07-12 16:58:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminId` varchar(255) NOT NULL,
  `adminPwd` varchar(255) NOT NULL,
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '1');
INSERT INTO `admin` VALUES ('admin', 'admin');

-- ----------------------------
-- Table structure for curriculum
-- ----------------------------
DROP TABLE IF EXISTS `curriculum`;
CREATE TABLE `curriculum` (
  `curId` varchar(255) NOT NULL,
  `curName` varchar(255) NOT NULL,
  `curBefore` varchar(255) NOT NULL,
  `curScore` varchar(255) NOT NULL,
  `teaId` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of curriculum
-- ----------------------------
INSERT INTO `curriculum` VALUES ('1', '1', '1', '1', '1');
INSERT INTO `curriculum` VALUES ('5', '5', '5', '5', '1');
INSERT INTO `curriculum` VALUES ('1', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for selection
-- ----------------------------
DROP TABLE IF EXISTS `selection`;
CREATE TABLE `selection` (
  `curId` varchar(255) NOT NULL,
  `stuId` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of selection
-- ----------------------------
INSERT INTO `selection` VALUES ('1', '1');
INSERT INTO `selection` VALUES ('1', '2');
INSERT INTO `selection` VALUES ('1', '3');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stuId` varchar(255) NOT NULL,
  `stuPwd` varchar(255) NOT NULL,
  `stuName` varchar(255) NOT NULL,
  `stuSex` varchar(255) NOT NULL,
  `stuCardId` varchar(255) NOT NULL,
  `stuClass` varchar(255) NOT NULL,
  PRIMARY KEY (`stuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '3', '3', '3', '3', '3');
INSERT INTO `student` VALUES ('2', '2', '2', '2', '2', '2');
INSERT INTO `student` VALUES ('3', '3', '3', '3', '3', '3');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teaId` varchar(255) NOT NULL,
  `teaPwd` varchar(255) NOT NULL,
  `teaName` varchar(255) NOT NULL,
  `teaTitle` varchar(255) NOT NULL,
  `teaSex` varchar(255) NOT NULL,
  PRIMARY KEY (`teaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '1', '1', '1', '1');
INSERT INTO `teacher` VALUES ('2', '', '2', 'null', '2');
INSERT INTO `teacher` VALUES ('3', '', '3', 'null', '3');
INSERT INTO `teacher` VALUES ('8', '9', '9', '9', '9');
INSERT INTO `teacher` VALUES ('9', '10', '10', '10', '10');
