package projectEuler.net;

import java.math.BigInteger;
import java.util.ArrayList;

public class problem3 {

	public static void main(String[] args) {
		
		BigInteger num = new BigInteger("13195");
		BigInteger number = new BigInteger("600851475143");
		
		findMaxPrime(calcPrimes(num));
		
		findMaxPrime(calcPrimes(number));
		
	}
	
	private static ArrayList<Long> calcPrimes(BigInteger number){
		ArrayList<Long> primes = new ArrayList<Long>();
		long n = number.longValue();
		
		for (long i = 2; i <= n / i; i++){
			while (n % i == 0){
				primes.add(i);
				n /= i;
			}
		}
		
		if (n > 1){
			primes.add(n);
		}
		
		return primes;
	}
	
	private static long findMaxPrime(ArrayList<Long> primes){
		long max = primes.get(0);
		
		for (int i = 0; i < primes.size(); i++){
			if (primes.get(i) > max){
				max = primes.get(i);
			}
		}
		
		return max;
	}
	
}
