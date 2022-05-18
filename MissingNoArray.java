package JavaInterviewQuestions;

public class MissingNoArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10,13,14,15,16,17,18,19,20};
		int sum = 0;
		
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
       
		System.out.println(sum);
		
		int sum2 = 0;
		for(int j=1;j<=20;j++) {
			sum2 = sum2 + j;
		}
		System.out.println(sum2);
		System.out.println("The missing no is :: " +(sum2 - sum));
	}

}
