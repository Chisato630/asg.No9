DROP TABLE IF EXISTS names;

CREATE TABLE names (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 PRIMARY KEY(id)
);

INSERT INTO names (name) VALUES ('bernard');
INSERT INTO names (name) VALUES ('billy');
INSERT INTO names (name) VALUES ('brian');
INSERT INTO names (name) VALUES ('ben');
INSERT INTO names (name) VALUES ('bobby');
