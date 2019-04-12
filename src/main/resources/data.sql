insert into document_type(CODE,VERSION,NAME)
values (3,1,'Свидетельство о рождении'),
(7,2,'Военный билет'),
(8,3,'Временное удостоверение, выданное взамен военного билета'),
(10,4,'Паспорт иностранного гражданина'),
(11,5,'Свидетельство о рассмотрении ходатайства о признании лица беженцем на территории Российской Федерации по существу'),
(12,6,'Вид на жительство в Российской Федерации'),
(13,7,'Удостоверение беженца'),
(15,8,'Разрешение на временное проживание в Российской Федерации'),
(18,9,'Свидетельство о предоставлении временного убежища на территории Российской Федерации'),
(21,10,'Паспорт гражданина Российской Федерации '),
(23,11,'Свидетельство о рождении, выданное уполномоченным органом иностранного государства'),
(24,12,'Удостоверение личности военнослужащего Российской Федерации '),
(91,13,'Иные документы ');

insert into citizenship(CODE,VERSION,NAME)
values (643,1,'Российская Федерация'),
(674,2,'САН-МАРИНО'),
(688,3,'СЕРБИЯ'),
(702,4,'СИНГАПУР'),
(858,5,'УРУГВАЙ'),
(250,6,'ФРАНЦИЯ'),
(392,7,'ЯПОНИЯ');

insert into organization(VERSION,name,full_name,inn,kpp,address,phone,active)
values
(1,'Орг1','Организация1','111111111111','111111111','Адрес1','8901155511',true),
(2,'Орг2','Организация2','222211111222','222211122','Адрес2','8902255522',true),
(3,'Орг3','Организация3','333311111333','333311133','Адрес3','8903355533',true),
(4,'Орг4','Организация4','444411111444','444411144','Адрес4','8904455544',true),
(5,'Орг5','Организация5','555511111555','555511155','Адрес5','8905555555',false);

insert into office(VERSION,name,address,phone,active,org_id)
values
(1,'1Офис1','1Адрес1','8911155111',true,1),
(2,'2Офис1','2Адрес11','8933355533',true,2),
(3,'3Офис1','3Адрес111','8955533355',false,3),
(4,'4Офис1','4Адрес1111','8955444555',false,4),
(5,'5Офис1','5Адрес11111','8950055555',false,5),
(6,'5Офис2','5Адрес22222','8950055055',false,5);

insert into person(VERSION,first_name,middle_name,second_name,phone,position,identified,id_office,ID_CITIZENSHIP)
values
(1,'Михаил','Андреевич','Пупкин','8900155111','менеджер',true,1),
(2,'Вася','Андреевич','Пупкович','8900255522','менеджер',true,2),
(3,'Иван','Алексеевич','Пупин','8900355533','менеджер',true,3),
(4,'Сергей','Алексеевич','Попович','8900455544','менеджер',true,4),
(5,'Лиза','Сергеевна','Попко','8900533355','менеджер',false,5),
(6,'Маша','Сергеевна','Брувко','8900533335','менеджер',false,1),
(7,'Даша','Иннокентьевна','Бривко','8900444555','менеджер',false,2),
(8,'Катя','Иннокентьевна','Дривко','8900444455','менеджер',false,3),
(9,'Алиса','Михайловна','Ермилова','8900055555','менеджер',false,4),
(10,'Денис','Михайлович','Ростропович','8900055055','менеджер',false,6);

insert into document(doc_number,doc_date,id_person,id_doc)
values
('3333','2018-12-01','1','2');
