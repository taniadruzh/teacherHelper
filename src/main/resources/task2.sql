INSERT INTO teacher_helper.student (idstudent,name, ser_name, phone, email) VALUES (1,'bim', 'frick', '+380503456785', 'bim@mail.ru');
INSERT INTO teacher_helper.student (idstudent,name, ser_name, phone, email) VALUES (2,'doberman', 'dog', '+380503456787', 'doberman@gmail.com');
INSERT INTO teacher_helper.student (idstudent,name, ser_name, phone, email) VALUES (3,'karl', 'bobovich', '+380503456789', 'bob@mail.ru');
INSERT INTO teacher_helper.student (idstudent,name, ser_name, phone, email) VALUES (4,'jon', 'karlov', '+380633456781', 'jon@mail.ru');
INSERT INTO teacher_helper.student (idstudent,name, ser_name, phone, email) VALUES (5,'toma', 'karlova', '+380633456782', 'toma@mail.ru');
INSERT INTO teacher_helper.student (idstudent,name, ser_name, phone, email) VALUES (6,'ikka', 'bus', '+380633456788', 'ikka@mail.ru');
INSERT INTO teacher_helper.student (idstudent,name, ser_name, phone, email) VALUES (7,'fox', 'gordon', '+380683456784', 'fox@mail.ru');
INSERT INTO teacher_helper.student (idstudent,name, ser_name, phone, email) VALUES (8,'don', 'abramov', '+380903456786', 'don@mail.ru');
INSERT INTO teacher_helper.student (idstudent,name, ser_name, phone, email) VALUES (9,'dina', 'ivanova', '+380903456789', 'dina@mail.ru');
INSERT INTO teacher_helper.student (idstudent,name, ser_name, phone, email) VALUES (10,'den', 'ketch', '+380933456783', 'den@gmail.com');
INSERT INTO teacher_helper.student (idstudent,name, ser_name, phone, email) VALUES (11,'lila', 'karlova', '0000', 'lila@mail.ru');

select name from student where phone like('+38050%') or phone like('+38066%') or phone like('+38099%');

select name from student where phone like('+38050%') or phone like('+38066%') or phone like('+38099%') or phone like('+38063%') or phone like('+38093%') or phone like('+38072%');

select name from student where phone like('+38050%') or phone like('+38066%') or phone like('+38099%') or phone like('+38068%') or phone like('+38090%');

select * from student
where ser_name in(
select ser_name from student group by ser_name having count(*) > 1);