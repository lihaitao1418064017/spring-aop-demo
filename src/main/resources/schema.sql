drop table t_student if exists;
drop table t_teacher if exists;
drop table t_teacher_student if exists;
drop table t_log if EXISTS ;

create table t_student (
    id bigint auto_increment,
    create_time timestamp,
    update_time timestamp,
    name varchar(255),
    age bigint,
    primary key (id)
);

create table t_teacher (
    id bigint auto_increment,
    create_time timestamp,
    update_time timestamp,
    name varchar(255),
    age bigint,
    status integer not null,
    primary key (id)
);

create table t_teacher_student (
    id bigint auto_increment,
    student_teacher_id bigint not null,
    students_id bigint not null,
    create_time timestamp,
    update_time timestamp,
      primary key (id)
);

create table t_log(
    id bigint auto_increment,
    create_time timestamp ,
    update_time timestamp,
    user varchar(255),
    descp varchar(255),
     method varchar(255),
    url varchar(255),
    params VARCHAR(255) ,
    primary key (id)
);

create table t_shop(
    id bigint auto_increment,
    create_time timestamp ,
    update_time timestamp,
    shop_name varchar(255),
    shop_total bigint,
    primary key (id)
);