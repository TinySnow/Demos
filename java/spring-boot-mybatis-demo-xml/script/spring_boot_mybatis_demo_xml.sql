DROP DATABASE IF EXISTS `spring_boot_mybatis_demo_xml`;

CREATE DATABASE `spring_boot_mybatis_demo_xml`;

USE `spring_boot_mybatis_demo_xml`;

CREATE TABLE `user`  (
  `id` bigint NOT NULL,
  `username` varchar(255) NULL,
  `password` varchar(255) NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO user (id, username, password) VALUES (1, 'user', 'password');