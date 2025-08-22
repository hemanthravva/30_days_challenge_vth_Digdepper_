import java.util.HashMap;
import java.util.*;

public class Solution {
    
    public static int romanToInt(String s) {
        

        
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        // Step 2: Loop through the string
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanMap.get(s.charAt(i));

            // Step 3: Check the next character if it exists
            if (i < s.length() - 1) {
                int nextValue = romanMap.get(s.charAt(i + 1));
                
                if (currentValue < nextValue) {
                    // Step 4: Subtract current if smaller than next
                    result -= currentValue;
                } else {
                    // Step 5: Otherwise add current value
                    result += currentValue;
                }
            } else {
                // Step 6: Add the value of the last character
                result += currentValue;
            }
        }

        return result;
    }

   
}
