-- try to drop table
DROP TABLE zooshop.animals;

-- switch to zooshop DB
USE zooshop;

-- create table
CREATE TABLE animals (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(20) UNIQUE,
  color VARCHAR(20),
  feed VARCHAR(20)
);

INSERT INTO animals VALUES(DEFAULT, "cat", "black", "milk");
INSERT INTO animals VALUES(DEFAULT, "dog", "brown", "bone");
INSERT INTO animals VALUES(DEFAULT, "hamster", "brown", "carrot");
INSERT INTO animals VALUES(DEFAULT, "crow", "black", "seeds");
INSERT INTO animals VALUES(DEFAULT, "tortoise", "brown", "salad");
INSERT INTO animals VALUES(DEFAULT, "snake", "green", "mouse");