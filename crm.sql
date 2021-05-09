/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : crm

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 09/05/2021 14:17:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客服名字',
  `age` bigint(0) NULL DEFAULT NULL,
  `gender` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客户性别',
  `tel` bigint(0) NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `qq` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `wechat` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `job` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `salaryLevel` decimal(12, 2) NULL DEFAULT NULL COMMENT '收入水平',
  `source` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客户来源',
  `seller` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责人',
  `inputUser` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `inputTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `status` bigint(0) NULL DEFAULT NULL COMMENT '状态',
  `positiveTime` datetime(0) NULL DEFAULT NULL COMMENT '转正时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 146 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (2, 'lzb', 21, '男', 21312321, '3123123das', '121212', 'das2312', 'ceo', 12321.00, '西安', 'dasda', 'fgdg', '2021-05-06 22:38:31', 0, '2021-05-07 22:38:39');
INSERT INTO `customer` VALUES (5, 'lzb', 21, 'nan', 12131, '321312', '321312', '21312', 'student', 12321.00, 'dsad', 'dasd', 'fgdg', '2021-05-06 22:38:31', -2, '2021-05-07 22:38:39');
INSERT INTO `customer` VALUES (6, 'lzb', 21, 'nan', 12131, '321312', '321312', '21312', 'student', 12321.00, 'dsad', 'dasd', 'fgdg', '2021-05-06 22:38:31', 0, '2021-05-07 22:38:39');
INSERT INTO `customer` VALUES (7, 'lzb', 21, 'nan', 12131, '321312', '321312', '21312', 'student', 12321.00, 'dsad', 'dasd', 'fgdg', '2021-05-06 22:38:31', 0, '2021-05-07 22:38:39');
INSERT INTO `customer` VALUES (8, 'lzb22', 21, 'nan', 1213122, '321312', '32131222', '21312', 'student22', 12321.00, 'dasd', 'dasd', 'fgdg', '2021-05-06 22:38:31', 2, '2021-05-07 22:38:39');
INSERT INTO `customer` VALUES (146, 'dd', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `customer` VALUES (147, 'das', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `sn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (17, 'General Department', '总经办');
INSERT INTO `department` VALUES (23, 'asdasddd', 'dsadddd');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `realname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `deptId` bigint(0) NULL DEFAULT NULL,
  `inputTime` datetime(0) NULL DEFAULT NULL,
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `admin` tinyint(0) NULL DEFAULT NULL,
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `parentId` int(0) NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `href` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spread` bit(1) NULL DEFAULT NULL,
  `target` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sort` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES (1, 0, '系统管理', NULL, NULL, b'0', '_self', 99);
INSERT INTO `menu` VALUES (2, 1, '部门管理', '', 'page/system/department.html', b'0', '_self', 98);
INSERT INTO `menu` VALUES (3, 1, '员工管理', '', NULL, b'0', '_self', 97);
INSERT INTO `menu` VALUES (4, 1, '权限管理', NULL, NULL, b'0', '_self', 96);
INSERT INTO `menu` VALUES (5, 1, '角色管理', NULL, NULL, b'0', '_self', 95);
INSERT INTO `menu` VALUES (6, 0, '数据管理', NULL, NULL, b'0', '_self', 94);
INSERT INTO `menu` VALUES (7, 6, '字典目录', NULL, '', b'0', '_self', 93);
INSERT INTO `menu` VALUES (8, 6, '字典明细', NULL, NULL, b'0', '_self', 92);
INSERT INTO `menu` VALUES (9, 0, '客户管理', NULL, NULL, b'0', '_self', 91);
INSERT INTO `menu` VALUES (10, 9, '客户列表', NULL, NULL, b'0', '_self', 90);
INSERT INTO `menu` VALUES (11, 9, '潜在客户', NULL, 'page/customer/prospectcustomer.html', b'0', '_self', 89);
INSERT INTO `menu` VALUES (12, 9, '客户地', NULL, NULL, b'0', '_self', 88);
INSERT INTO `menu` VALUES (13, 9, '失败客户', NULL, NULL, b'0', '_self', 87);
INSERT INTO `menu` VALUES (14, 9, '正式客户', NULL, NULL, b'0', '_self', 86);
INSERT INTO `menu` VALUES (15, 9, '流失客户', NULL, NULL, b'0', '_self', 85);
INSERT INTO `menu` VALUES (16, 0, '客户历史', NULL, NULL, b'0', '_self', 84);
INSERT INTO `menu` VALUES (17, 16, '跟进历史', NULL, NULL, b'0', '_self', 83);
INSERT INTO `menu` VALUES (18, 16, '移交历史', NULL, NULL, b'0', '_self', 82);
INSERT INTO `menu` VALUES (19, 0, '报表统计', NULL, NULL, b'0', '_self', 81);
INSERT INTO `menu` VALUES (20, 19, '潜在客户表报', NULL, NULL, b'0', '_self', 80);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'fsbx', 'fsbx');
INSERT INTO `user` VALUES (2, 'lzbb', 'lzbb');

SET FOREIGN_KEY_CHECKS = 1;
