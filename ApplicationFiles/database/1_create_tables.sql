--If necessary
--use toeiconline;

create table user(
	userid bigint not null primary key auto_increment,
    name varchar(255) null,
    password varchar(255) null,
    fullname varchar(300) null,
    createdate timestamp null
);

create table role(
	roleid bigint not null primary key,
    name varchar(100) null
);

--alter table add constraint foreign key to user, role
alter table user add column roleid bigint;
alter table user add constraint fk_user_role foreign key (roleid) references role(roleid);

create table listenguideline (
  listenguidelineid bigint not null primary key auto_increment,
  title varchar(512) null,
  image varchar(255) null,
  content text null,
  createdate timestamp null,
  modifieddate timestamp null
);

create table comment (
  commentid bigint not null primary key auto_increment,
  content text null,
  userid bigint null,
  listenguidelineid bigint null,
  createdate timestamp null
);
-- user 1-n comment n
alter table comment add constraint fk_user_commenr foreign key (userid) references user(userid);
alter table comment add constraint fk_listenguideline_commenr foreign key (listenguidelineid) references listenguideline(listenguidelineid);
