# Реалізація інформаційного та програмного забезпечення
```sql
-- Create the database if it does not exist
CREATE DATABASE IF NOT EXISTS db_course;

-- Switch to the database db_course
USE db_course;

-- Drop tables if they exist
DROP TABLE IF EXISTS statistic;
DROP TABLE IF EXISTS question;
DROP TABLE IF EXISTS answer;
DROP TABLE IF EXISTS assigned_survey;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS survey;
DROP TABLE IF EXISTS role;

-- Create the role table
CREATE TABLE role (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      name VARCHAR(255)
);

-- Create the user table
CREATE TABLE user (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      nickname VARCHAR(255) NOT NULL UNIQUE,
                      password VARCHAR(255) NOT NULL,
                      email VARCHAR(255) NOT NULL UNIQUE,
                      role_id BIGINT NOT NULL,
                      FOREIGN KEY (role_id) REFERENCES role(id)
);

-- Create the survey table
CREATE TABLE survey (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(255),
                        start_date DATE,
                        end_date DATE
);

-- Create the question table
CREATE TABLE question (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          description VARCHAR(255),
                          number BIGINT,
                          survey_id BIGINT NOT NULL,
                          FOREIGN KEY (survey_id) REFERENCES survey(id)
);

-- Create the answer table
CREATE TABLE answer (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        response TEXT,
                        question_id BIGINT NOT NULL,
                        FOREIGN KEY (question_id) REFERENCES question(id)
);

-- Create the statistic table
CREATE TABLE statistic (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           survey_id BIGINT NOT NULL,
                           FOREIGN KEY (survey_id) REFERENCES survey(id)
);

-- Create the assigned_survey table
CREATE TABLE assigned_survey (
                                 survey_id BIGINT NOT NULL,
                                 user_id BIGINT NOT NULL,
                                 PRIMARY KEY (survey_id, user_id),
                                 FOREIGN KEY (survey_id) REFERENCES survey(id),
                                 FOREIGN KEY (user_id) REFERENCES user(id)
);
```


