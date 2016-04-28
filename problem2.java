package projectEuler.net;

import java.util.ArrayList;

public class problem2 {

	public static void main(String[] args) {
		
		System.out.println(evenValFib(fibSequence(4000000)));
	}
	
	private static long evenValFib(ArrayList<Integer> fib){
		
		int sum = 0;
		
		
		for (int i = 0; i < fib.size(); i++){
			if (fib.get(i) % 2 == 0){
				sum += fib.get(i);
			}
		}
		return sum;
	}
	
	private static ArrayList<Integer> fibSequence(int below){
		ArrayList<Integer> fib = new ArrayList<Integer>();

		int first = 1;
		int second = 2;
		int index = 0;
		
		while (first < below && second < below){
			fib.add(index, first);
			fib.add(index+1, second);
			first = first + second;
			second = second + first;
			index += 2;
		}	
		return fib;
	}
}
