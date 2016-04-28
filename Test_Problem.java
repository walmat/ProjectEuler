package projectEuler.net;

import java.util.ArrayList;

public class Test_Problem {

	public static void main(String[] args) {
				
		System.out.println(smallestFactors(factors(10)));
		
		System.out.println(smallestFactors(factors(10401)));
		
		System.out.println(findPalindromes(3));
	}
	
	private static ArrayList<Integer> findPalindromes(int digits){
		ArrayList<Integer> pals = new ArrayList<Integer>();
		int number = 10; //has to start at a 2-digit number at least
		boolean OOB = false;
		
		while (!OOB){
			OOB = false;
			boolean isPal = true;
			int index_first = 0;
			int index_second = 0;
			String ints[] = String.valueOf(number).split(""); 
			index_second = ints.length - 1;
			for (int i = 0; i < ints.length/2; i++){			
				if (!(ints[index_first].equals(ints[index_second]))){
					isPal = false;
					break;
				}
				index_first++;
				index_second--;
			}			
			if (isPal){
				ArrayList<Integer> smallFacs = smallestFactors(factors(number));
				if (smallFacs == null){
					number++;
					continue;
				}
				for (int i = 0; i < smallFacs.size(); i++){
					String dig = smallFacs.get(i).toString();
					if (dig.length() > digits){
						OOB = true;
						break;
					}
				}
				pals.add(number);
			}
			number++;
		}
		
		return pals;
	}
	
	private static ArrayList<Factor> factors(int n){		
		ArrayList<Factor> f = new ArrayList<Factor>();
		//f.add(new Factor(n, 1));
		
		for (int i = n-1; i >= Math.sqrt(n); i--){
			if (n % i == 0){
				f.add(new Factor(i, n/i));
			}
		}
		
		return f;
	}
	
	private static ArrayList<Integer> smallestFactors(ArrayList<Factor> factors){
		ArrayList<Integer> smalls = new ArrayList<Integer>();
		
		if (factors.isEmpty()){
			return null;
		}
		
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for (int i = 0; i < factors.size(); i++){
			if (factors.get(i).factor1 < min || factors.get(i).factor2 < min){
				min = factors.get(i).factor1;
				min2 = factors.get(i).factor2;
			}
			else if (factors.get(i).factor1 < min2 || factors.get(i).factor2 < min2){
				min = factors.get(i).factor1;
				min2 = factors.get(i).factor2;
			}
			
		}
		
		smalls.add(min);
		smalls.add(min2);
		
		return smalls;
	}
}
