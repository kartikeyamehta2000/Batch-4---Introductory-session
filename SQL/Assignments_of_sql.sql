create TABLE EmployeeDetails(

Empid int ,
FullName varchar(255),
Managerid int ,
DateOfjoining Date,
City varchar(255)


);
INSERT INTO EmployeeDetails(Empid , FullName ,Managerid ,DateOfjoining,City ) VALUES (121,"John Snow",321,"2014-01-31","Toronto");
INSERT INTO EmployeeDetails(Empid , FullName ,Managerid ,DateOfjoining,City ) VALUES (321,"Walter White",978,"2015-01-30","California");
INSERT INTO EmployeeDetails(Empid , FullName ,Managerid ,DateOfjoining,City ) VALUES (421,"Kuldeep Rana ",876,"2016-11-27","New Delhi");
SELECT * FROM EmployeeDetails  ;


create TABLE EmployeeSalary(

Empid int ,
Project varchar(255),
Salary  int ,
Variable int



);

INSERT INTO EmployeeSalary(Empid , Project ,Salary,Variable) VALUES (121,"p1",8000,500);
INSERT INTO EmployeeSalary(Empid , Project ,Salary,Variable) VALUES (321,"p2",8000,500);
INSERT INTO EmployeeSalary(Empid , Project ,Salary,Variable) VALUES (421,"p1",12000,0);

Select * from EmployeeSalary;