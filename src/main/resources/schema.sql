drop table if exists books, clients, telephones, washing_machines;

create table if not exists books
(
    id           bigint generated by default as identity not null,
    author       varchar(255)                            not null,
    product_type varchar(255)                            not null,
    cost         integer                                 not null,
    name         varchar(255)                            not null,
    constraint pk_book primary key (id)
);

create table if not exists clients
(
    id       bigint generated by default as identity not null,
    name     varchar(255)                            not null,
    email    varchar(255)                            not null,
    login    varchar(255)                            not null,
    password varchar(255)                            not null,
    constraint pk_client primary key (id)
);

create table if not exists telephones
(
    id             bigint generated by default as identity not null,
    creator        varchar(255)                            not null,
    battery_volume integer                                 not null,
    seller_id      integer                                 not null,
    product_type   varchar(255)                            not null,
    cost           integer                                 not null,
    name           varchar(255)                            not null,
    constraint pk_telephones primary key (id)
);

create table if not exists washing_machines
(
    id           bigint generated by default as identity not null,
    seller_id    integer                                 not null,
    tank_volume  integer                                 not null,
    product_type varchar(255)                            not null,
    cost         integer                                 not null,
    name         varchar(255)                            not null,
    constraint pk_washing_machines primary key (id)
);


