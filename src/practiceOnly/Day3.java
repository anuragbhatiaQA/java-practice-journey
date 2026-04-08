package practiceOnly;
//Verified from Eclipse

public class Day3 {

	public static void main(String[] args) {
		String str = "Hello World 123! 569@@$%^&*@";
		str = str.toLowerCase();
		
		//Count Space in the String
		int spaceCount=0;
		for (int k=0;k<str.length();k++) {
			char ch2 = str.charAt(k);
			if (ch2== ' ') {
				spaceCount++;
			}
		}System.out.println("Number of spaces in a String: " +spaceCount);		
		
		//Remove Spaces from the String
		String newStr ="";
		for (int i=0;i<str.length();i++) {
			char ch = str.charAt(i); 
				if (ch !=' ') {
					newStr = newStr + ch; 				
			}			
		}System.out.println("Spaces removed from String: " +newStr);
		
	//Counting Digits in a String
		int count = 0;
		for(int j=0;j<str.length();j++) {
			char ch1 = str.charAt(j);
			if(ch1>='0' && ch1<='9') {
				count++;
			}
		}System.out.println("Count of Digits in String: " +count);
	//Count special characters

		int specialCharacters=0;
		for(int l=0;l<str.length();l++) {
			char ch3=str.charAt(l);
			if(!((ch3>='0' && ch3<='9') || (ch3>='a' && ch3 <='z')|| (ch3==' '))) {
			specialCharacters++;
		}
	}System.out.println("Count of Special Characters: " +specialCharacters);
	
	// All in one loop
		int vowelAllCount= 0;
		int consonantsAllCount=0;
		int spacesAll=0;
		int digitsAll=0;
		int specialAll=0;
		
		for(int m=0;m<str.length();m++) {
			char ch4=str.charAt(m);
				if (ch4=='a'|| ch4=='e'||ch4=='i'||ch4=='o'||ch4=='u') {
					vowelAllCount++;
				}else if(ch4>='a' && ch4<='z') {
					consonantsAllCount++;
			}else if (ch4 ==' ') {
				spacesAll++;				
			} else if(ch4>='0' && ch4<='9') {
				digitsAll++;
			} else {//(!((ch4>='0' && ch4<='9') || (ch4>='a' && ch4 <='z')|| (ch4==' '))) {
				specialAll++;
			}
			
		}System.out.println("Number of vowels: " +vowelAllCount);
		System.out.println("Number of consonants: " +consonantsAllCount);
		System.out.println("Number of Spaces: " +spacesAll);
		System.out.println("Number of SpecialCharacters: " +specialAll);
		System.out.println("Number of Digits: " +digitsAll);
		}		
	
	}
	
