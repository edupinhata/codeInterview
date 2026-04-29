from bubbleSorter import BubbleSorter
from insertionSorter import InsertionSorter
from customSorter import CustomSorter

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