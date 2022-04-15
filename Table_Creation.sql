use velocity;
DROP TABLE STUDENT;
CREATE TABLE STUDENT(
Enrollment int ,
FirstName varchar(255),
LastName varchar(255),
City text,
sub text,
Grade int 

);

INSERT INTO STUDENT (Enrollment,FirstName,LastName,grade,City,Sub) VALUES (1,"KARTIKEYA","MEHTA",10,"Jabalpur","Maths") ;
INSERT INTO STUDENT (Enrollment,FirstName,LastName,grade,city,sub) VALUES (2,"Ganesh","Bhatt",20,"Bhopal","Arts") ;
INSERT INTO STUDENT (Enrollment,FirstName,LastName,grade,city,sub) VALUES (3,"Akash","Dubey",30,"Indore","Maths") ;
INSERT INTO STUDENT (Enrollment,FirstName,LastName,grade,city,sub)VALUES (4,"Shiv","Sharma",40,"Mumbai","Social") ;
INSERT INTO STUDENT (Enrollment,FirstName,LastName,grade,city,sub) VALUES (5,"Vivek","Verma",50,"Varansi","Sansktit") ;



select * from student ;

SELECT * FROM STUDENT WHERE sub ="Bio" AND sub="Maths";
SELECT * FROM STUDENT WHERE NOT sub = "Bio";
SELECT * FROM STUDENT ORDER BY City ;

/* Upadate Query */
UPDATE STUDENT 
set Enrollment =23, City ="bhopal"
where Firstname="Kartikeya";
DELETE FROM STUDENT 
WHERE Sub ="Bio";
Select * from student;


SELECT * FROM STUDENT WHERE Enrollment IN(23,2);
SELECT * FROM STUDENT limit 4;

SELECT * FROM STUDENT WHERE FIRSTNAME LIKE "k%";
SELECT * FROM STUDENT WHERE FIRSTNAME LIKE "";


SELECT COUNT(Enrollment) from STUDENT; /* Count*/


SELECT * FROM STUDENT WHERE FIRSTNAME ="KARTIKEYA";
UPDATE STUDENT 
SET FIRSTNAME ="Kartik"
WHERE FIRSTNAME="Kartikeya";

SELECT CONCAT(FIRSTNAME," ",LASTNAME) AS FULLNAME FROM STUDENT;

DELETE FROM STUDENT WHERE Enrollment =1;

select * from student order by Enrollment ASC;

Select * from  STUDENT WHERE grade =  (SELECT max(grade) from STUDENT);


/*Wildcard */
SELECT * FROM STUDENT;
SELECT * FROM STUDENT WHERE firstname LIKE "k%"; 
SELECT * FROM STUDENT WHERE firstname LIKE "%k%"; 
SELECT * FROM STUDENT WHERE firstname LIKE "_a%"; 

SELECT * FROM STUDENT WHERE firstname LIKE "[!abc]";
SELECT * FROM CUSTOMERS;
SELECT * FROM CUSTOMERS WHERE salary IN (2310,3709);
SELECT * FROM CUSTOMERS WHERE salary NOT IN (2310,3709);
SELECT Customername FROM CUSTOMERS WHERE SALARY BETWEEN 1000 AND 10000;











