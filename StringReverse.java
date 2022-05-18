package JavaInterviewQuestions;

public class StringReverse {

	public static void main(String[] args) {
		
		String S = "Ritesh is my nameaooooooooooo";
		int len = S.length();
		String rev = "";
		
		for(int i = len-1; i>=0; i--) {
			rev = rev + S.charAt(i);
		}
		
		System.out.println(rev);
		
		// another method to reverse a string
		StringBuffer SB = new StringBuffer(S);
		System.out.println(SB.reverse());

	}

}
