/* Problem: Check if two strings are Anagrams */

package practiceOnly;

import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String 1");
        String str1 = sc.nextLine();

        System.out.println("Enter the String 2");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Optional: remove spaces (if you want to ignore spaces)
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        // Step 1: Length check
        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
            sc.close();
            return;
        }

        boolean isAnagram = true;

        for (int i = 0; i < str1.length(); i++) {

            char a = str1.charAt(i);

            // Step 2: Check if already processed
            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {
                if (str1.charAt(j) == a) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            // Step 3: Count in str1
            int count1 = 0;
            for (int k = 0; k < str1.length(); k++) {
                if (str1.charAt(k) == a) {
                    count1++;
                }
            }

            // Step 4: Count in str2
            int count2 = 0;
            for (int k = 0; k < str2.length(); k++) {
                if (str2.charAt(k) == a) {
                    count2++;
                }
            }

            // Step 5: Compare
            if (count1 != count2) {
                isAnagram = false;
                break;
            }
        }

        // Final result
        if (isAnagram) {
            System.out.println("Strings are ANAGRAM");
        } else {
            System.out.println("Not an Anagram");
        }

        sc.close();
    }
}