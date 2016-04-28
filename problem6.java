package projectEuler.net;

public class problem6 {

	public static void main(String[] args) {
		
		int numToCalc = 100;
		
		int x = calcSumSquares(numToCalc);
		int y =calcSquaresSum(numToCalc);
		
		System.out.println(y - x);
		
	}
	
	private static int calcSumSquares(int to){
		int sum = 0;	
		for (int i = 1; i <= to; i++) {
			sum+=i*i;
		}
		return sum;
	}
	
	private static int calcSquaresSum(int to){
		int sum = 0;
		for (int i = 1; i <= to; i++){
			sum+=i;
		}
		return sum*sum;
	}
}
