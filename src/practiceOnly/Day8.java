/*Day 8 Code – Remove Duplicate Characters*/
package practiceOnly;

import java.util.Scanner;

public class Day8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        str = str.toLowerCase();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char a = str.charAt(i);

            // Skip spaces (optional) // programming is fun
            if (a == ' ') {
                continue;
            }

            // Check if already seen before
            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == a) { //p
                    alreadyChecked = true;
                    break;
                }
            }

            // If already seen, skip adding the duplicate character in the result
            if (alreadyChecked) {
                continue;
            }

            // Add to result
            
         // Add to result with proper spacing
            if(result.isEmpty()) {
                result = result + a;        // first character → no space
            } else {
                result = result + " " + a;  // next characters → add space before
            }
        }

        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}