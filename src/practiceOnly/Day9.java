/*Find First Non-Repeating Character in a String*/

package practiceOnly;

import java.util.Scanner;

public class Day9 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the String");
	        String str = sc.nextLine();

	        str = str.toLowerCase();
	        for(int i=0; i<str.length();i++) {
				//Skip spaces, if encountered
				
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
					// Count frequency of current character
					int count=0;
					for(int k=0;k<str.length();k++) {
						if(str.charAt(k)==a) {
						count++;
						}
						}if (count==1) {
							System.out.println("first non-repeating character " +str.charAt(i));
					break;
				}
			}
				}
		}


