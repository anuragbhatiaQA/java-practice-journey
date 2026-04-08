/*Day5: Count vowels, consonants, digits, spaces, and special characters from user input*/
package practiceOnly;

import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine(); // Now this has our String
		System.out.println("Entered String is " +str); //Printing the String entered
		str = str.toLowerCase();
		
		
		int numberofVowels=0;
		int numberofConsonants=0;
		int numberofDigits=0;
		int numberofSpaces=0;
		int numberofSpecialCharacters=0;
		
		for(int i=0;i<str.length();i++) {
			char a = str.charAt(i);	
			if(a=='a' || a =='e' || a =='i' || a=='o' || a =='u') {
				numberofVowels++;
			}else if(a>='a' && a<='z') {
				numberofConsonants++;
		}else if (a>='0' && a<='9') {
			numberofDigits++;
		}else if (a==' ') {			
			numberofSpaces++;
		}else {
			numberofSpecialCharacters++;
				
			}		
			}System.out.println("The number of Vowels are " +numberofVowels);
			System.out.println("The number of Consonants are " +numberofConsonants);
			System.out.println("The number of Digits are " +numberofDigits);
			System.out.println("The number of Spaces are " +numberofSpaces);
			System.out.println("The number of Special Characters are " +numberofSpecialCharacters);

		sc.close();
	

}}
