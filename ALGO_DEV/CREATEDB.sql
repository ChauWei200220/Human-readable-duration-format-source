CREATE DATABASE DB
USE DB
CREATE TABLE IOHISTORY
(
STT int PRIMARY KEY,
Input int not null,
Output text not null,
DateAndTime datetime not null
)