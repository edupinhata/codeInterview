// Program that will have some sort algorithms for integer arrays

class Main {

    public static void main(String[] args) {
        executeSortingTests();
        executePerformanceTests();
    }

    public static void PrintArray(int[] array){
        String arrayStr = "";
        for (int i=0; i<array.length; i++){
           arrayStr += array[i];
           if (i<array.length-1)
               arrayStr += ", "
        }
        System.out.println(arrayStr);
    }

    private static void executeSortingTests(){
        System.out.println("Running some sorters...");
        System.out.println("==========================");

        int[] array = {4, 3, 10, 1, 5, 2, 2, 8, 23, 2, 8, 13};

        Sorter sorter = new BubbleSorter();
        int sortedArray[] = sorter.Sort(array);
        PrintArray(sortedArray);

        sorter = new SelectionSorter();
        int sortedArray[] = sorter.Sort(array);
        PrintArray(sortedArray);

        sorter = new InsertionSorter();
        sortedArray = sorter.Sort(array);
        PrintArray(sortedArray);

    }


    private static void executePerformanceTests(){
        System.out.println("\nRunning performance tests...");
        System.out.println("==========================");

        PerformanceTest test = new PerformanceTest();
        int testArraySize = 50000;
        int[] largeArray = new int[testArraySize];
        for (int i=0; i<largeArray.length; i++){
            largeArray[i] = (int)(Math.random() * testArraySize);
        } 
        int[] expectedSortedArray = largeArray.clone();
        java.util.Arrays.sort(expectedSortedArray);

        test.EvaluatePerformance(new BubbleSorter(), largeArray, expectedSortedArray);
        test.EvaluatePerformance(new SelectionSorter(), largeArray, expectedSortedArray);
        test.EvaluatePerformance(new InsertionSorter(), largeArray, expectedSortedArray);
    }
}