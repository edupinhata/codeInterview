public class BubbleSorter implements Sorter{

    public BubbleSorter(){}

    public int[] Sort(int[] array){
        System.out.println("Sorting array using BUBBLE SORT");
        int[] sortedArray = array.clone();
        int arrayLength = sortedArray.length;

        for (int i = 1; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength - i; j++) {
                if (sortedArray[j] < sortedArray[j+1]){
                    Arrays.SwapTwoNumbers(sortedArray, j, j+1);
                }
            }
        }

       return sortedArray;
    }
}