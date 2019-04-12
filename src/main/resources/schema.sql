create table if not exists organization(
    id          integer AUTO_INCREMENT PRIMARY KEY,
    version     integer not null COMMENT 'Служебное поле hibernate',
    name        varchar(50),
    full_name    varchar(200),
    inn         varchar(12),
    kpp         varchar(9),
    address     varchar(200),
    phone       varchar(15),
    active      boolean
);
create table if not exists office(
  id integer AUTO_INCREMENT PRIMARY KEY,
  version  integer not null COMMENT 'Служебное поле hibernate',
  name varchar (50),
  address varchar (200),
  phone varchar (15),
  version integer,
  active boolean,
  org_id integer,
  foreign key(org_id) references organization(id)
);
create table if not exists citizenship(
  id integer AUTO_INCREMENT PRIMARY KEY,
  version  integer not null COMMENT 'Служебное поле hibernate',
  code smallint,
  name varchar (50)
);
create table if not exists document(
  id integer AUTO_INCREMENT PRIMARY KEY,
  version  integer not null COMMENT 'Служебное поле hibernate',
  code tinyint,
  name varchar (150)
);

create table if not exists person(
  id integer AUTO_INCREMENT PRIMARY KEY,
  version  integer not null COMMENT 'Служебное поле hibernate',
  first_name varchar (25),
  middle_name varchar (25),
  second_name varchar (25),
  phone varchar (15),
  position varchar (50),
  identified boolean,
  office_id integer,
  foreign key(office_id)references office(id)
);

create table if not exists person_doc(
id integer AUTO_INCREMENT PRIMARY KEY,
doc_number varchar(50),
doc_date date,
id_person integer,
id_doc integer,
foreign key(id_doc)references document(id),
foreign key(id_person)references person(id)
);

create table if not exists person_citizenship(
id integer AUTO_INCREMENT PRIMARY KEY,
id_person integer,
id_citizenship integer,
foreign key(id_citizenship)references citizenship(id),
foreign key(id_person)references person(id)
);
