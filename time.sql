# To run it:
# mysql -u root -p < menu.sql
# enter pwd: goodyear123!@#

DROP DATABASE IF EXISTS objects_db;
CREATE DATABASE objects_db;
USE objects_db;
CREATE TABLE objects(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255),
	val TEXT
);
INSERT INTO objects (name, val) VALUES ("scheduleinfo", "INVALIDVAL");


