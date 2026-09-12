# Write your MySQL query statement below
select t.id
from Weather as t
left join Weather as y
on datediff(t.recordDate , y.recordDate) = 1
where t.temperature > y.temperature