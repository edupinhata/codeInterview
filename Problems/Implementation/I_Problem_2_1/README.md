## Implementation - Problem 2-1: Restaurant 2

### Context

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

---

### Problem

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
- Resources folder can be [downloaded here](https://github.com/edupinhata/codeInterview/raw/main/Problems/Implementation/I_Problem_2_1/resources.zip).

**You should:**
<ol type="a">
<li>Think and expose the design of the solution to add these new functionalities. Use your prefered way to explain the solution considering the timeframe you have;</li> 
<li>Implement your solution.</li> 
</ol>

Your solution can contain only part of the solution that will fit in the timeframe that is left to finish the test.

**OBS:** *you can use other language, but the implemented code with part of the solution will be Java. The resources folder also contains the Java implementation of it.
