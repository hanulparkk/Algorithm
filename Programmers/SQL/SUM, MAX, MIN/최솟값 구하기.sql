#First Solution
SELECT DATETIME
FROM ANIMAL_INS
ORDER BY DATETIME ASC
LIMIT 1;

#Second Solution
SELECT MIN(DATETIME) DATETIME
FROM ANIMAL_INS;