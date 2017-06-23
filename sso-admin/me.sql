
create database sso;

create table u_user(
   id bigint primary key auto_increment not null comment '自增id',
   name varchar(128) not null comment '登录用户名',
   password varchar(256) not null default '' comment '登录密码',
   create_time datetime not null DEFAULT CURRENT_TIMESTAMP comment '更新时间',
   update_time datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '创建时间'
);


create table u_token(
   id bigint primary key auto_increment not null comment '自增id',
   user_id bigint not null comment '用户id',
   token varchar(1024) not null default '' comment 'token',
   expire_time datetime not null default CURRENT_TIMESTAMP comment '有效期至',
   create_time datetime not null DEFAULT CURRENT_TIMESTAMP comment '更新时间',
   update_time datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '创建时间'
);

alter table u_token add column 'is_active' tinyint not null default 0 comment 'token是否有效；0:失效；1:有效';


create table a_app(
   id int primary key auto_increment not null comment '自增id',
   code varchar(128) not null comment 'app code',
   name varchar(1024) not null default '' comment 'app名称',
   callback varchar(1024) not null default '' comment 'app回调地址',
   md5_salt varchar(1024) not null default '' comment 'app签名盐',
   create_time datetime not null DEFAULT CURRENT_TIMESTAMP comment '更新时间',
   update_time datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '创建时间'
);
