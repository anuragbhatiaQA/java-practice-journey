/* Problem: Find Frequency of Each Character */
package practiceOnly;

import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		str=str.toLowerCase();
		
		/* Reading the complete string */
		
		for(int i=0; i<str.length();i++) {
			//Skip spaces
			
		char a=str.charAt(i); 
			if(a == ' ') {
				continue;
			}
			//Check if already counted
			boolean alreadyChecked = false;
			for(int j=0;j<i;j++) {
				//If yes → skip
				if(str.charAt(j)==a) {
					alreadyChecked=true;
					break;
				}
				}if (alreadyChecked) {
					continue;
				}
				//Checking if Character is already checked
				int count=0;
				for(int k=0;k<str.length();k++) {
					if(str.charAt(k)==a) {
					count++;
					}
				
			}System.out.println(str.charAt(i) + " -> " + count);
		}
			}
	}


