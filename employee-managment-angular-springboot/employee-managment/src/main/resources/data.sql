DROP TABLE IF EXISTS department;

CREATE TABLE department (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  departmentname VARCHAR(250) NOT NULL
);

INSERT INTO department (departmentname) VALUES ('IT');
INSERT INTO department (departmentname) VALUES ('HR');
INSERT INTO department (departmentname) VALUES ('Account');

