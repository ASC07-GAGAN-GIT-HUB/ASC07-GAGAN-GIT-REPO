Use AdventureWorksLT2019

--1. List all customers in the database.

SELECT * FROM SalesLT.Customer;


-- 2. Display all products offered by the company.

SELECT * FROM SalesLT.Product;

--3. Show the first name, last name, and email address of every customer.

SELECT FirstName, LastName, EmailAddress FROM SalesLT.Customer;

--4. List the name and price of each product.

SELECT Name, ListPrice FROM SalesLT.Product;

-- 5. Count the total number of customers.

SELECT COUNT(*) AS TotalCustomers FROM SalesLT.Customer;

--6. Count the total number of products in the catalog.

SELECT COUNT(*) AS TotalProducts FROM SalesLT.Product;

--7. List all unique product colors that are not null.

SELECT DISTINCT Color FROM SalesLT.Product WHERE Color IS NOT NULL;

--8. Show the 10 most expensive products.

SELECT TOP 10 Name, ListPrice
FROM SalesLT.Product
ORDER BY ListPrice DESC;

--9. Retrieve all sales orders placed so far.

SELECT * FROM SalesLT.SalesOrderHeader;


--10. List products that are currently in stock (not discontinued).

SELECT Name, ProductNumber, StandardCost
FROM SalesLT.Product
WHERE SellEndDate IS NULL;


-- 11. Find products with a price greater than $1000.

SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice > 1000;


--12. List customers who are based in Seattle.

SELECT c.FirstName, c.LastName
FROM SalesLT.Customer AS c
JOIN SalesLT.CustomerAddress AS ca ON c.CustomerID = ca.CustomerID
JOIN SalesLT.Address AS a ON ca.AddressID = a.AddressID
WHERE a.City = 'Seattle';

--13. Show all products available in red color.

SELECT Name, Color, ListPrice FROM SalesLT.Product WHERE Color = 'Red';

--14. List orders placed in the year 2008.

SELECT SalesOrderID, OrderDate, TotalDue
FROM SalesLT.SalesOrderHeader
WHERE YEAR(OrderDate) = 2008;


--15. Find products priced between $100 and $500.

SELECT Name, ListPrice
FROM SalesLT.Product
WHERE ListPrice BETWEEN 100 AND 500;

--16. List customers with an adventure-works.com email address.

SELECT FirstName, LastName, EmailAddress
FROM SalesLT.Customer
WHERE EmailAddress LIKE '%adventure-works.com';


--17. Show products whose names start with "Mountain".

SELECT Name FROM SalesLT.Product WHERE Name LIKE 'Mountain%';

-- 18. List products without a specified color.

SELECT Name, Color FROM SalesLT.Product WHERE Color IS NULL;

--19. Find customers who have provided their phone numbers.

SELECT FirstName, LastName, Phone FROM SalesLT.Customer WHERE Phone IS NOT NULL;

-- 20. List products that belong to 'Helmets' and 'Gloves' categories.

SELECT p.Name, p.ListPrice, pc.Name AS CategoryName
FROM SalesLT.Product AS p
JOIN SalesLT.ProductCategory AS pc ON p.ProductCategoryID = pc.ProductCategoryID
WHERE pc.Name IN ('Helmets', 'Gloves');

--21. Calculate the average price of all products.

SELECT AVG(ListPrice) AS AveragePrice FROM SalesLT.Product;

-- 22. Compute the total sales revenue so far.

SELECT SUM(TotalDue) AS TotalRevenue FROM SalesLT.SalesOrderHeader;

-- 23. Find the highest product price in the catalog.

SELECT MAX(ListPrice) AS HighestPrice FROM SalesLT.Product;

-- 24. Find the lowest non-zero product price.

SELECT MIN(ListPrice) AS LowestNonZeroPrice
FROM SalesLT.Product
WHERE ListPrice > 0;


-- 25. Count how many products exist for each color.

SELECT Color, COUNT(*) AS ProductCount
FROM SalesLT.Product
WHERE Color IS NOT NULL
GROUP BY Color;

--26 Calculate the average order total for each year.

SELECT YEAR(OrderDate) AS OrderYear, AVG(TotalDue) AS AverageOrderTotal
FROM SalesLT.SalesOrderHeader
GROUP BY YEAR(OrderDate);

--27. Count how many units have been sold for each product.

SELECT p.Name, SUM(sod.OrderQty) AS TotalUnitsSold
FROM SalesLT.Product AS p
JOIN SalesLT.SalesOrderDetail AS sod ON p.ProductID = sod.ProductID
GROUP BY p.Name
ORDER BY TotalUnitsSold DESC;


-- 28. Count how many orders each customer has placed.

SELECT CustomerID, COUNT(SalesOrderID) AS NumberOfOrders
FROM SalesLT.SalesOrderHeader
GROUP BY CustomerID
ORDER BY NumberOfOrders DESC;

-- 29. Calculate the average product price in each category.

SELECT pc.Name AS CategoryName, AVG(p.ListPrice) AS AveragePrice
FROM SalesLT.Product AS p
JOIN SalesLT.ProductCategory AS pc ON p.ProductCategoryID = pc.ProductCategoryID
GROUP BY pc.Name;


-- 30. Show total sales for each month.

SELECT YEAR(OrderDate) AS OrderYear, MONTH(OrderDate) AS OrderMonth, SUM(TotalDue) AS TotalSales
FROM SalesLT.SalesOrderHeader
GROUP BY YEAR(OrderDate), MONTH(OrderDate)
ORDER BY OrderYear, OrderMonth;

-- 31. Show the category for each product.

SELECT p.Name AS ProductName, pc.Name AS CategoryName
FROM SalesLT.Product AS p
INNER JOIN SalesLT.ProductCategory AS pc ON p.ProductCategoryID = pc.ProductCategoryID;

-- 32. Show sales order details along with customer info.

SELECT soh.SalesOrderID, c.FirstName, c.LastName, soh.OrderDate, soh.TotalDue
FROM SalesLT.SalesOrderHeader AS soh
INNER JOIN SalesLT.Customer AS c ON soh.CustomerID = c.CustomerID;

-- 33. List products included in each order.

SELECT sod.SalesOrderID, p.Name AS ProductName, sod.OrderQty, sod.UnitPrice, sod.LineTotal
FROM SalesLT.SalesOrderDetail AS sod
INNER JOIN SalesLT.Product AS p ON sod.ProductID = p.ProductID;


-- 34. Show addresses for each customer.

SELECT c.FirstName, c.LastName, a.AddressLine1, a.City, a.StateProvince, a.PostalCode
FROM SalesLT.Customer AS c
INNER JOIN SalesLT.CustomerAddress AS ca ON c.CustomerID = ca.CustomerID
INNER JOIN SalesLT.Address AS a ON ca.AddressID = a.AddressID;

--35. Show the parent category for each product.

SELECT p.Name AS ProductName, pc.Name AS CategoryName, ppc.Name AS ParentCategoryName
FROM SalesLT.Product AS p
INNER JOIN SalesLT.ProductCategory AS pc ON p.ProductCategoryID = pc.ProductCategoryID
LEFT JOIN SalesLT.ProductCategory AS ppc ON pc.ParentProductCategoryID = ppc.ProductCategoryID;

-- 36. Show complete order details including customer and product info.

SELECT
    soh.SalesOrderID,
    c.FirstName + ' ' + c.LastName AS CustomerName,
    p.Name AS ProductName,
    sod.OrderQty,
    sod.UnitPrice,
    sod.LineTotal
FROM SalesLT.SalesOrderHeader AS soh
INNER JOIN SalesLT.Customer AS c ON soh.CustomerID = c.CustomerID
INNER JOIN SalesLT.SalesOrderDetail AS sod ON soh.SalesOrderID = sod.SalesOrderID
INNER JOIN SalesLT.Product AS p ON sod.ProductID = p.ProductID;

-- 37. List products that have never been ordered.

SELECT p.Name
FROM SalesLT.Product AS p
LEFT JOIN SalesLT.SalesOrderDetail AS sod ON p.ProductID = sod.ProductID
WHERE sod.SalesOrderDetailID IS NULL;

-- 38. Show total spending for each customer.

SELECT c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalSpending
FROM SalesLT.Customer AS c
INNER JOIN SalesLT.SalesOrderHeader AS soh ON c.CustomerID = soh.CustomerID
GROUP BY c.FirstName, c.LastName
ORDER BY TotalSpending DESC;


-- 39. Show descriptions for each product model.

SELECT pm.Name AS ModelName, pd.Description
FROM SalesLT.ProductModel AS pm
INNER JOIN SalesLT.ProductModelProductDescription AS pmpd ON pm.ProductModelID = pmpd.ProductModelID
INNER JOIN SalesLT.ProductDescription AS pd ON pmpd.ProductDescriptionID = pd.ProductDescriptionID
WHERE pmpd.Culture = 'en';


-- 40. Show shipping addresses for each sales order. 

SELECT soh.SalesOrderID, a.AddressLine1, a.City, a.StateProvince, a.CountryRegion, a.PostalCode
FROM SalesLT.SalesOrderHeader AS soh
INNER JOIN SalesLT.Address AS a ON soh.ShipToAddressID = a.AddressID;

-- 41. List categories with more than 10 products.

SELECT pc.Name AS CategoryName, COUNT(p.ProductID) AS NumberOfProducts
FROM SalesLT.ProductCategory AS pc
JOIN SalesLT.Product AS p ON pc.ProductCategoryID = p.ProductCategoryID
GROUP BY pc.Name
HAVING COUNT(p.ProductID) > 10;

-- 42. List customers who have spent more than $10,000.

SELECT c.CustomerID, c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalSpent
FROM SalesLT.Customer AS c
JOIN SalesLT.SalesOrderHeader AS soh ON c.CustomerID = soh.CustomerID
GROUP BY c.CustomerID, c.FirstName, c.LastName
HAVING SUM(soh.TotalDue) > 10000;

-- 43. List products sold more than 100 times.

SELECT p.Name, SUM(sod.OrderQty) AS TotalUnitsSold
FROM SalesLT.Product AS p
JOIN SalesLT.SalesOrderDetail AS sod ON p.ProductID = sod.ProductID
GROUP BY p.Name
HAVING SUM(sod.OrderQty) > 100;


-- 44. List colors with an average product price over $500.

SELECT Color, AVG(ListPrice) AS AveragePrice
FROM SalesLT.Product
WHERE Color IS NOT NULL
GROUP BY Color
HAVING AVG(ListPrice) > 500;

-- 45. List years where sales exceeded $1 million.

SELECT YEAR(OrderDate) AS OrderYear, SUM(TotalDue) AS TotalSales
FROM SalesLT.SalesOrderHeader
GROUP BY YEAR(OrderDate)
HAVING SUM(TotalDue) > 1000000;

-- 46. List customers who placed more than 3 orders.

SELECT c.CustomerID, c.FirstName, c.LastName, COUNT(soh.SalesOrderID) AS OrderCount
FROM SalesLT.Customer AS c
JOIN SalesLT.SalesOrderHeader AS soh ON c.CustomerID = soh.CustomerID
GROUP BY c.CustomerID, c.FirstName, c.LastName
HAVING COUNT(soh.SalesOrderID) > 3;


-- 47. List products with an average order quantity greater than 5.

SELECT p.Name, AVG(CAST(sod.OrderQty AS DECIMAL(10, 2))) AS AvgOrderQty
FROM SalesLT.Product AS p
JOIN SalesLT.SalesOrderDetail AS sod ON p.ProductID = sod.ProductID
GROUP BY p.Name
HAVING AVG(CAST(sod.OrderQty AS DECIMAL(10, 2))) > 5;


-- 48. List cities with more than 5 customers.

SELECT a.City, COUNT(DISTINCT c.CustomerID) AS CustomerCount
FROM SalesLT.Customer AS c
JOIN SalesLT.CustomerAddress AS ca ON c.CustomerID = ca.CustomerID
JOIN SalesLT.Address AS a ON ca.AddressID = a.AddressID
GROUP BY a.City
HAVING COUNT(DISTINCT c.CustomerID) > 5

-- 49. List product categories with over $50,000 in sales.

SELECT pc.Name AS CategoryName, SUM(sod.LineTotal) AS TotalCategorySales
FROM SalesLT.ProductCategory AS pc
JOIN SalesLT.Product AS p ON pc.ProductCategoryID = p.ProductCategoryID
JOIN SalesLT.SalesOrderDetail AS sod ON p.ProductID = sod.ProductID
GROUP BY pc.Name
HAVING SUM(sod.LineTotal) > 50000

-- 50. List months with more than 50 orders placed.

SELECT YEAR(OrderDate) AS OrderYear, MONTH(OrderDate) AS OrderMonth, COUNT(SalesOrderID) AS OrderCount
FROM SalesLT.SalesOrderHeader
GROUP BY YEAR(OrderDate), MONTH(OrderDate)
HAVING COUNT(SalesOrderID) > 50

-- 51. Which products are priced above the average?

SELECT Name, ListPrice
FROM SalesLT.Product
WHERE ListPrice > (SELECT AVG(ListPrice) FROM SalesLT.Product)

-- 52. Which customers placed orders in 2008?

SELECT FirstName, LastName
FROM SalesLT.Customer
WHERE CustomerID IN (SELECT CustomerID FROM SalesLT.SalesOrderHeader WHERE YEAR(OrderDate) = 2008)

-- 53. What is the most expensive product in each category?

SELECT pc.Name AS CategoryName, p.Name AS ProductName, p.ListPrice
FROM SalesLT.Product AS p
JOIN SalesLT.ProductCategory AS pc ON p.ProductCategoryID = pc.ProductCategoryID
WHERE p.ListPrice = (
    SELECT MAX(p2.ListPrice)
    FROM SalesLT.Product AS p2
    WHERE p2.ProductCategoryID = p.ProductCategoryID
)

-- 54. Which customers have spent more than the average customer?**

WITH CustomerTotal AS (
    SELECT CustomerID, SUM(TotalDue) AS TotalSpent
    FROM SalesLT.SalesOrderHeader
    GROUP BY CustomerID
)
SELECT c.FirstName, c.LastName, ct.TotalSpent
FROM CustomerTotal AS ct
JOIN SalesLT.Customer AS c ON ct.CustomerID = c.CustomerID
WHERE ct.TotalSpent > (SELECT AVG(TotalSpent) FROM CustomerTotal)


-- 55. Which products have never been ordered

SELECT Name
FROM SalesLT.Product
WHERE ProductID NOT IN (SELECT DISTINCT ProductID FROM SalesLT.SalesOrderDetail)

-- 56. Which orders are larger than the average order value

SELECT SalesOrderID, TotalDue
FROM SalesLT.SalesOrderHeader
WHERE TotalDue > (SELECT AVG(TotalDue) FROM SalesLT.SalesOrderHeader)

-- 57. Who are our top 5 customers by total purchases?

SELECT TOP 5 c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalPurchases
FROM SalesLT.Customer AS c
JOIN SalesLT.SalesOrderHeader AS soh ON c.CustomerID = soh.CustomerID
GROUP BY c.FirstName, c.LastName
ORDER BY TotalPurchases DESC

-- 58. Which products are in the most expensive category?

SELECT Name, ListPrice
FROM SalesLT.Product
WHERE ProductCategoryID = (
    SELECT TOP 1 ProductCategoryID
    FROM SalesLT.Product
    GROUP BY ProductCategoryID
    ORDER BY AVG(ListPrice) DESC
)


-- 59. Which customers live in the top 3 cities by customer count?

SELECT c.FirstName, c.LastName, a.City
FROM SalesLT.Customer AS c
JOIN SalesLT.CustomerAddress AS ca ON c.CustomerID = ca.CustomerID
JOIN SalesLT.Address AS a ON ca.AddressID = a.AddressID
WHERE a.City IN (
    SELECT TOP 3 City
    FROM SalesLT.Address AS addr
    JOIN SalesLT.CustomerAddress AS custaddr ON addr.AddressID = custaddr.AddressID
    GROUP BY City
    ORDER BY COUNT(DISTINCT custaddr.CustomerID) DESC
)

-- 60. Which products are priced higher than their category's average

SELECT p1.Name, p1.ListPrice
FROM SalesLT.Product AS p1
WHERE p1.ListPrice > (
    SELECT AVG(p2.ListPrice)
    FROM SalesLT.Product AS p2
    WHERE p2.ProductCategoryID = p1.ProductCategoryID
)