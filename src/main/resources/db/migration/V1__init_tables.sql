create table departments
(
    id   bigint auto_increment,
    name varchar(256) null,
    constraint department_pk
        primary key (id)
);

create table teachers
(
    id   bigint auto_increment,
    name varchar(256) null,
    surname varchar(256) null,
    email varchar(256) null,
        constraint teacher_pk
            primary key (id)
);

create table classes
(
    id            bigint auto_increment,
    name          varchar(256) null,
    teacher_id    bigint       null,
    department_id bigint       null,
    constraint class_pk
        primary key (id),
    constraint class_departments_id_fk
        foreign key (department_id) references departments (id),
    constraint class_teachers_id_fk
        foreign key (teacher_id) references teachers (id)
);

