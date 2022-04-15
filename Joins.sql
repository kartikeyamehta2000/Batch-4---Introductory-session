SELECT * FROM employee;
SELECT * FROM department;
SELECT Emp_Name ,Address FROM employee AS E , department AS D where 
E.Emp_Number=D.Emp_Number;

SELECT Emp_Name ,Address FROM employee AS E INNER JOIN  department AS D ON
E.Emp_Number=D.Emp_Number;

SELECT Emp_Name ,Address FROM employee AS E LEFT OUTER JOIN  department AS D ON
E.Emp_Number=D.Emp_Number;


SELECT Emp_Name ,Address FROM employee AS E RIGHT  OUTER JOIN  department AS D ON
E.Emp_Number=D.Emp_Number;

SELECT * FROM employee_data;









