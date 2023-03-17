public class InsertionSorter implements Sorter{

    public InsertionSorter(){}

    public int[] Sort(int[] array){
        System.out.println("Sorting with Insertion Sort.");

        int[] sortedArray = array.clone();

        for (int i=1; i<sortedArray.length-2; i++)
        {
            int j = i;
            while(j>0 && sortedArray[j-1] < sortedArray[j]) {
                Arrays.SwapTwoNumbers(sortedArray, j, j-1);
                j--;
            }
        }
        return sortedArray;
    }

}