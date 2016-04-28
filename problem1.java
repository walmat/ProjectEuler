package projectEuler.net;

public class problem1 {

	
	
	public static void main(String[] args) {
		/*
		 * testing purposes answer == 23
		 */
		System.out.println(printMultsOf3And5(10));
		
		
		System.out.println(printMultsOf3And5(1000));
	}
	
	
	private static int printMultsOf3And5(int below){
		int sum = 0;
		for (int i = 0; i < below; i++){
			if (i % 3 == 0 || i % 5 == 0){
				sum+= i;
			}
		}
		
		return sum;
	}
	
}
