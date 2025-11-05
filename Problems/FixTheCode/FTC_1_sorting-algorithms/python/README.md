## Fix The Code: Sorting algorithms

### <u>Context</u>

The source folder contains a code with some [sorting algorithms](https://en.wikipedia.org/wiki/Sorting_algorithm) for integer arrays, which are algorithms that organize elements by how each element is compared to other. For example, we can sort an integer array from the smaller to the greater number. Or we can sort strings alphabetically.

Among the sorting algorithms, there are the Bubble Sorter and the Insertion Sorter. The following gif example shows visualy how these algorithms works and how they're implemented in the code of this problem

#### <u>Examples</u>

##### Bubble Sort simulation example

![](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)

##### Insertion Sort simulation example

![](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

---

### <u>The Problem</u>

In this problem:
- There are syntax error that will raise some errors
- There are some runtime errors that will make the program to crash or behave unexpectedly.
- There are some semantic errors that will make the program to run, but will return the wrong result.

a. Fix all syntax errors, so the program runs without errors.

b. Fix all runtime errors so the program run without crash.

c. Fix all semantic errors so the array is sorted from the **smaller number to the greater number**.

d. At the end you must run the Bubble Sort and Insertion Sort algorithms.

---



### <u>Setup instructions For local development</u>

1. Download the Source folder [clicking here](https://github.com/edupinhata/codeInterview/raw/main/Problems/FixTheCode/FTC_1_sorting-algorithms/python/source.zip).
2. Execute using `python main.py`

---

### <u>Setup instructions For browser development</u>

1. Access [GDB Online](https://www.onlinegdb.com/). 

2. Change the language to Python 3.

3. Paste the following code in the text area: 

```vim
def swapTwoNumbers(array, i, j):
    array[i], array[j] = array[j], array[i]
    
class CustomSorter:
    def __init__(self, array):
        self.array = array.copy()

    def sort(self):
        print("Sorting array using default python sort function")
        self.array.sort(reverse=True)

    def print(self):
        arrayStr = ""
        arraySize = len(self.array)

        for i in range(arraySize):
            arrayStr += str(self.array[i])
            if i < arraySize-1
                arrayStr += ", "
        print(arrayStr)
    
class BubbleSorter(CustomSorter):

    def sort(self):
        print("Sorting array using Bubble Sort")

        moved = True
        while(moved):
            moved = False
            for i in range(len(self.array)):
                if (self.array[i] > self.array[i+1]):
                    swapTwoNumbers(self.array, i, i+1)
                    moved = True
                    
class InsertionSorter(CustomSorter):

    def sort(self):
        print("Sorting with Insertion Sort.")

        arraySize = len(self.array)
        for i in range(1, arraySize-2):
            j = i
            while j > 0 and self.array[j - 1] < self.array[j]:
                swapTwoNumbers(self.array, j, j - 1)
                j -= 1
                
class SorterMain:

    def execute(self):
        print("Running some sorters...")
        print("==============================")

        array = [4, 3, 10, 1, 5, 2, 2, 8, 23, 2, 8, -1]

        print("== Example of BUBBLE SORT")
        sorter = BubbleSorter(array)
        sorter.sort()
        sorter.print()

        print("\n== Example of INSERTION SORT")
        sorter = CustomSorter(array)
        sorter.sort()
        sorter.print()


main = SorterMain()
main.execute()
```