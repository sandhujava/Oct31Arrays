package arrayQuestions;

public class AddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10,20,30,50,60};
		int sum=0;
		
		for(int elem:arr) {
			sum+=sum+elem;
		}
		System.out.println("Sum is " + sum);

	}

}
