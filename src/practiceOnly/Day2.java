package practiceOnly;
//Verified from Eclipse

//Day2.java   (vowels + string practice)
public class Day2 {

	public static void main(String[] args) {
		
		String str = "Hello World 123!";
		str=str.toLowerCase();
		int vowelCount= 0;
		int consonantsCount=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i); 
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){				
				vowelCount++;
			}else if(ch>='a' && ch <='z') {
				consonantsCount++;	
			
			
			}
		}System.out.println("Number of vowels " +vowelCount);
		System.out.println("Number of consonants " +consonantsCount);
	}

}
