from customSorter import CustomSorter
from arrays import swapTwoNumbers

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