/* Find duplicate Characters in a String */
package practiceOnly;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("The entered String is : " +str);
		str=str.toLowerCase();
		int duplicate=0;
		char a = ' ';
		

		for(int i=0;i< str.length();i++) {	
			boolean alreadyChecked=false;
			boolean isDuplicate=false;
			a = str.charAt(i);			
			if(a== ' ') { // If a is equal to space then skip and go to next character
				continue;
			}
			//Checking for Duplicate
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(j)==a) {
					isDuplicate=true;
					break;									
				}
			}
			//Checking if Character is already checked
				for(int k=0;k<i;k++) {
					if(str.charAt(k)==a) {
					alreadyChecked=true;
					break;
				}
					
			} if (alreadyChecked) {
				continue;
			}
			//Print the duplicate characters
			if (isDuplicate) {
				duplicate++;
				System.out.println(a);
			}			
		}
		//Print the number of duplicate Characters
		System.out.println("Number of duplicate characters in the string are: "+duplicate);
		sc.close();
	}

}
