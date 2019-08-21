# --- !Ups

create table comment (
    id int AUTO_INCREMENT primary key,
    roomId int not null,
    userName varchar(255) not null,
    comment varchar(255) not null,
    date TIMESTAMP not null,
);

create table room (
    id int AUTO_INCREMENT,
    name varchar(255) not null,
    createDate TIMESTAMP not null,
);


insert into room values (1,'testRoom','2019-08-03 12:05:55');
insert into room values (2,'testRoo','2019-08-04 12:05:55');


insert into comment values (1,1,'test','test','2019-08-09 12:05:55');
insert into comment values (2,1,'aaa','testtest','2019-08-09 13:05:00');
insert into comment values (3,1,'testaaa','aiueo','2019-08-09 13:06:09');
insert into comment values (4,1,'テスト','testtest','2019-08-09 13:09:00');
insert into comment values (5,1,'aaaaaaa','aiueo','2019-08-09 13:16:09');
