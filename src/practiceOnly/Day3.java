package practiceOnly;

public class Day3 {

	public static void main(String[] args) {
		String str = "Hello World 123! 569";
		
		//Count Space in the String
		int spaceCount=0;
		for (int k=0;k<str.length();k++) {
			char ch2 = str.charAt(k);
			if (ch2== ' ') {
				spaceCount++;
			}
		}System.out.println(spaceCount);
		
		
		//Remove Spaces from the String
		String newStr ="";
		for (int i=0;i<str.length();i++) {
			char ch = str.charAt(i); 
				if (ch !=' ') {
					newStr = newStr + str.charAt(i); 				
			}			
		}System.out.println(newStr);
		
	//Counting Digits in a String
		int count = 0;
		for(int j=0;j<str.length();j++) {
			char ch1 = str.charAt(j);
			if(ch1>='0' && ch1<='9') {
				count++;
			}
		}System.out.println(count);
	

	}

}
