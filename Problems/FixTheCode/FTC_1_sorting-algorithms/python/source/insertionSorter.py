from customSorter import CustomSorter
from arrays import swapTwoNumbers

class InsertionSorter(CustomSorter):

    def sort(self):
        print("Sorting with Insertion Sort.")

        arraySize = len(self.array)
        for i in range(1, arraySize-2):
            j = i
            while j > 0 and self.array[j - 1] < self.array[j]:
                swapTwoNumbers(self.array, j, j - 1)
                j -= 1