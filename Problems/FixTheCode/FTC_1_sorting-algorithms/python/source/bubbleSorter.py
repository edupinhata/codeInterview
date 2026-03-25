from customSorter import CustomSorter
from arrays import swapTwoNumbers

class BubbleSorter(CustomSorter):

    def sort(self):
        print("Sorting array using Bubble Sort")
        arrayLen = len(self.array)

        for i in range(arrayLen):
            for j in range(arrayLen - i):
                if (self.array[j] > self.array[j+1]):
                    swapTwoNumbers(self.array, j, j+1)