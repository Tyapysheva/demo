create table if not exists organization(
    id          integer AUTO_INCREMENT COMMENT 'Уникальный идентификатор' PRIMARY KEY,
    version     integer not null COMMENT 'Служебное поле hibernate',
    name      varchar(50) COMMENT 'Название организации',
    full_name    varchar(200) COMMENT 'Полное название организации',
    inn         varchar(12) COMMENT 'ИНН организации',
    kpp         varchar(9)COMMENT 'КПП организации',
    address     varchar(200)COMMENT 'Адрес организации',
    phone       varchar(15) COMMENT 'Телефон организации',
    active boolean  COMMENT 'Действующая организации'
);
COMMENT ON TABLE organization IS 'Организация'
----------------------------------------
create table if not exists office(
  id integer AUTO_INCREMENT COMMENT 'Уникальный идентификатор' PRIMARY KEY,
  version  integer not null COMMENT 'Служебное поле hibernate',
  name varchar (50) COMMENT 'Название офиса',
  address varchar (200) COMMENT 'Адрес офиса',
  phone varchar (15)COMMENT 'Телефон офиса',
  active boolean COMMENT 'Действующий офис',
  org_id integer COMMENT 'Уникальный идентификатор организации',
  foreign key(org_id) references organization(id)
);
COMMENT ON TABLE office IS 'Офис'
----------------------------------------------
create table if not exists citizenship(
  id integer AUTO_INCREMENT  COMMENT 'Уникальный идентификатор' PRIMARY KEY,
  version  integer not null COMMENT 'Служебное поле hibernate',
  code varchar(4) COMMENT 'Код страны',
  name varchar (50) COMMENT 'Название страны'
);
COMMENT ON TABLE citizenship IS 'Гражданство'
----------------------------------------------
create table if not exists document_type(
  id integer AUTO_INCREMENT COMMENT 'Уникальный идентификатор' PRIMARY KEY,
  version  integer not null COMMENT 'Служебное поле hibernate',
  code varchar(4) COMMENT 'Код типа документа',
  name varchar (150) COMMENT 'Название типа документа'
);
COMMENT ON TABLE document_type IS 'Тип документа'
--------------------------------------------------
create table if not exists document(
id integer AUTO_INCREMENT COMMENT 'Уникальный идентификатор' PRIMARY KEY,
version integer not null COMMENT 'Служебное поле hibernate',
doc_number varchar(50)COMMENT 'Номер документа',
doc_date date COMMENT 'Дата получения документа',
id_doctype integer COMMENT 'Уникальный идентификатор типа документа',
foreign key(id_doctype)references document_type(id),
);
COMMENT ON TABLE document IS 'Документ';
-------------------------------------------------
create table if not exists person(
  id integer AUTO_INCREMENT COMMENT 'Уникальный идентификатор' PRIMARY KEY,
  version  integer not null COMMENT 'Служебное поле hibernate',
  first_name varchar (25)COMMENT 'Имя',
  middle_name varchar (25)COMMENT 'Отчество',
  second_name varchar (25)COMMENT 'Фамилия',
  phone varchar (15)COMMENT 'Телефон',
  position varchar (50)COMMENT 'Должность',
  identified boolean COMMENT 'Потвержденный документ',
  id_office integer COMMENT 'Уникальный идентификатор офиса',
  id_citizenship integer COMMENT 'Уникальный идентификатор гражданства',
  id_doc integer COMMENT 'Уникальный идентификатор документа',
  foreign key(id_office)references office(id),
  foreign key(id_doc)references document(id),
  foreign key(id_citizenship)references citizenship(id)
);
COMMENT ON TABLE person IS 'Человек'



