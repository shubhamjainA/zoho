package akashykumar;

public class remove_char_and_number_instring {

	public static void main(String[] args) {
		
		String str="12java program253";
		
		String s1=str.replaceAll("[^A-Za-z]", "");
		String s2=str.replaceAll("[^0-9]", "");
		System.out.println(s1);
		System.out.println("**************");
		System.out.println(s2);
	
	}

}
