import java.util.HashMap;
import java.util.Map;

public class FindDuplicatedChar {

    public static void main(String[] args) {
        String str1 = "this is the first string";
        String expectedStr1 = "t  is 4 times.\ni  is 4 times.\ns  is 4 times.\n" +"r  is 2 times.\n";

        String returnedString = printDuplicatedChars(str1);
        System.out.println(returnedString);

        if (!returnedString.equals(expectedStr1)) {
            System.out.println("Test failed for input: " + str1);
        };
    }

    public static String printDuplicatedChars(String string){
        // Create an array to count occurrences of each character
        Map resultMap = new HashMap<Character, Integer>();
        
        for (int i=0; i<string.length(); i++){
            if (resultMap.containsKey(string.charAt(i)) ){
                continue;
            }

            int count = 0;
            for (int j=i; j<string.length(); j++){
                if (string.charAt(i) == string.charAt(j)){
                    count++;
                }
            }
            if (count > 1){
                resultMap.put(string.charAt(i), count);
            }
        }

        String result = "";
        for (Character key : resultMap.keySet()) {
            result += key + "  is " + resultMap.get(key) + " times.\n";
        }

        return result;
    }

}
