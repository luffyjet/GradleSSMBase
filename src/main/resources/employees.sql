/*
 Navicat MySQL Data Transfer

 Source Server         : mysql at centos
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : 10.211.55.8
 Source Database       : employees

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 05/22/2017 09:49:03 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `article`
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `content` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `article`
-- ----------------------------
BEGIN;
INSERT INTO `article` VALUES ('1', '1', 'test_title', 'test_content'), ('2', '1', 'test_title_2', 'test_content_2'), ('3', '1', 'test_title_3', 'test_content_3'), ('4', '1', 'test_title_4', 'test_content_4');
COMMIT;

-- ----------------------------
--  Table structure for `country`
-- ----------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `countryname` varchar(255) DEFAULT NULL COMMENT '名称',
  `countrycode` varchar(255) DEFAULT NULL COMMENT '代码',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=184 DEFAULT CHARSET=utf8 COMMENT='国家信息';

-- ----------------------------
--  Records of `country`
-- ----------------------------
BEGIN;
INSERT INTO `country` VALUES ('1', 'Angola', 'AO'), ('2', 'Afghanistan', 'AF'), ('3', 'Albania', 'AL'), ('4', 'Algeria', 'DZ'), ('5', 'Andorra', 'AD'), ('6', 'Anguilla', 'AI'), ('7', 'Antigua and Barbuda', 'AG'), ('8', 'Argentina', 'AR'), ('9', 'Armenia', 'AM'), ('10', 'Australia', 'AU'), ('11', 'Austria', 'AT'), ('12', 'Azerbaijan', 'AZ'), ('13', 'Bahamas', 'BS'), ('14', 'Bahrain', 'BH'), ('15', 'Bangladesh', 'BD'), ('16', 'Barbados', 'BB'), ('17', 'Belarus', 'BY'), ('18', 'Belgium', 'BE'), ('19', 'Belize', 'BZ'), ('20', 'Benin', 'BJ'), ('21', 'Bermuda Is.', 'BM'), ('22', 'Bolivia', 'BO'), ('23', 'Botswana', 'BW'), ('24', 'Brazil', 'BR'), ('25', 'Brunei', 'BN'), ('26', 'Bulgaria', 'BG'), ('27', 'Burkina-faso', 'BF'), ('28', 'Burma', 'MM'), ('29', 'Burundi', 'BI'), ('30', 'Cameroon', 'CM'), ('31', 'Canada', 'CA'), ('32', 'Central African Republic', 'CF'), ('33', 'Chad', 'TD'), ('34', 'Chile', 'CL'), ('35', 'China', 'CN'), ('36', 'Colombia', 'CO'), ('37', 'Congo', 'CG'), ('38', 'Cook Is.', 'CK'), ('39', 'Costa Rica', 'CR'), ('40', 'Cuba', 'CU'), ('41', 'Cyprus', 'CY'), ('42', 'Czech Republic', 'CZ'), ('43', 'Denmark', 'DK'), ('44', 'Djibouti', 'DJ'), ('45', 'Dominica Rep.', 'DO'), ('46', 'Ecuador', 'EC'), ('47', 'Egypt', 'EG'), ('48', 'EI Salvador', 'SV'), ('49', 'Estonia', 'EE'), ('50', 'Ethiopia', 'ET'), ('51', 'Fiji', 'FJ'), ('52', 'Finland', 'FI'), ('53', 'France', 'FR'), ('54', 'French Guiana', 'GF'), ('55', 'Gabon', 'GA'), ('56', 'Gambia', 'GM'), ('57', 'Georgia', 'GE'), ('58', 'Germany', 'DE'), ('59', 'Ghana', 'GH'), ('60', 'Gibraltar', 'GI'), ('61', 'Greece', 'GR'), ('62', 'Grenada', 'GD'), ('63', 'Guam', 'GU'), ('64', 'Guatemala', 'GT'), ('65', 'Guinea', 'GN'), ('66', 'Guyana', 'GY'), ('67', 'Haiti', 'HT'), ('68', 'Honduras', 'HN'), ('69', 'Hongkong', 'HK'), ('70', 'Hungary', 'HU'), ('71', 'Iceland', 'IS'), ('72', 'India', 'IN'), ('73', 'Indonesia', 'ID'), ('74', 'Iran', 'IR'), ('75', 'Iraq', 'IQ'), ('76', 'Ireland', 'IE'), ('77', 'Israel', 'IL'), ('78', 'Italy', 'IT'), ('79', 'Jamaica', 'JM'), ('80', 'Japan', 'JP'), ('81', 'Jordan', 'JO'), ('82', 'Kampuchea (Cambodia )', 'KH'), ('83', 'Kazakstan', 'KZ'), ('84', 'Kenya', 'KE'), ('85', 'Korea', 'KR'), ('86', 'Kuwait', 'KW'), ('87', 'Kyrgyzstan', 'KG'), ('88', 'Laos', 'LA'), ('89', 'Latvia', 'LV'), ('90', 'Lebanon', 'LB'), ('91', 'Lesotho', 'LS'), ('92', 'Liberia', 'LR'), ('93', 'Libya', 'LY'), ('94', 'Liechtenstein', 'LI'), ('95', 'Lithuania', 'LT'), ('96', 'Luxembourg', 'LU'), ('97', 'Macao', 'MO'), ('98', 'Madagascar', 'MG'), ('99', 'Malawi', 'MW'), ('100', 'Malaysia', 'MY'), ('101', 'Maldives', 'MV'), ('102', 'Mali', 'ML'), ('103', 'Malta', 'MT'), ('104', 'Mauritius', 'MU'), ('105', 'Mexico', 'MX'), ('106', 'Moldova, Republic of', 'MD'), ('107', 'Monaco', 'MC'), ('108', 'Mongolia', 'MN'), ('109', 'Montserrat Is', 'MS'), ('110', 'Morocco', 'MA'), ('111', 'Mozambique', 'MZ'), ('112', 'Namibia', 'NA'), ('113', 'Nauru', 'NR'), ('114', 'Nepal', 'NP'), ('115', 'Netherlands', 'NL'), ('116', 'New Zealand', 'NZ'), ('117', 'Nicaragua', 'NI'), ('118', 'Niger', 'NE'), ('119', 'Nigeria', 'NG'), ('120', 'North Korea', 'KP'), ('121', 'Norway', 'NO'), ('122', 'Oman', 'OM'), ('123', 'Pakistan', 'PK'), ('124', 'Panama', 'PA'), ('125', 'Papua New Cuinea', 'PG'), ('126', 'Paraguay', 'PY'), ('127', 'Peru', 'PE'), ('128', 'Philippines', 'PH'), ('129', 'Poland', 'PL'), ('130', 'French Polynesia', 'PF'), ('131', 'Portugal', 'PT'), ('132', 'Puerto Rico', 'PR'), ('133', 'Qatar', 'QA'), ('134', 'Romania', 'RO'), ('135', 'Russia', 'RU'), ('136', 'Saint Lueia', 'LC'), ('137', 'Saint Vincent', 'VC'), ('138', 'San Marino', 'SM'), ('139', 'Sao Tome and Principe', 'ST'), ('140', 'Saudi Arabia', 'SA'), ('141', 'Senegal', 'SN'), ('142', 'Seychelles', 'SC'), ('143', 'Sierra Leone', 'SL'), ('144', 'Singapore', 'SG'), ('145', 'Slovakia', 'SK'), ('146', 'Slovenia', 'SI'), ('147', 'Solomon Is', 'SB'), ('148', 'Somali', 'SO'), ('149', 'South Africa', 'ZA'), ('150', 'Spain', 'ES'), ('151', 'Sri Lanka', 'LK'), ('152', 'St.Lucia', 'LC'), ('153', 'St.Vincent', 'VC'), ('154', 'Sudan', 'SD'), ('155', 'Suriname', 'SR'), ('156', 'Swaziland', 'SZ'), ('157', 'Sweden', 'SE'), ('158', 'Switzerland', 'CH'), ('159', 'Syria', 'SY'), ('160', 'Taiwan', 'TW'), ('161', 'Tajikstan', 'TJ'), ('162', 'Tanzania', 'TZ'), ('163', 'Thailand', 'TH'), ('164', 'Togo', 'TG'), ('165', 'Tonga', 'TO'), ('166', 'Trinidad and Tobago', 'TT'), ('167', 'Tunisia', 'TN'), ('168', 'Turkey', 'TR'), ('169', 'Turkmenistan', 'TM'), ('170', 'Uganda', 'UG'), ('171', 'Ukraine', 'UA'), ('172', 'United Arab Emirates', 'AE'), ('173', 'United Kiongdom', 'GB'), ('174', 'United States of America', 'US'), ('175', 'Uruguay', 'UY'), ('176', 'Uzbekistan', 'UZ'), ('177', 'Venezuela', 'VE'), ('178', 'Vietnam', 'VN'), ('179', 'Yemen', 'YE'), ('180', 'Yugoslavia', 'YU'), ('181', 'Zimbabwe', 'ZW'), ('182', 'Zaire', 'ZR'), ('183', 'Zambia', 'ZM');
COMMIT;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `userAge` int(11) DEFAULT NULL,
  `userAddress` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', 'summer', '100', 'shanghai,pudong');
COMMIT;

-- ----------------------------
--  Table structure for `websites`
-- ----------------------------
DROP TABLE IF EXISTS `websites`;
CREATE TABLE `websites` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(20) NOT NULL DEFAULT '' COMMENT '站点名称',
  `url` varchar(255) NOT NULL DEFAULT '',
  `alexa` int(11) NOT NULL DEFAULT '0' COMMENT 'Alexa 排名',
  `country` char(10) NOT NULL DEFAULT '' COMMENT '国家',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `websites`
-- ----------------------------
BEGIN;
INSERT INTO `websites` VALUES ('1', 'Google', 'https://www.google.cm/', '1', 'USA'), ('2', '淘宝', 'https://www.taobao.com/', '13', 'CN'), ('3', '菜鸟教程', 'http://www.runoob.com/', '4689', 'CN'), ('4', '微博', 'http://weibo.com/', '20', 'CN'), ('5', 'Facebook', 'https://www.facebook.com/', '3', 'USA'), ('9', '智慧园区', 'http://www.wiseyq.com', '20000', 'CN');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
