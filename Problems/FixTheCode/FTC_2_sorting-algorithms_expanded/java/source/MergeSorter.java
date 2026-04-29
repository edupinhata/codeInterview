public class MergeSorter implements Sorter{
    
        public MergeSorter(){}
    
        public int[] Sort(int[] array){
            System.out.println("Sorting array using MERGE SORT.");
    
            int[] sortedArray = array.clone();
            sortedArray = mergeSort(sortedArray, 0, sortedArray.length-1);
    
            return sortedArray;
        }
    
        private int[] mergeSort(int[] array, int left, int right){
            if (left >= right){
                return new int[]{array[left]};
            }
    
            int middleIndex = (left + right) / 2;
            int[] leftHalf = mergeSort(array, left, middleIndex);
            int[] rightHalf = mergeSort(array, middleIndex + 1, right);
    
            return merge(leftHalf, rightHalf);
        }
    
        private int[] merge(int[] leftHalf, int[] rightHalf){
            int[] mergedArray = new int[leftHalf.length + rightHalf.length];
            int leftIndex = 0;
            int rightIndex = 0;
            int mergedIndex = 0;
    
            while (leftIndex < leftHalf.length && rightIndex < rightHalf.length){
                if (leftHalf[leftIndex] < rightHalf[rightIndex]){
                    mergedArray[mergedIndex] = leftHalf[leftIndex];
                    leftIndex++;
                }
                else {
                    mergedArray[mergedIndex] = rightHalf[rightIndex];
                    rightIndex++;
                }
                mergedIndex++;
            }
    
            while (leftIndex < leftHalf.length){
                mergedArray[mergedIndex] = leftHalf[leftIndex];
                leftIndex++;
                mergedIndex++;
            }
    
            while (rightIndex < rightHalf.length){
                mergedArray[mergedIndex] = rightHalf[rightIndex];
                rightIndex++;
                mergedIndex++;
            }
    
            return mergedArray;
        }
}
