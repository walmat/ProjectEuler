package projectEuler.net;

import java.util.ArrayList;
import java.util.Collections;

public class problem4 {

	static int minVal = 100;
	static int maxVal = 999;
	
	public static void main(String[] args) {
		
		ArrayList<Integer> p = new ArrayList<Integer>();
		for (int i = minVal; i <= maxVal; i++){
			for (int j = minVal; j <= maxVal; j++){
				if (!p.contains(calcPal(i*j))){
					p.add(calcPal(i*j));
				}
			}
		}
		
		for (int i = 0; i < p.size(); i++){
			int k = p.get(i).intValue();
			if (k == -1){
				p.remove(i);
			}
		}
		p.trimToSize();
		Collections.sort(p);
		
		for (int i = 0; i < p.size(); i++){
			System.out.println(p.get(i).toString());
		}
	}
	
	private static boolean isPalindrome(int number){
		boolean isPal = true;
		int index_first = 0;
		String ints[] = String.valueOf(number).split(""); 
		int index_second = ints.length - 1;
		for (int i = 0; i < ints.length/2; i++){			
			if (!(ints[index_first].equals(ints[index_second]))){
				isPal = false;
				break;
			}
			index_first++;
			index_second--;
		}
		
		return isPal;
	}
	
	private static int calcPal(int number){
		if (isPalindrome(number)){
			return number;
		}
		return -1;
	}
}