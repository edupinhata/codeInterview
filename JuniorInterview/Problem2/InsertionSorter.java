public class InsertionSorter implements Sorter{

    public InsertionSorter(){}

    public int[] Sort(int[] array){
        System.out.println("Sorting with Insertion Sort.");

        int[] sortedArray = array.clone();
        boolean changed;

        do{
            changed = false;

            for (int i=0; i<sortedArray.length-2; i++)
            {
                if(sortedArray[i] < sortedArray[i+1]){
                   int tmp = sortedArray[i];
                   sortedArray[i] = sortedArray[i+1];
                   sortedArray[i+1] = tmp;
                   changed = true;
                }
            }
        }while(changed);

        return sortedArray;
    }

}