insert into document_type(VERSION,CODE,NAME)
values (3,0,'Свидетельство о рождении'),
(0,7, 'Военный билет'),
(0,8, 'Временное удостоверение, выданное взамен военного билета'),
(0,10,'Паспорт иностранного гражданина'),
(0,11,'Свидетельство о рассмотрении ходатайства о признании лица беженцем на территории Российской Федерации по существу'),
(0,12,'Вид на жительство в Российской Федерации'),
(0,13,'Удостоверение беженца'),
(0,15,'Разрешение на временное проживание в Российской Федерации'),
(0,18,'Свидетельство о предоставлении временного убежища на территории Российской Федерации'),
(0,21,'Паспорт гражданина Российской Федерации '),
(0,23,'Свидетельство о рождении, выданное уполномоченным органом иностранного государства'),
(0,24,'Удостоверение личности военнослужащего Российской Федерации '),
(0,91,'Иные документы ');

insert into citizenship(VERSION,CODE,NAME)
values (643,0,'Российская Федерация'),
(0,674,'САН-МАРИНО'),
(0,688,'СЕРБИЯ'),
(0,702,'СИНГАПУР'),
(0,858,'УРУГВАЙ'),
(0,250,'ФРАНЦИЯ'),
(0,392,'ЯПОНИЯ');

insert into organization(VERSION,name,full_name,inn,kpp,address,phone,active)
values
(0,'Орг1','Организация1','111111111111','111111111','Адрес1','8901155511',true),
(0,'Орг2','Организация2','222211111222','222211122','Адрес2','8902255522',true),
(0,'Орг3','Организация3','333311111333','333311133','Адрес3','8903355533',true),
(0,'Орг4','Организация4','444411111444','444411144','Адрес4','8904455544',true),
(0,'Орг5','Организация5','555511111555','555511155','Адрес5','8905555555',false);

insert into office(VERSION,name,address,phone,active,org_id)
values
(0,'1Офис1','1Адрес1','8911155111',true,1),
(0,'2Офис1','2Адрес11','8933355533',true,2),
(0,'3Офис1','3Адрес111','8955533355',false,3),
(0,'4Офис1','4Адрес1111','8955444555',false,4),
(0,'5Офис1','5Адрес11111','8950055555',false,5),
(0,'5Офис2','5Адрес22222','8950055055',false,5);

insert into person(VERSION,first_name,middle_name,second_name,phone,position,identified,id_office,ID_CITIZENSHIP)
values
(0,'Михаил','Андреевич','Пупкин','8900155111','менеджер',true,1,1),
(0,'Вася','Андреевич','Пупкович','8900255522','менеджер',true,2,1),
(0,'Иван','Алексеевич','Пупин','8900355533','менеджер',true,3,1),
(0,'Сергей','Алексеевич','Попович','8900455544','менеджер',true,4,1),
(0,'Лиза','Сергеевна','Попко','8900533355','менеджер',false,5,1),
(0,'Маша','Сергеевна','Брувко','8900533335','менеджер',false,1,1),
(0,'Даша','Иннокентьевна','Бривко','8900444555','менеджер',false,2,1),
(0,'Катя','Иннокентьевна','Дривко','8900444455','менеджер',false,3,1),
(0,'Алиса','Михайловна','Ермилова','8900055555','менеджер',false,4,1),
(0,'Денис','Михайлович','Ростропович','8900055055','менеджер',false,6,1);


insert into document(version, doc_number,doc_date,id_doctype)
values
(0,'3333','2018-12-01','1');
