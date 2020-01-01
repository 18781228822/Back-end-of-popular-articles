/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 02/01/2020 01:18:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for discover
-- ----------------------------
DROP TABLE IF EXISTS `discover`;
CREATE TABLE `discover`  (
  `Aid` int(11) NOT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`Aid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discover
-- ----------------------------
INSERT INTO `discover` VALUES (2, '程前', '一包烟', '2020-01-02 00:25:54');
INSERT INTO `discover` VALUES (3, '樊宇', '一道概率', '2020-01-02 00:26:08');
INSERT INTO `discover` VALUES (4, '朱攀', '算一天', '2020-01-02 00:26:14');
INSERT INTO `discover` VALUES (5, '曾宏宇', '哎 难受', '2020-01-02 00:26:21');

SET FOREIGN_KEY_CHECKS = 1;
