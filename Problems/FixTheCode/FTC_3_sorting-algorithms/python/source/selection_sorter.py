from customSorter import CustomSorter
from arrays import swapTwoNumbers

class SelectionSorter(CustomSorter):

    def sort(self):
        print("Sorting array using SELECTION SORT.")
        array_len = len(self.array)

        for i in range(array_len):
            min_index = i
            for j in range(i + 1, array_len):
                if self.array[j] > self.array[min_index]:
                    min_index = j
            swapTwoNumbers(self.array, i, min_index)