--DATABASE-NAME
CREATE TABLE user_management_db;

USE user_management_db;

GRANT ALL PRIVILEGES ON user_management_db.* TO 'root'@'localhost';

CREATE TABLE USERS(
    user_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY(user_id)
);