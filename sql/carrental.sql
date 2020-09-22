/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost:3306
 Source Schema         : carrental

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 03/09/2020 20:40:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_car
-- ----------------------------
DROP TABLE IF EXISTS `sys_car`;
CREATE TABLE `sys_car`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sitnum` int(11) NULL DEFAULT NULL,
  `cid` int(11) NULL DEFAULT NULL,
  `price` double(10, 2) NULL DEFAULT NULL,
  `number` int(11) NULL DEFAULT NULL,
  `picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_car
-- ----------------------------
INSERT INTO `sys_car` VALUES (1, '大众帕萨特', '手自一体', 5, 7, 249.00, 10, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97%E5%B8%95%E8%90%A8%E7%89%B9.png');
INSERT INTO `sys_car` VALUES (2, '别克GL8', '手自一体', 7, 7, 282.00, 8, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%88%AB%E5%85%8BGL8%EF%BC%88%E6%B2%AA%E7%89%8C%EF%BC%89.png');
INSERT INTO `sys_car` VALUES (3, '荣威E550', '自排', 5, 7, 400.00, 15, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E8%8D%A3%E5%A8%81E550.png');
INSERT INTO `sys_car` VALUES (4, '别克GL8(沪牌)', '自排', 7, 7, 510.00, 11, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E6%B1%9F%E6%B7%AE%E7%91%9E%E9%A3%8E8%E5%BA%A7.png');
INSERT INTO `sys_car` VALUES (5, '别克凯越', '自排', 5, 7, 180.00, 5, 'https://www.chesudi.com/static/img/onerrorcar.9ae6dcc.png');
INSERT INTO `sys_car` VALUES (6, '起亚K2', '自排', 5, 7, 69.00, 30, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E8%B5%B7%E4%BA%9AK2.png');
INSERT INTO `sys_car` VALUES (7, '大众', '自排', 5, 8, 89.00, 30, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (8, '福特福克斯', '自排', 5, 8, 90.00, 12, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E6%97%A5%E4%BA%A7%E9%98%B3%E5%85%89.png');
INSERT INTO `sys_car` VALUES (9, '尼桑阳光', '自排', 5, 9, 110.00, 20, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97%E6%8D%B7%E8%BE%BE.png');
INSERT INTO `sys_car` VALUES (10, '大众朗逸', '手自一体', 6, 8, 120.00, 30, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (11, '比亚迪秦', '自排', 7, 8, 150.00, 11, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E6%AF%94%E4%BA%9A%E8%BF%AA%E7%A7%A6.png');
INSERT INTO `sys_car` VALUES (12, '斯柯达明锐', '自排', 8, 9, 99.00, 20, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (13, '别克君越', '自排', 5, 9, 110.00, 10, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E9%80%9AG10%20%E6%B2%AA%E7%89%8C.png');
INSERT INTO `sys_car` VALUES (14, '日产阳光', '手自一体', 5, 9, 110.00, 30, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E6%97%A5%E4%BA%A7%E5%A4%A9%E7%B1%81.png');
INSERT INTO `sys_car` VALUES (15, '别克凯越', '手排', 6, 10, 130.00, 10, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (16, '传祺GS4-15', '自排', 5, 11, 115.00, 5, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E4%BC%A0%E7%A5%BAGS4-15%E8%B1%AA%E5%8D%8E%E7%89%88.png');
INSERT INTO `sys_car` VALUES (17, '大众', '自排', 5, 12, 110.00, 10, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97%E6%A1%91%E5%A1%94%E7%BA%B3%EF%BC%8813%E6%96%B0%E6%AC%BE%EF%BC%89.png');
INSERT INTO `sys_car` VALUES (18, '名爵MG5', '自排', 5, 13, 120.00, 10, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%90%8D%E7%88%B5MG5.png');
INSERT INTO `sys_car` VALUES (19, '名爵MG5', '自排', 5, 12, 120.00, 10, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%90%8D%E7%88%B5MG5.png');
INSERT INTO `sys_car` VALUES (20, '福特福克斯', '自排', 5, 13, 90.00, 12, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (21, '尼桑阳光', '自排', 5, 14, 110.00, 20, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (22, '大众朗逸', '手自一体', 6, 14, 120.00, 30, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (23, '比亚迪秦', '自排', 7, 14, 150.00, 11, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (24, '斯柯达明锐', '自排', 8, 15, 99.00, 20, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (25, '别克君越', '自排', 5, 15, 110.00, 10, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (26, '日产阳光', '手自一体', 5, 13, 110.00, 30, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (27, '别克凯越', '手排', 6, 11, 130.00, 10, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (28, '传祺GS4-15', '自排', 5, 10, 115.00, 5, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');
INSERT INTO `sys_car` VALUES (29, '大众', '自排', 5, 10, 120.00, 10, 'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');

-- ----------------------------
-- Table structure for sys_city
-- ----------------------------
DROP TABLE IF EXISTS `sys_city`;
CREATE TABLE `sys_city`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_city
-- ----------------------------
INSERT INTO `sys_city` VALUES (1, '上海', 0);
INSERT INTO `sys_city` VALUES (2, '广州', 0);
INSERT INTO `sys_city` VALUES (3, '深圳', 0);
INSERT INTO `sys_city` VALUES (7, '虹桥火车站接送点', 1);
INSERT INTO `sys_city` VALUES (8, '机场服务点', 1);
INSERT INTO `sys_city` VALUES (9, '足球场地铁站店', 1);
INSERT INTO `sys_city` VALUES (10, '天山店', 2);
INSERT INTO `sys_city` VALUES (11, '新白云机场A区停车场服务点', 2);
INSERT INTO `sys_city` VALUES (12, '天河客运站店', 2);
INSERT INTO `sys_city` VALUES (13, '番禺店', 3);
INSERT INTO `sys_city` VALUES (14, '华南城店', 3);
INSERT INTO `sys_city` VALUES (15, '宝安汽车站店', 3);

-- ----------------------------
-- Table structure for sys_order
-- ----------------------------
DROP TABLE IF EXISTS `sys_order`;
CREATE TABLE `sys_order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) NULL DEFAULT NULL,
  `uid` int(11) NULL DEFAULT NULL,
  `getid` int(11) NULL DEFAULT NULL,
  `backid` int(11) NULL DEFAULT NULL,
  `oprice` double(10, 2) NULL DEFAULT NULL,
  `status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_order
-- ----------------------------
INSERT INTO `sys_order` VALUES (1, 1, 1, 7, 7, 189.00, '已归还');
INSERT INTO `sys_order` VALUES (2, 19, 1, 12, 8, 205.00, '已预订');
INSERT INTO `sys_order` VALUES (3, 15, 1, 10, 8, 215.00, '已预订');
INSERT INTO `sys_order` VALUES (4, 11, 1, 8, 8, 235.00, '已预订');
INSERT INTO `sys_order` VALUES (5, 27, 1, 11, 12, 215.00, '已预订');
INSERT INTO `sys_order` VALUES (6, 19, 1, 12, 15, 205.00, '已预订');
INSERT INTO `sys_order` VALUES (7, 11, 7, 8, 9, 235.00, '已预订');
INSERT INTO `sys_order` VALUES (8, 11, 1, 8, 9, 235.00, '已预订');
INSERT INTO `sys_order` VALUES (9, 11, 1, 8, 9, 235.00, '已预订');
INSERT INTO `sys_order` VALUES (10, 15, 1, 10, 12, 215.00, '已预订');
INSERT INTO `sys_order` VALUES (11, 19, 1, 12, 15, 205.00, '已预订');
INSERT INTO `sys_order` VALUES (12, 19, 1, 12, 7, 205.00, '已预订');
INSERT INTO `sys_order` VALUES (13, 27, 1, 11, 15, 215.00, '已预订');
INSERT INTO `sys_order` VALUES (14, 1, 8, 7, 10, 334.00, '已预订');
INSERT INTO `sys_order` VALUES (15, 4, 8, 7, 13, 595.00, '已预订');
INSERT INTO `sys_order` VALUES (16, 1, 8, 7, 13, 334.00, '已预订');
INSERT INTO `sys_order` VALUES (17, 1, 8, 7, 13, 334.00, '已预订');
INSERT INTO `sys_order` VALUES (18, 2, 8, 7, 13, 367.00, '已预订');
INSERT INTO `sys_order` VALUES (19, 1, 8, 7, 13, 334.00, '已预订');
INSERT INTO `sys_order` VALUES (20, 1, 8, 7, 13, 334.00, '???');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tel` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `invitation` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, '13783078934', '123456', '563911475@qq.com', '');
INSERT INTO `sys_user` VALUES (2, '123456', '123456', '123466', NULL);
INSERT INTO `sys_user` VALUES (7, '13733975958', '123456', '563911475@qq.com', '123');
INSERT INTO `sys_user` VALUES (8, '123123', '123123', '123123@qq.com', NULL);
INSERT INTO `sys_user` VALUES (9, '12312312312', '123123', '123@qq.com', '');
INSERT INTO `sys_user` VALUES (10, '12312312311', '123123', '1231231@qq.com', '');
INSERT INTO `sys_user` VALUES (11, '12312312313', '123123', '123123@qq.com', '');

SET FOREIGN_KEY_CHECKS = 1;

drop table if exists user;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   varchar(20) not null,
   username             varchar(128),
   sex                  varchar(20),
   primary key (id)
);

alter table user comment '用户表';


CREATE TABLE `flow` (
  `id` varchar(20) NOT NULL,
  `flow_num` varchar(20) DEFAULT NULL COMMENT '流水号',
  `order_num` varchar(20) DEFAULT NULL COMMENT '订单号',
  `product_id` varchar(20) DEFAULT NULL COMMENT '产品主键ID',
  `paid_amount` varchar(11) DEFAULT NULL COMMENT '支付金额',
  `paid_method` int(11) DEFAULT NULL COMMENT '支付方式\r\n            1：支付宝\r\n            2：微信',
  `buy_counts` int(11) DEFAULT NULL COMMENT '购买个数',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='流水表';


CREATE TABLE `orders` (
  `id` varchar(20) NOT NULL,
  `order_num` varchar(20) DEFAULT NULL COMMENT '订单号',
  `order_status` varchar(20) DEFAULT NULL COMMENT '订单状态\r\n            10：待付款\r\n            20：已付款',
  `order_amount` varchar(11) DEFAULT NULL COMMENT '订单金额',
  `paid_amount` varchar(11) DEFAULT NULL COMMENT '实际支付金额',
  `product_id` varchar(20) DEFAULT NULL COMMENT '产品表外键ID',
  `buy_counts` int(11) DEFAULT NULL COMMENT '产品购买的个数',
  `create_time` datetime DEFAULT NULL COMMENT '订单创建时间',
  `paid_time` datetime DEFAULT NULL COMMENT '支付时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单表';


CREATE TABLE `product` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL COMMENT '产品名称',
  `price` varchar(11) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='产品表 ';


