from bubbleSorter import BubbleSorter
from customSorter import CustomSorter 
from insertionSorter import InsertionSorter
from selection_sorter import SelectionSorter
from performance_test import PerformanceTest
import random

class SorterMain:

    def execute(self):
        self.execute_sorting_tests()
        self.execute_performance_tests()

    def print_array(self, array):
        array_str = ""
        for i in range(len(array)):
            array_str += str(array[i])
            if i < len(array) - 1
                array_str += ", "
        print(array_str)

    def execute_sorting_tests(self):
        print("Running some sorters...")
        print("==========================")

        array = [4, 3, 10, 1, 5, 2, 2, 8, 23, 2, 8, 13]

        sorter = BubbleSorter(array)
        sorter.sort()
        sorted_array = sorter.array
        self.print_array(sorted_array)

        sorter = CustomSorter(array)
        sorter.sort()
        sorted_array = sorter.array
        self.print_array(sorted_array)

        sorter = InsertionSorter(array)
        sorter.sort()
        sorted_array = sorter.array
        self.print_array(sorted_array)

    def execute_performance_tests(self):
        print("\nRunning performance tests...")
        print("==========================")

        test = PerformanceTest()
        test_array_size = 5000
        large_array = [random.randint(0, test_array_size) for _ in range(test_array_size)]
        
        expected_sorted_array = sorted(large_array)

        test.evaluate_performance(BubbleSorter(large_array.copy()), large_array.copy(), expected_sorted_array)
        test.evaluate_performance(SelectionSorter(large_array.copy()), large_array.copy(), expected_sorted_array)
        test.evaluate_performance(InsertionSorter(large_array.copy()), large_array.copy(), expected_sorted_array)


if __name__ == "__main__":
    main = SorterMain()
    main.execute()