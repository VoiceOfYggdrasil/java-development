-- 1
SELECT
	COUNT(*) AS NumberOfSuppliers
FROM
	Suppliers;
-- 2
SELECT
	SUM(salary) AS TotalSalary
FROM
	Employees;
-- 3
	-- SELECT MIN(UnitPrice) AS CheapestItem
	-- FROM Products;
SELECT 
	*
FROM
	Products
ORDER BY
	UnitPrice ASC;
-- 4
SELECT
	AVG(UnitPrice) AS AvgPrice
FROM
	Products;
-- 5
SELECT
	MAX(UnitPrice) AS PriciestItem
FROM
	Products;
-- 6
SELECT
	SupplierID, COUNT(*) AS UnitsPerSupplier
FROM
	Products
GROUP BY
	SupplierID;
-- 7
SELECT
	CategoryID, AVG(UnitPrice) AS AvgPrice
FROM
	Products
GROUP BY
	CategoryID;
-- 8
SELECT
	SupplierID, COUNT(*) AS UnitsPerSupplier
FROM
	Products
GROUP BY
	SupplierID
HAVING
	UnitsPerSupplier > 4;
-- 9
SELECT
	ProductID, ProductName, (UnitPrice * UnitsInStock) AS InventoryValue
FROM
	Products
ORDER BY InventoryValue DESC, ProductName;