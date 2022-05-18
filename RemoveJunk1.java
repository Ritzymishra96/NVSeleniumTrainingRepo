package JavaInterviewQuestions;

public class RemoveJunk1 {

	public static void main(String[] args) {
		
		String s = "&^%&^%&^%&^% RITESH (&(&(*&(*&(*&( MISHRA (*&(&(*&(*&(*& IS MY (&(&(*& NAME";
		
		s = s.replaceAll("[^a-zA-Z0-1]", "");
		System.out.println(s);

		String R = "My name is Ritesh Kumar Mishra";
		R = R.replace("Kumar", " ");
		System.out.println(R);
		
		String A = "MY NAME IS ANTHONY MISHRA";
		A = A.replaceFirst("MY", "Hero");
		System.out.println(A);
	}

}
