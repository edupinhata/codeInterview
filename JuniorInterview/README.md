# Code Interview

Welcome to Thales code interview. The following problems were designed so we can 
understand a little bit more about your coding skills.

For this challenge, you'll share your screen with us while you go through the problems. 
It's really important to get the Problems right, but more than this we'll check other 
skills like:
- Problem solving skill
- Thinking process to get to the solution
- Strategy to get solution when you don't have the tools memorized.

---

**<u>Requirements:</u>**

For this test, you'll need:

- Connection to the internet
- Computer
- Access to a brownser
- All problems will be implemented in the [repl.it](https://repl.it) site.

**<u>Time limit</u>**

The problems should be solved in a time limit of 1 hour.


**<u>Languages</u>**

You can choose one of the following languages to solve the problems:

- Java
- Python
- C++
- Javascript (Node) 

---

## Problem 1 - Restaurant

**<u>Instructions</u>**
1. Download the Problem 1 folder for the needed resources.
2. This folder will contain the input file that should be used in the program.

**<u>Problem</u>**

A local restaurant wants to modernize how they work now that the son of the owner will 
manage it. He is your friend so he asks you to make a system that will resume the 
orders information and display to the customers as required.
He will take each client order in a list that follows the specific rules:

- The first line will have the number **N** of dishes noted by the waiter;
- The second line will have the number **P** of people in the table;
- The next **N** lines will have the name of the dish and the price of it;

```vim
5
2
Dish1 15
Dish3 7
Dish1 15
Dish8 20
Dish2 6
```

The output should be a list with the dishes sorted by total value of the dishes.
Each line of this list will gather the equal dishes, display the amount of dishes 
order and the total.
After all items, make a separator (e.g. ====================), and add the following
information: value of the tab, value for each person. The example above will 
have the following result:

```vim
Dish1 | 2x | 30
Dish8 | 1x | 20
Dish3 | 1x | 7
Dish2 | 1x | 6
=====================
Total: $63
Total per person: $31.5
```


## Problem 2 - Fix the code

**<u>Instructions</u>**

1. Download the Problem 2 folder.
2. Create a Repl and add the folder into it.

**<u>Problem</u>**

This folder contains a code that ....
The code will not run because there are errors. You should:

1. Fix all the errors.
2. (Optional) After fix the errors, you can improve the code quality to make it easier to read, more organized, or even more optimized.

## Problem 3 - SQL

### <u>Schemas</u>

**TABLE:** customers

| Column       | Type                    |
|--------------|-------------------------|
| id (PK)      | numeric                 |
| name         | character varying (255) |
| street       | character varying (255) |
| city         | character varying (255) |
| state        | char (2)                |
| credit_limit | numeric                 |

**TABLE:** legal_person

| Column            | Type              |
|-------------------|-------------------|
| id_customers (FK) | numeric           |
| cnpj              | char (18)         |
| contact           | character varying |



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


1. Make a query that return the name of people that has credit limit above 1500.

2. Make a query that return the name of the people that are a legal person. Expected result:

| name                            |
|---------------------------------|
| Nicolas Diogo Cardoso           |
| Sabrina Heloisa Gabriela Barros |