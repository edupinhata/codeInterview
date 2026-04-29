public class SelectionSorter implements Sorter {

    public SelectionSorter(){}

    public int[] Sort(int[] array){
        System.out.println("Sorting array using SELECTION SORT.");

        int[] sortedArray = array.clone();

        for (int i=0; i<sortedArray.length-1; i++)
        {
            int minIndex = i;
            for (int j=i+1; j<sortedArray.length-2; j++){
                if (sortedArray[j] > sortedArray[minIndex]){
                    minIndex = j;
                }
            }
            Arrays.SwapTwoNumbers(sortedArray, i, minIndex);
        }
        return sortedArray;
    }
}
