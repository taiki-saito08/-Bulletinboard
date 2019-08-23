# --- !Ups

create table userAccount (
    id int AUTO_INCREMENT primary key,
    name varchar(255) not null,
    mail varchar(255) not null,
    pass varchar(255) not null,
    date TIMESTAMP not null,
    comment varchar(255) not null,
    
);

insert into comment values (1,'テスト太郎','test@test.com','test','テストじゃない','2019-08-09 12:05:55');
insert into comment values (2,'名無しの太郎','test@test.com','12345','テストでも','2019-08-10 12:05:55');
