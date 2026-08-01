# Write your MySQL query statement below
-- select p.firstName , p.lastName ,p.city,p.state as Person from Person p join Address a on a.personId=p.personId where !a.Adress then 

SELECT
    p.firstName,
    p.lastName,
    a.city,
    a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;
