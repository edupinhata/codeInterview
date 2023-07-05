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

