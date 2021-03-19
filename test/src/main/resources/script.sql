CREATE DATABASE dans_final_test;
USE dans_final_test;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `login_code` varchar(45) DEFAULT NULL,
  `password` varchar(250) DEFAULT NULL,
  `created_by` int DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `created_at` date DEFAULT NULL,
  `updated_at` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `package_activation` (
  `activation_id` int NOT NULL AUTO_INCREMENT,
  `transaction_id` varchar(45) DEFAULT NULL,
  `msisdn` varchar(45) DEFAULT NULL,
  `product_id` varchar(45) DEFAULT NULL,
  `product_name` varchar(45) DEFAULT NULL,
  `created_at` varchar(45) DEFAULT NULL,
  `created_by` int DEFAULT NULL,
  `updated_at` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `product_price` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`activation_id`),
  KEY `created_by` (`created_by`),
  CONSTRAINT `package_activation_ibfk_1` FOREIGN KEY (`created_by`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- insert this data for login
-- '6', 'karim', NULL, '$2a$12$oo3azRHycD3WJA8.GT9nv.mVM1ZDa/JdU5qOdvk0TxT.K/zXp.VbC', '0', '0', 'rkarimmalik1210@gmail.com', '2021-03-17', '2021-03-17'
-- "username" : "rkarimmalik1210@gmail.com",
-- "password" : "123123" 