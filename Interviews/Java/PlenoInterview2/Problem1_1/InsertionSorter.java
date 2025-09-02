public class InsertionSorter implements Sorter{

    public InsertionSorter(){}

    public int[] Sort(int[] array){
        System.out.println("Sorting with Insertion Sort.");

        int[] sortedArray = array.clone();

        for (int i=2; i<sortedArray.length-2; i++)
        {
            int j = i;
            while(j>0 && sortedArray[j-1] < sortedArray[j]) {
                int tmp = sortedArray[j];
                sortedArray[j] = sortedArray[j - 1];
                sortedArray[j - 1] = tmp;
                j--;
            }
        }
        return sortedArray;
    }

}