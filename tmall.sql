/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : tmall

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 23/06/2020 22:33:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cartdetail
-- ----------------------------
DROP TABLE IF EXISTS `cartdetail`;
CREATE TABLE `cartdetail`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `goodsid` int(11) NULL DEFAULT NULL,
  `num` int(11) NULL DEFAULT NULL,
  `money` double(255, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cartdetail
-- ----------------------------
INSERT INTO `cartdetail` VALUES (1, 1, 0, 5, 0);
INSERT INTO `cartdetail` VALUES (4, 1, 4, 1, 10);
INSERT INTO `cartdetail` VALUES (5, 1, 14, 1, 200);

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goodsid` int(11) NOT NULL AUTO_INCREMENT,
  `goodsname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `goodsprices` double(255, 0) NOT NULL,
  `pictersrc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `firmname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`goodsid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, '棒球服', 20, 'images/pi.jpg', '衣服服饰', NULL);
INSERT INTO `goods` VALUES (2, '西装', 30, 'images/pi1.jpg', '衣服服饰', NULL);
INSERT INTO `goods` VALUES (3, '连衣裙', 50, 'images/pi2.jpg', '衣服服饰', NULL);
INSERT INTO `goods` VALUES (4, '墨镜', 10, 'images/pi3.jpg', '衣服服饰', NULL);
INSERT INTO `goods` VALUES (5, '手提包', 60, 'images/pi4.jpg', '衣服服饰', NULL);
INSERT INTO `goods` VALUES (6, '毛衣', 20, 'images/pi5.jpg', '衣服服饰', NULL);
INSERT INTO `goods` VALUES (7, '连衣裙', 30, 'images/pi6.jpg', '衣服服饰', NULL);
INSERT INTO `goods` VALUES (8, '墨镜', 10, 'images/pi7.jpg', '衣服服饰', NULL);
INSERT INTO `goods` VALUES (9, '平板', 300, 'images/pic.jpg', '手机和平板', NULL);
INSERT INTO `goods` VALUES (10, '佳能相机', 400, 'images/pic1.jpg', '照相机', NULL);
INSERT INTO `goods` VALUES (11, '苹果手机', 500, 'images/pic2.jpg', '手机和平板', NULL);
INSERT INTO `goods` VALUES (12, '惠普笔记本', 600, 'images/pic3.jpg', '笔记本电脑', NULL);
INSERT INTO `goods` VALUES (13, 'intel主板', 1, 'images/pic4.jpg', '零件', NULL);
INSERT INTO `goods` VALUES (14, '学习通', 200, 'images/pic5.jpg', '手机和平板', NULL);
INSERT INTO `goods` VALUES (15, '神马相机', 200, 'images/pic6.jpg', '照相机', NULL);
INSERT INTO `goods` VALUES (16, '苹果8', 600, 'images/pic7.jpg', '手机和平板', NULL);
INSERT INTO `goods` VALUES (17, '掌上电脑', 100, 'images/pic8.jpg', '手机和平板', NULL);
INSERT INTO `goods` VALUES (18, 'i7处理器', 200, 'images/pic9.jpg', '零件', NULL);
INSERT INTO `goods` VALUES (19, '尼康相机', 600, 'images/pic10.jpg', '照相机', NULL);
INSERT INTO `goods` VALUES (20, '三星手机', 550, 'images/pic11.jpg', '手机和平板', '三星');
INSERT INTO `goods` VALUES (21, '燕尾服', 50, 'images/pi1.jpg', '衣服服饰', NULL);
INSERT INTO `goods` VALUES (22, '小米手机', 90, 'images/pi5.jpg', '手机和平板', NULL);
INSERT INTO `goods` VALUES (30, '小米8', 90, 'images/db6da3b684f14b9ca4d117214600d23e_3134.jpg', '手机和平板', '小米');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NULL DEFAULT NULL,
  `goodsid` int(11) NULL DEFAULT NULL,
  `num` int(11) NULL DEFAULT NULL,
  `money` double(255, 0) NULL DEFAULT NULL,
  `orderstime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, 1, 4, 1, 10, '2020-06-22 16:55:34');
INSERT INTO `orders` VALUES (2, 1, 17, 1, 100, '2020-06-22 16:55:34');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '929000967', '123');

SET FOREIGN_KEY_CHECKS = 1;
