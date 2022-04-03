CREATE DATABASE mindtree_1;

USE mindtree_1;

CREATE TABLE Mobile (BRAND VARCHAR(20), NAME VARCHAR(20), PRICE INT, MEMORY INT, CAMERA INT, DISPLAY FLOAT); 

INSERT INTO 
Mobile(BRAND,NAME,PRICE,MEMORY,CAMERA,DISPLAY) 
VALUES 
('Samsung', 'Note', 37999, 128, 55, 6 ),
('Apple',  'Iphone 13', 77999, 64, 20, 6),
('Nokia', '8.1', 12500, 64, 16, 5.5),
('Xiaomi', 'Note 10X', 16500, 128, 48, 5.8),
('Motorola', 'G8', 18999, 64, 48, 6),
('Oppo', 'A53', 16999, 128, 32, 6.25),
('Vivo', 'Y33S', 18990, 128, 50, 6.5),
('Asus', 'Zenfone', 12999, 32, 13, 5.5),
('Realme', 'Narzo', 12499, 128, 50, 5.5),
('BlackBerry', 'Evolve', 13950, 64, 13, 5);

SELECT * FROM mobile;
-- Query1 Result:
-- select * from Mobile where CAMERA = (select max(CAMERA) from Mobile);
-- select * from Mobile where PRICE = (select min(PRICE) from Mobile);

-- Query2 Result:
-- SELECT NAME, BRAND FROM Mobile WHERE DISPLAY = (SELECT  MAX(DISPLAY) FROM Mobile);

-- Query3 Result:
SELECT CAMERA AS Camera, PRICE AS Price FROM Mobile WHERE NAME = 'IPHONE 13';
-- Names and brands of all the phones with price from 10000 to 20000 and camera from 30-50 MP from the mobile table:
-- SELECT NAME, BRAND FROM Mobile WHERE price >=10000 AND price<=20000 AND camera >=30 AND camera <=50; 