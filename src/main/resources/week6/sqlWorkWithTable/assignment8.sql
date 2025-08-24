--- test veritabanınızda employee isimli sütun bilgileri id(INTEGER),
--- name VARCHAR(50), birthday DATE, email VARCHAR(100)olan bir tablo oluşturalım.
CREATE TABLE employee (
id SERIAL PRIMARY KEY,
name VARCHAR(50),
birthday DATE,
email VARCHAR(100)
);

--- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
INSERT INTO employee (name, birthday, email) VALUES
('John Doe', '1985-06-15', 'johndoe@example.com'),
........

--- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET email = 'updated.johndoe@example.com'
WHERE id = 1;

UPDATE employee
SET birthday = '1990-01-01'
WHERE name = 'Jane Smith';

UPDATE employee
SET name = 'Ahmet Yılmaz'
WHERE email = 'ali.yilmaz@example.org';

UPDATE employee
SET email = 'new.birthday@example.com'
WHERE birthday = '1985-06-15';

UPDATE employee
SET email = 'seda.arslan@updated.com',
    birthday = '1995-05-05'
WHERE name = 'Seda Arslan';

--- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE id = 10;

DELETE FROM employee
WHERE name = 'Jane Smith';

DELETE FROM employee
WHERE birthday = '1985-06-15';

DELETE FROM employee
WHERE email = 'ali.yilmaz@example.org';

DELETE FROM employee
WHERE birthday < '1990-01-01';

