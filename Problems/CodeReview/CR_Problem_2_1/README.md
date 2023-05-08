## Make a Code Review - Problem 2-1: Restaurant


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
