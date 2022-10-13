# Pleno Level Interview

Welcome to Thales code interview for Pleno level. The following problems were designed so we can understand a little bit more about your coding skills.

For this challenge, you'll share your screen with us while you go through the problems.

This are the skills that we'll avaliate during the interview:
- Problem solving skill
- Thinking process to get to the solution
- Strategy to get solution when you don't have the tools memorized.
- Architecture knowledge
- Code design techniques

**OBS:** You can search syntax and solutions in the internet.

---

### **<u>Requirements:</u>**

For this test, you'll need:

- Connection to the internet
- Access to a brownser
- Account in [github](https://github.com)

### Implementation environment

- If you need an implementation environment, you might use [repl.it](https://repl.it) site.

### **<u>Time limit</u>**

The problems should be solved in a time limit of 1 hour.

### **<u>Languages</u>**

You can choose one of the following languages to solve the problems, although the preference will be Java:

- Java
- Python
- C++
- Javascript (Node)

### **<u>Problems resume</u>**

You can solve the problems in which order you prefer.

- **Problem 1**: Make a code review.
- **Problem 2**: implementation. 

---

## Problem 1: Make a code review

You started a small company and is doing a small program to your friend that has a restaurant and wants a program to resume the tabs information.

The raw order get by the waiters follow this structure: 

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
Num. of people: 2
Total per person: $31.5
```

The intern of your team openned this [pull request](https://github.com/edupinhata/codeInterview/pull/1/files) to improve the code. Since they doesn't have much experience, they might have made some bad choices during implementation.
Make comments in the PR that you think it's necessary to be fixed or improved.

OBS: these are the outputs without the PR and with PR:
### Output Wihtout PR for Order1 file
```vim
Dish10 | 8.0
Dish4 | 15.0
Dish3 | 3.0
Dish4 | 15.0
Dish3 | 3.0
===========================
Total: R$64.00
Num. of people: 3
Total per person: $21.33
```

### Output With PR for Order1 file
```vim
Dish4      |  2x | 30.00
Dish1      |  1x | 20.00
Dish10     |  1x | 8.00
Dish3      |  2x | 6.00
=========================
Total: $64.00
Num of people: 3
Total per person: $21.33
```

---

## Problem 2: Implementation

After make the resume of each order, now your friend wants to add a module that will resume all the Dishes information from the month.
This module should read all the Orders, and display how many of each dish was sold. You need also to calculate:
- the gross income,
- how much taxes you should pay;
- the net income after costs and taxes.

Consider the following extra information:

- The file `resources/CostsAndPrices` will contain the cost to prepare each dish and the price that it's sold; 
- Now the orders will not contain the price of the dishes, only it's name.
- The orders files will be located in  `resources/orders/`;

You should:
<ol type="a">
<li>Think and expose the design of the solution to add these new functionalities. Use your prefered way to explain the solution considering the timeframe you have;</li> 
<li>Implement your solution.</li> 
</ol>

**OBS:** *you can use other language, but the code with part of the solution will be Java.*