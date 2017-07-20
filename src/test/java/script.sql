CREATE TABLE institution (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  url varchar(100) DEFAULT NULL,
  nameInstitution varchar(60) DEFAULT NULL,
  summary varchar(100) DEFAULT NULL,
  description varchar(200) DEFAULT NULL,
  address varchar(80) DEFAULT NULL,
  phone varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
);


