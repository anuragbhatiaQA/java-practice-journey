/* Day 11 (HashMap + duplicate characters) */

package practiceOnly;

import java.util.HashMap;
import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter the String");
        String str = sc.nextLine();

        // Create HashMap to store character → count
        // Key = Character, Value = Integer (count)
        HashMap<Character, Integer> occurances = new HashMap<>();

        // =========================
        // STEP 1: Build the map
        // =========================

        // Loop through each character in string
        for (int i = 0; i < str.length(); i++) {

            // Pick current character
            char a = str.charAt(i);

            // Skip spaces (optional)
            if (a == ' ') {
                continue;
            }

            // Check if character key exists in map
            if (occurances.containsKey(a)) {

                // Character already present
                // Get its current count and increase by 1
                occurances.put(a, occurances.get(a) + 1);

            } else {

                // Character seen first time
                // Add it with count = 1
                occurances.put(a, 1);
            }
        }

        // =========================
        // STEP 2: Print duplicates
        // =========================

        System.out.println("Duplicate characters are:");

        // Loop through all keys in map
        for (char key : occurances.keySet()) {

            // Check if count > 1 → duplicate
            if (occurances.get(key) > 1) {

                // Print duplicate character
                System.out.println(key + "-" + occurances.get(key));
            }
        }

        // Close scanner
        sc.close();
    }
}