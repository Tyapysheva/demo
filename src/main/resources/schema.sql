create table organization(
    id          integer AUTO_INCREMENT PRIMARY KEY,
    name        varchar(50),
    fullname    varchar(255),
    inn         varchar(12),
    kpp         varchar(9),
    address     varchar(255),
    phone       varchar(15),
    active      boolean
);
create table office(
  id integer AUTO_INCREMENT PRIMARY KEY,
  name varchar (50),
  address varchar (255),
  phone varchar (15),
  active boolean,
  org_id integer,
  foreign key(org_id) references organization(id)
);
create table citizenship(
  code smallint primary key,
  name varchar (50)
);
create table document(
  code tinyint primary key,
  name varchar (150)
);

create table person(
  id integer AUTO_INCREMENT PRIMARY KEY,
  firstname varchar (25),
  middlename varchar (25),
  secondname varchar (25),
  phone varchar (15),
  position varchar (50),
  identified boolean,
  doc_number integer,
  doc_date date,
  document_code tinyint,
  citizenship_code smallint,
  office_id integer,
  foreign key(office_id)references office(id),
  foreign key(citizenship_code)references citizenship(code),
  foreign key(document_code)references document(code)
);