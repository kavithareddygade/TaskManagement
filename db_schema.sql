CREATE DATABASE  IF NOT EXISTS 'tasksdb';
USE 'tasksdb';

--
-- Table structure for table 't_tasks'
--

DROP TABLE IF EXISTS 't_tasks';

CREATE TABLE 't_tasks' (
  'id' int(11) NOT NULL AUTO_INCREMENT,
  'firstName' varchar(45) DEFAULT NOT NULL,
  'lastName' varchar(45) DEFAULT NOT NULL,
  'description' varchar(45) DEFAULT NULL,
  'date_created' datetime DEFAULT NULL,
  'finished' bit(1) DEFAULT b'0',
  PRIMARY KEY ('id')
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

