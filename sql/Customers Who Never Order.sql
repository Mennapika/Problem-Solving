# Write your MySQL query statement below
SELECT name  as Customers From Customers WHERE  (id NOT IN (SELECT customerId FROM Orders ));
 
