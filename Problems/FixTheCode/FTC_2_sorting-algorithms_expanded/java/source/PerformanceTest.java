import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class PerformanceTest {
    public void PerformanceTest(){}

    public void EvaluatePerformance(Sorter sorter, int[] array, int[] expectedSortedArray){
        Instant startTime = Instant.now();
        int[] sortedArray =sorter.Sort(array);
        Instant endTime = Instant.now();
        long duration = Duration.between(startTime, endTime).toMillis();

        if (!Arrays.equals(sortedArray, expectedSortedArray)){
            System.out.println("[ERROR] Sorting failed. Expected: " + java.util.Arrays.toString(expectedSortedArray) + " but got: " + Arrays.toString(sortedArray));
        }
        System.out.println("Sorting took " + duration + " milliseconds.");
    }



}
