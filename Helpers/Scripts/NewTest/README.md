# Code Interview

Welcome to Thales code interview. The following problems were designed so we can understand a little bit more about your coding skills.

For this challenge, you'll share your screen with us while you go through the problems. 
It's really important to get the Problems right, but more than the following skills will be evaluated:

- Problem solving skill
- Thinking process to get to the solution
- Strategy to get solution when you don't have the tools memorized.

**OBS:** Feel free to search syntax in the internet. You can also search for solutions, but since the process to solve the problem is evaluated, the less the better.

---

### **<u>Requirements:</u>**

For this test, you'll need:

- Connection to the internet
- Access to a brownser

### Implementation environment

- All problems will be implemented in the [repl.it](https://repl.it) site.

### **<u>Time limit</u>**

- You'll have 15 minutes only to read this document. You can't solve anything within this time. You can read code as well.
- The problems should be solved in a time limit of 1 hour.


### **<u>Languages</u>**

You can choose one of the following languages to solve the problems:

- Java
- Python
- C++
- Javascript (Node) 

There is no extra points for an specific language, so use the one you feel more 


---
## Fix The Code: Sorting algorithms

### <u>Problem</u>

The source folder contains a code with some [sorting algorithms](https://en.wikipedia.org/wiki/Sorting_algorithm) for integer arrays.

In this problem:
- There are syntax error that will prevent the program to be compiled.
- There are some runtime errors that will make the program to crash or behave unexpectedly.
- There are some semantic errors that will make the program to run, but will return the wrong result.

a. Fix all syntax errors, so the program compile.

b. Fix all runtime errors so the program run without crash.

c. Fix all semantic errors so the array is sorted from the *smaller number to the greater number*.

d. (Optional) After fix the errors, you can improve the code quality to make it easier to read, more organized, or even more optimized.


### <u>Setup Instructions</u>

1. Download the Source folder [clicking here](https://github.com/edupinhata/codeInterview/raw/main/Problems/FixTheCode/FTC_Problem_1_1/source.zip).
2. Create a Repl of **Java** with the name **SorterMain**

![Create_replit](https://user-images.githubusercontent.com/6368537/191853628-4207221c-39f4-4950-afd4-ce33ce8fb15c.PNG)

![Create_replit2](https://user-images.githubusercontent.com/6368537/191852909-b05100ba-51bb-4ceb-a6af-0b2d464813fa.PNG)

3. Add the files of Problem1 folder in the Repl.it created on step 2. Either drag and drop, or use the upload function in the three dots menu of repl.it.  !!! Don't upload the folder, but only the files to repl.it !!!
4. To compile, run in the terminal of repl.it (right side) the following command:
> sh compile.sh
5. When the compilation don't give any errors, run with the command:
> sh run.sh

### <u>Examples</u>

#### Bubble Sort simulation example

![](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)

#### Insertion Sort simulation example

![](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

---
## Make a Code Review: Restaurant


You owns a small programming company composed by you and an intern. You started to develop a software to display information about orders in a restaurant. 

The software that you are developing will read the orders noted by the waiters and will resume the information and display in a better way to the user. Consider the following input and outputs:

### Input

The waiters get client orders and each table order is saved in a file following the bellow structure:

- The first line will have the number **N** of dishes noted by the waiter;
- The second line will have the number **P** of people in the table;
- The next **N** lines will have the name of the dish and the price of it separated by one space;

```vim
5
2
Dish1 15
Dish3 7.5
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

The input example above will have the following result:

```vim
Dish1 | 2x | 30.00
Dish8 | 1x | 20.00
Dish3 | 1x | 7.50
Dish2 | 1x | 6.00
=====================
Total: $63.50
Num. of people: 2
Total per person: $31.75
```

The intern of your team openned this [pull request](https://github.com/edupinhata/codeInterview/pull/1/files) to improve the code already done. 
Since they doesn't have much experience, they might have made some bad choices during implementation.
Make comments in the PR that you think it's necessary to be fixed or improved.

### Output when running the code
Bellow, there are the outputs without the PR and with PR:

#### Output Wihtout PR for Order1 file
```vim
Dish10 | 8.00
Dish4 | 15.00
Dish3 | 3.00
Dish4 | 15.00
Dish3 | 3.00
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

## Implementation:  Restaurant 2

### <u>Context</u>

In your company, there is a module that resumes information about orders taken from from waiters in a restaurant and resume the information.
The example bellow of inputs and outputs of this program:

### Input

- The first line will have the number **N** of dishes noted by the waiter;
- The second line will have the number **P** of people in the table;
- The next **N** lines will have the name of the dish and the price of it separated by one space;

```vim
5
2
Dish1 15
Dish3 7.5
Dish1 15
Dish8 20
Dish2 6
```

**Considerations**

- You should consider that the input files will always be right and right formatted as specified, so you don't need to worry about error checking.

### Output

The output is a list with the dishes **sorted by total value of the dishes**.

The output has the following structure:

- For each dish:
    - `name of dish`  |  `amount of this dish ordered` | `total price for all of this dishes`
- separator (e.g. `=============================`)
- Total of all orders
- Number of people in the table
- Total per person when tab is split equally per person

The input example above will have the following result:

```vim
Dish1 | 2x | 30.00
Dish8 | 1x | 20.00
Dish3 | 1x | 7.50
Dish2 | 1x | 6.00
=====================
Total: $63.50
Num. of people: 2
Total per person: $31.75
```


### <u>Problem</u>

Now, your client wants to add a module that will resume all the Dishes information from the month.

This module should read all the Orders, and display how many of each dish was sold. You need also to calculate:
- the gross income;
- the net income after costs;
- how much taxes you should pay.

Consider the following extra information:

- The file `resources/CostsAndPrices` will contain the cost to prepare each dish and the price that it's sold;
- Now the orders will not contain the price of the dishes, only it's name.
- The orders files will be located in  `resources/orders/`;
- Taxes are 6% over the net income.
- Resources folder can be [downloaded here](https://github.com/edupinhata/codeInterview/raw/main/Java/PlenoInterview/Problem2/resources.zip).

**You should:**
<ol type="a">
<li>Think and expose the design of the solution to add these new functionalities. Use your prefered way to explain the solution considering the timeframe you have;</li> 
<li>Implement your solution.</li> 
</ol>

Your solution can contain only part of the solution that will fit in the timeframe that is left to finish the test.

**OBS:** *you can use other language, but the implemented code with part of the solution will be Java. The resources folder also contains the Java implementation of it.
