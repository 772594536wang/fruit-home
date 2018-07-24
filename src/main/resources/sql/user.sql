CREATE TABLE `user` (
  `id` int(32) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `telephone` varchar(255) DEFAULT NULL COMMENT '电话',
  `city` varchar(255) DEFAULT NULL COMMENT '用户所在城市',
  `role_type` varchar(11) DEFAULT NULL COMMENT '角色类型：1雇主2车主3兼职',
  `experience` varchar(500) DEFAULT NULL COMMENT '经验',
  `real_name` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `gender` varchar(50) DEFAULT NULL COMMENT '性别',
  `identity_card_no` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `audit_status` int(11) DEFAULT NULL COMMENT '审核状态',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;