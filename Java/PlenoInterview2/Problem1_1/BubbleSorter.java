public class BubbleSorter implements Sorter{

    public BubbleSorter(){}

    public int[] Sort(int[] array){
        System.out.println("Sorting array using Bubble Sort");
       int[] sortedArray = array.clone();
       boolean moved;

       do {
           moved = false;
           for (int i = 0; i < sortedArray.length; i++) {
               if (sortedArray[i] > sortedArray[i+1]){
                   int tmp = sortedArray[i];
                   sortedArray[i] = sortedArray[i+1];
                   sortedArray[i+1] = tmp;
                   moved = true;
               }
           }
       }while (moved);

       return sortedArray;
    }
}