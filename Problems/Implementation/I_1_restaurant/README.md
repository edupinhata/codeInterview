
## Implementation: Restaurant


### <u>Problem</u>

A local restaurant wants to modernize how they work now that the son of the owner will 
manage it. He is your friend so he asks you to make a system that will resume the 
orders information and display to the customers as required.
He will take each client order in a list that follows the specific rules:

- The first line will have the number **N** of dishes noted by the waiter;
- The second line will have the number **P** of people in the table;
- The next **N** lines will have the name of the dish and the price of it;

*Example of input:*
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

*Output for example input:*

```vim
Dish1 | 2x | 30
Dish8 | 1x | 20
Dish3 | 1x | 7
Dish2 | 1x | 6
=====================
Total: $63
Total per person: $31.5
```

### <u>Procedures suggestion:</u>
1. Create a class OrderItem with the following attributes: dishName, price, amount
2. Create a constructor of OrderItem to receive dishName and price
3. Read the file to get number of dishes and number of people
4. Read each dish and do: split name from price and create a OrderItem with it.
5. Create a function that prints all the OrderItem values.
6. The function from step 5. can calculate and display the total.
7. Sort the dishes by price.

### <u>Instructions</u>
1. Download the Problem 3 folder for the needed resources [clicking here](https://github.com/edupinhata/codeInterview/blob/main/Problems/Implementation/I_1_restaurant/inputFiles.zip#:~:text=Raw-,View%20raw,-codeInterview/Problems/Implementation).
2. This folder will contain the input file that should be used in the program.


<details>
    <summary>Example of how to read files in Java</summary>

```vim
import java.util.Scanner;
import java.io.FileNotFoundException; 
import java.io.File;

class Main {
  public static void main(String[] args) {
   File f = new File("fileToRead.txt");
    try{
      Scanner s = new Scanner(f);
      System.out.println(s.nextLine());
      
    }catch(FileNotFoundException e){
      e.printStackTrace();
    }
  }
}
```
</details>
