// Day 4: Learned user input (Scanner), string split, trim, and array handling
/* Count number of words in a string */
package practiceOnly;

import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		//======Input NOT form the user================
		String str = " WE ARE PROUD    Engineers";
		str = str.trim(); //remove extra words at start / end
		String[] newStr = str.split("\\s+"); //Remove extra words
		
		System.out.println(newStr.length);
		//========user input=======
		Scanner sc = new Scanner(System.in); // New utility
		System.out.println("Enter the String "); // Enter the Input message
		String str1 = sc.nextLine(); // Read the value entered
		System.out.println("The entered words are:- " +str1);
		str1 = str1.trim();
		String[] str2 = str1.split("\\s+");
		//Printing the string after split
		for(int i=0;i<str2.length; i++) {			
			System.out.println(str2[i]);
		}
		
		System.out.println("Number of words in the String is: "+str2.length);
		sc.close();
		
		
		


	}

}
