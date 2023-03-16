// Program that will have some sort algorithms for integer arrays

class SorterMain {

    public static void main(String[] args) {
        System.out.println("Running some sorters...");
        System.out.println("==========================");

        int[] array = {4, 3, 10, 1, 5, 2, 2, 8, 23, 2, 8, -1};

        Sorter sorter = new BubbleSorter();
        int sortedArray[] = sorter.Sort(array);
        PrintArray(sortedArray);

        sorter = new InsertionSorter();
        sortedArray = sorter.Sort(array);
        PrintArray(sortedArray);
    }

    public static void PrintArray(int[] array){
        String arrayStr = "";
        for (int i=0; i<array.length; i++){
           arrayStr += array[i];
           if (i<array.length-1)
               arrayStr += ", ";
        }
        System.out.println(arrayStr);
    }
}