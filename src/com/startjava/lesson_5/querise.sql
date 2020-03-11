SELECT * FROM Jaeger;

SELECT * FROM Jaeger WHERE status = 'Active';

SELECT * FROM Jaeger WHERE mark = '1' OR mark = '6';

SELECT * FROM Jaeger ORDER BY mark DESC;

SELECT * FROM Jaeger WHERE launch = (SELECT MAX(launch) FROM Jaeger);

SELECT * FROM Jaeger WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaeger);

SELECT * FROM Jaeger WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaeger);

SELECT AVG(weight) FROM Jaeger;

UPDATE Jaeger SET kaijuKill = kaijuKill + 1 WHERE status = 'Active';


DELETE  FROM Jaeger WHERE status = 'Destroyed';