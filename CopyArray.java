package arrayQuestions;

public class CopyArray {
	public static void main(String[] args) {
		
		int [] a = {34,43,56,1,2,3};
		
		int [] b = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		System.out.println("Copied");
		System.out.println("Printing array b");
		for(int elem:b) {
			System.out.print(elem+" ");
		}
	}

}
