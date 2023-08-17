package javaDSA.ArrayList;
import java.util.*;

public class MissingNumber {
    public static List<Integer> findMissingNumbers(int[] arr, int n) {
        List<Integer> missingNumbers = new ArrayList<>();
    
        // Create a boolean array to keep track of which numbers are present
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < arr.length; i++) {
            present[arr[i]] = true;
        }
    
        // Add each missing number to the list
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missingNumbers.add(i);
            }
        }
    
        return missingNumbers;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 9};
        int n = 10;
        List<Integer> missingNumbers = findMissingNumbers(arr, n);
        System.out.println("Missing Numbers: " + missingNumbers);
    }
    
    
}
