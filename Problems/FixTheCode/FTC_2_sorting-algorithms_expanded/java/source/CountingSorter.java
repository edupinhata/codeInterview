public class CountingSorter implements Sorter{

    public CountingSorter(){}

    public int[] Sort(int[] array){
        System.out.println("Sorting array using COUNTING SORT.");

        int[] sortedArray = array.clone();
        int maxValue =  getMaxValue(sortedArray);

        int[] countArray = new int[maxValue + 1];

        countNumbers(sortedArray, countArray);
        sortedArray = getSortedArray(countArray, sortedArray.length);

        return sortedArray;
    }

    public int getMaxValue(int[] array){
        int maxValue = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }


    private void countNumbers(int[] sortedArray, int[] countArray){
        for (int i=0; i<sortedArray.length; i++){
            int indexToBeAdded = sortedArray[i];
            countArray[indexToBeAdded]++;
        }
    }

    private int[] getSortedArray(int[] countArray, int sortedArrayLength){
        int[] sortedArray = new int[sortedArrayLength];
        int sortedIndex = 0;
        for (int i=0; i<countArray.length; i++){
            if (countArray[i] > 0){
                for (int j=0; j<countArray[i]; j++) {
                    sortedArray[sortedIndex] = i;
                    sortedIndex++;
                }
            }
        }
        return sortedArray;
    }
}