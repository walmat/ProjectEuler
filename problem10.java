package projectEuler.net;

public class problem10 {

	public static void main(String[] args) {
		System.out.println(sumPrimes(10));
		System.out.println(sumPrimes(2000000));
	}
	
	private static long sumPrimes(int below){
		long sum = 0;
		long prime = 2;
		
		while (prime < below) {
			if (isPrime(prime)){
				sum+=prime;
			}
			prime++;
		}
		return sum;
	}
	
	public static boolean isPrime(long prime){
		if (prime <= 1){
			return false;
		}
		for (int i = 2; i <= Math.sqrt(prime); i++){
			if (prime % i == 0){
				return false;
			}
		}
		return true;
	}
}
