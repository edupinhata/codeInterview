## Database: Write simple SQL queries 

### <u>Problems </u>

Given the tables bellow, write queries that return the following data:

a. Make a query that return the name of people that has credit limit above 1500.

b. Make a query that return the **name** and **cnpj** of the people that are a legal person. Expected result:

| name                            | cnpj            |
|---------------------------------|-----------------|
| Nicolas Diogo Cardoso           | 85883842000191  |
| Sabrina Heloisa Gabriela Barros | 47773848000117  |


### <u>Tables</u>

**TABLE:** customers

| id | name                                    | street                                | city          | state | credit_limit |
|----|-----------------------------------------|---------------------------------------|---------------|-------|--------------|
| 1  | Nicolas Diogo Cardoso                   | Acesso Um                             | Porto Alegre  | RS    | 475          |
| 2  | Cecília Olivia Rodrigues                | Rua Sizuka Usuy                       | Cianorte      | PR    | 3170         |
| 3  | Augusto Fernando Carlos Eduardo Cardoso | Rua Baldomiro Koerich                 | Palhoça       | SC    | 1067         |
| 4  | Nicolas Diogo Cardoso                   | Acesso Um                             | Porto Alegre  | RS    | 475          |
| 5  | Sabrina Heloisa Gabriela Barros         | Rua Engenheiro Tito Marques Fernandes | Porto Alegre  | RS    | 4312         |
| 6  | Joaquim Diego Lorenzo Araújo            | Rua Vitorino                          | Novo Hamburgo | RS    | 2314         |


**TABLE:** legal_person

| id_customers | cnpj           | contact    |
|--------------|----------------|------------|
| 4            | 85883842000191 | 99767-0562 |
| 5            | 47773848000117 | 99100-8965 |


This tables may be added by the following instruction:

### <u>Setup Instructions</u>

1. Create a new [Repl](https://replit.com/) of type **SQLite**.
2. Paste the following code and execute it:
```vim
DROP TABLE IF EXISTS legal_person;
DROP TABLE  IF EXISTS customers;

CREATE TABLE customers (
  id INT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  street VARCHAR(255) NOT NULL,
  city VARCHAR(255) NOT NULL,
  state VARCHAR(2) NOT NULL,
  credit_limit INT
);

INSERT INTO customers (id, name, street, city, state, credit_limit)
VALUES (1, 'Nicolas Diogo Cardoso', 'Acesso Um', 'Porto Alegre', 'RS', 475),
       (2, 'Cecília Olivia Rodrigues', 'Rua Sizuka Usuy', 'Cianorte', 'PR', 3170),
       (3, 'Augusto Fernando Carlos Eduardo Cardoso', 'Rua Baldomiro Koerich', 'Palhoça', 'SC', 1067),
       (4, 'Nicolas Diogo Cardoso', 'Acesso Um', 'Porto Alegre', 'RS', 475),
       (5, 'Sabrina Heloisa Gabriela Barros', 'Rua Engenheiro Tito Marques Fernandes', 'Porto Alegre', 'RS', 4312),
       (6, 'Joaquim Diego Lorenzo Araújo', 'Rua Vitorino', 'Novo Hamburgo', 'RS', 2314);


CREATE TABLE legal_person (
  id_customers INT NOT NULL,
  cnpj VARCHAR(14) PRIMARY KEY,
  contact VARCHAR(20) NOT NULL,
  FOREIGN KEY (id_customers) REFERENCES customers(id)
);

INSERT INTO legal_person (id_customers, cnpj, contact)
VALUES (4, '85883842000191', '99767-0562'),
       (5, '47773848000117', '99100-8965');
```
