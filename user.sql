create database user;
use database user;
CREATE TABLE login (
    username varchar,
    password varchar,
    
);
CREATE TABLE newuser (
firstname varchar,
lastname varchar,
dateofbirth varchar,
password varchar,
cpassword varchar,
cluequestion varchar,
answer varchar,
PRIMARY KEY (firstname,lastname),
);
CREATE TABLE forgotpassword (
firstname varchar,
lastname varchar,
dateofbirth varchar,
cluequestion varchar,
answer varchar,
PRIMARY KEY(firstname,lastname),
);


        