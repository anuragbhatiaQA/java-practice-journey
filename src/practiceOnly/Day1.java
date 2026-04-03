package practiceOnly;

//Day1.java   (strings + reverse + palindrome)
public class Day1 {

	public static void main(String[] args) {
		String str = "Madam ";
		System.out.println(str);
		String str1=str.strip().toLowerCase();
		System.out.println(str1);
	
		
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		//First and Last character in the string
		System.out.println("First character is - " +str.charAt(0));
		System.out.println ("Last character is - " +str.charAt(str.length()-1));
		
		//Reversing a String
		String rev = "";
		for (int i = str1.length()-1; i>=0;i--) {
		//	System.out.println(str.charAt(i));
			rev = rev + str1.charAt(i);
		}System.out.println(rev);
		
		// Palindrome check
		if(str1.equalsIgnoreCase(rev)) {
			
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
		
	}

}
