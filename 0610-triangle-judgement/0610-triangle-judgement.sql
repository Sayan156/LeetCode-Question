# Write your MySQL query statement below
select x , y , z,
 case 
 when abs(x) + abs(y) > abs(z)
 and abs(x) + abs(z) > abs(y)
 and abs(z) + abs(y) > abs(x)
 then 'Yes'
 else 'No'
 end as triangle
from Triangle