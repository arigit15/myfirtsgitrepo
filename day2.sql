
select employee_id,manager_id,department_id from employees where (manager_id,department_id)in(select manager_id,department_id from employees where employee_id in(199,174)) and employee_id not in(199,174);
select employee_id,manager_id,department_id from employees where manager_id in (select manager_id from employees where employee_id in(174,199)) and department_id in (select department_id from employees where employee_id in(174,199)) and employee_id not in(174,199);
select employee_id,last_name,(case when department_id =(select department_id from departments where location_id=1800) then 'Canada' else 'USA'end) location from employees;
select employee_id,last_name from employees e order by (select department_name from departments d where e.department_id=d.department_id);
select last_name,salary,department_id from employees outr where salary>(select avg(salary) from employees where department_id=outr.department_id);
select e.employee_id,last_name,e.job_id from employees e where 2<=(select count(*) from job_history where employee_id=e.employee_id);

select employee_id,last_name,job_id,department_id from employees outr where exists(select 'last_name' from employees where manager_id=outr.employee_id);

select department_id,department_name from departments d where not exists (select 'last name' from employees where department_id =d.department_id);

delete from  employee  where employee_id=(select employee_id from employees where employee_id =1001); 
create table emp16( employee_id integer,employee_name varchar(20),job_id varchar(20));
select last_name,department_id,salary from employees where (department_id,salary) in (select department_id,salary from employees where commission_pct is not null);

select employees.last_name,departments.department_name,employees.salary from employees inner join departments on employees.department_id=departments.department_id
 where (salary,commission_pct) in (select salary,commission_pct from employees where  location_id= all(select location_id from departments where location_id=1700));


select last_name,hire_date,salary from employees where (salary,commission_pct) in (select salary,commission_pct from employees where last_name='Kochhar' );
select * from employees;
select last_name,job_id,salary from employees where salary>any(select salary from employees where job_id='SA_MAN') order by salary desc;


SELECT e.last_name, d.department_name, e.salary
	FROM employees e, departments d
	WHERE e.department_id = d.department_id
	AND (salary, IFNULL(commission_pct,0)) IN
		(SELECT salary, IFNULL(commission_pct,0)
		FROM employees e, departments d
		WHERE e.department_id = d.department_id
		AND d.location_id = 1700);
        
        
        
        SELECT last_name, hire_date, salary
	FROM employees
	WHERE (salary, IFNULL(commission_pct,0)) IN
		(SELECT salary, IFNULL(commission_pct,0)
		FROM employees
		WHERE last_name = 'Kochhar')
	AND last_name != 'Kochhar';
    
    
    
    
    select employee_id,last_name,department_id from employees where department_id IN (select department_id from departments where location_id IN (select location_id from locations where city like 'T%'));
    
    create view view_employees 
    as select last_name,first_name,hire_date
    from employees;
    show tables;
    desc view_employees;
    select * from view.last_name;
    
create view view_departments_employees
as select a.last_name,b.department_name
from departments a,employees b
where a.department_id=b.department_id;



create view view_employees_manager
as select a.first_name,a.last_name,b.first_name,b.last_name
from employees a,employees b
where a.employee_id=b.manager_id;


create table emp15( employee_id primary key,employee name not null);
create view DEPT50
as select employee_id,last_name,department_id
from employees;

select * from DEPT50;