/*Multiple programs*/
package practiceOnly;
import java.util.*;
public class practice{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to know the highest frequency occurance of a character in a string");
		String str = sc.nextLine();
		str = str.toLowerCase();
//		
//		HashMap<Character, Integer> highestFrequency = new HashMap<>();
//		int maxFrequency = 0;
//		for(int i=0;i<str.length();i++) {
//			char a = str.charAt(i);
//			if(a== ' ') {
//				continue;
//			}
//			if(highestFrequency.containsKey(a)) {
//				highestFrequency.put(a, highestFrequency.get(a) + 1);
//			}else {
//				highestFrequency.put(a,1);
//			}
//		}
//		
//		for(int currentValue : highestFrequency.values()) {
//			if(currentValue > maxFrequency) {
//				maxFrequency = currentValue;
//				}
//		}
//		//System.out.println(maxFrequency);
//		for(char key :highestFrequency.keySet()) {
//			//System.out.println(key +"-" + highestFrequency.get(key));		
//			if(highestFrequency.get(key) == maxFrequency) {
//				System.out.println(key + "-" + maxFrequency);
//				break;
//				
//			}			
//			}
		
		
		
		
		
		/*first Repeating Character in a string*/
//		HashMap<Character, Integer> firstRepeatingCharacter = new HashMap<>();
//		
//		for (int i=0;i<str.length();i++) {
//			char a = str.charAt(i);
//			
//			if(a == ' ') {
//				continue;
//			}
//			if(firstRepeatingCharacter.containsKey(a)) {
//				firstRepeatingCharacter.put(a, firstRepeatingCharacter.get(a)+1);
//				System.out.println("the first repeating character is");
//				System.out.println(a + " - " +firstRepeatingCharacter.get(a) );
//				break;
//			}else {
//				firstRepeatingCharacter.put(a, 1);
//			}
//		}sc.close();
		
		
//		for(char key:firstRepeatingCharacter.keySet()) {
//			if(firstRepeatingCharacter.get(key)>1) {
//				break;
//			}System.out.println(key + " - " + firstRepeatingCharacter.get(key));
//		}
	}
}
		
//		
//		
//		/*Find Duplicates*/
//		HashMap<Character, Integer> duplicates = new HashMap<>();
		//for (int i=0;i<str.length();i++) {
//			char a = str.charAt(i);
//			if(a == ' ') {
//				continue;
//			}
//			if(duplicates.containsKey(a)) {
//				duplicates.put(a, duplicates.get(a)+1);
//			} else {
//				duplicates.put(a, 1);
//			}
//		}
//		System.out.println("the duplicate characters in the string are ");
//		
//		for (char key:duplicates.keySet()) {
//			if(duplicates.get(key) > 1) {
//				System.out.println(key + "-" + duplicates.get(key));
//				}
//				
//			}sc.close();
//		}
		/*Count frequency of characters
		  HashMap<Character, Integer> frequency = new HashMap<>();
		for (int i=0; i<str.length();i++) {
			char a = str.charAt(i);
			
			if(a==' ') {
				continue;
			}
			if(frequency.containsKey(a)) {
				frequency.put(a, frequency.get(a)+1);
			}else {
				frequency.put(a, 1);
			}
		}
		System.out.println("The frequency of each element is");
		
		for(char key:frequency.keySet()) {
			System.out.println(key +"-" + frequency.get(key));
		}
		
		
	}*/
