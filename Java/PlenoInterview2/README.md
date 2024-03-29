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

- You'll have 15 minutes to read CAREFULLY this file, get used to what to do. During this time you can't:
  - Solve any exercice
  - Read any code
- You'll have 1 hour to work in the problems. We don't expect to solve all of them, but it's good to get as far as you can.

### **<u>Languages</u>**

You can choose one of the following languages to solve the problems, although the preference will be Java:

- Java
- Python
- C++
- Javascript (Node)

---

## Problems

### **<u>Problems resume</u>**

You can solve the problems in which order you prefer.

- **Problem 1_1**: Fix the code.
- **Problem 2_1**: Make a code review.
- **Problem 2_2**: Implementation. 

## Problem 1_1 - Fix the code

You are working in a library that will contain several sorting algorithms. You got a job that an intern was doing and couldn't continue. There are some compile errors and logical errors that you should fix.

### <u>Instructions</u>

1. Download the Problem 1_1 folder [clicking here](https://github.com/edupinhata/codeInterview/raw/main/Java/PlenoInterview2/Problem1_1.zip).
2. Create a Repl of **Java** with the name **SorterMain**

![Create_replit](https://user-images.githubusercontent.com/6368537/191853628-4207221c-39f4-4950-afd4-ce33ce8fb15c.PNG)

![Create_replit2](https://user-images.githubusercontent.com/6368537/191852909-b05100ba-51bb-4ceb-a6af-0b2d464813fa.PNG)

3. Add the files of Problem1 folder in the Repl.it created on step 2. Either drag and drop, or use the upload function in the three dots menu of repl.it. !!! Don't upload the folder, but only the files to repl.it !!!
4. To compile, run in the terminal of repl.it (right side) the following command:
> sh compile.sh
5. When the compilation don't give any errors, run with the command:
> sh run.sh


### <u>Problem</u>

The downloaded folder contains a code with some sorting algorithms for integer arrays.

- The code will not run because there are errors.
- There are some logical errors that will make the algorithms run wrongly.

1.  Fix all the errors. So the program compile.
2.  Fix all logical errors so the array is sorted from the smaller number to the greater number in all algorithms.
3.  (Optional) After fix the errors, you can improve the code quality to make it easier to read, more organized, or even more optimized.

---

## Problem 2_1 and 2_2 context

You owns a small programming company made up of you and an intern. You started to develop a software to a restaurant. 
The problems will simulate a day by day routine of software development: code reviews, 
implementation, thinking in solutions for clients requirement, etc.


## Problem 2_1: Make a code review

### Input

The waiters get client orders and each table orders are saved in a file following the bellow structure:

- The first line will have the number **N** of dishes noted by the waiter;
- The second line will have the number **P** of people in the table;
- The next **N** lines will have the name of the dish and the price of it separated by one space;

```vim
5
2
Dish1 15
Dish3 7
Dish1 15
Dish8 20
Dish2 6
```

**Considerations**

- You should consider that the input files will always be right and right formatted as specified, so you don't need to worry about error checking.

### Output

The output should be a list with the dishes **sorted by total value of the dishes**.

The output will have the following structure:

- For each dish: 
  - `name of dish`  |  `amount of this dish ordered` | `total price for all of this dishes`
- separator (e.g. `=============================`)
- Total of all orders
- Number of people in the table
- Total per person when tab is split equally per person

The example above will have the following result:

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

The intern of your team openned this [pull request](https://github.com/edupinhata/codeInterview/pull/1/files) to improve the code already done. 
Since they doesn't have much experience, they might have made some bad choices during implementation.
Make comments in the PR that you think it's necessary to be fixed or improved.

### Output when running the code
Bellow, there are the outputs without the PR and with PR:

#### Output Wihtout PR for Order1 file
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

#### Output With PR for Order1 file
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

## Problem 2_2: Implementation

After make the resume of each order, your client wants to add a module that will resume all the Dishes information from the month.

This module should read all the Orders, and display how many of each dish was sold. You need also to calculate:
- the gross income;
- the net income after costs;
- how much taxes you should pay.

Consider the following extra information:

- The file `resources/CostsAndPrices` will contain the cost to prepare each dish and the price that it's sold; 
- Now the orders will not contain the price of the dishes, only it's name.
- The orders files will be located in  `resources/orders/`;
- Taxes are 6% over the net income.
- Resources folder can be [downloaded here](https://github.com/edupinhata/codeInterview/raw/main/Java/PlenoInterview2/Problem2_2/resources.zip).

**You should:**
<ol type="a">
<li>Think and expose the design of the solution to add these new functionalities. Use your prefered way to explain the solution considering the timeframe you have;</li> 
<li>Implement your solution.</li> 
</ol>

Your solution can contain only part of the solution that will fit in the timeframe that is left to finish the test.

**OBS:** *you can use other language, but the implemented code with part of the solution will be Java. You can [download it here.](https://github.com/edupinhata/codeInterview/raw/main/Java/PlenoInterview/Problem1.zip)*
