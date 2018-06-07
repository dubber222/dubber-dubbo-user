CREATE TABLE `user`(
id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(10),
`balance` DECIMAL(10,2),
`mobile` VARCHAR(11)
);

DESC `user`;
SELECT * FROM `user`;
INSERT `user`(`name`,`balance`,`mobile`) VALUES('anan2',0.0,'18703699082');