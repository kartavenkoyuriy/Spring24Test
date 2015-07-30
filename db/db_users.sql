CREATE TABLE `db_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `isAdmin` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

INSERT INTO `my_db_test`.`db_users` (`login`, `password`, `isAdmin`) VALUES ('admin', 'admin', '1');
INSERT INTO `my_db_test`.`db_users` (`login`, `password`, `isAdmin`) VALUES ('user1', 'user1', '0');
INSERT INTO `my_db_test`.`db_users` (`login`, `password`, `isAdmin`) VALUES ('user2', 'user2', '0');
INSERT INTO `my_db_test`.`db_users` (`login`, `password`, `isAdmin`) VALUES ('vasya', 'vasya', '0');