package arrayQuestions;

public class MinMax {
	
	public static void main(String [] args) {
		
		int [] a = {30, 89, 987,8,34};
		int min,max=a[0];
		min=a[0];
		
		for(int elem:a) {
			if(elem>max) {
				max=elem;
			}
			if(elem<min) {
				min=elem;
			}
		
		}
//		for(int elem:a) {
//			if(elem<min) {
//				min=elem;
//			}
//		
//		}
		System.out.println("Max is "+max+ " min is "+ min);
	}

}
