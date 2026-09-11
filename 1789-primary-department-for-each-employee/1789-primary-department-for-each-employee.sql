# Write your MySQL query statement below
select a.employee_id , a.department_id
from Employee as a
left join Employee as b
on a.employee_id = b.employee_id and
   b.primary_flag = 'Y'
where a.primary_flag = b.primary_flag or b.primary_flag is null
