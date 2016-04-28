package projectEuler.net;

public class problem7 {

	public static void main(String[] args) {
		
		System.out.println(findNumPrime(6));
		System.out.println(findNumPrime(10001));
	}
	
	private static int findNumPrime(int index){
		int numPrimes = 0;
		int num = 1;
		while (numPrimes < index){
			num++;
			if (isPrime(num)){
				numPrimes++;
			}
		}
		return num;
	}
		
	public static boolean isPrime(int n){
		if (n <= 1){
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++){
			if (n % i == 0){
				return false;
			}
		}
		return true;
	}
		
}
