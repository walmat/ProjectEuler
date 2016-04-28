package projectEuler.net;

public class problem5 {

	public static void main(String[] args) {
		
		System.out.println(findSmallestDivisor(1, 10));
		System.out.println(findSmallestDivisor(1, 20));
	}
	
	private static boolean isEvenDivis(long number, long divisor){
		return number % divisor == 0;
	}
	
	private static long findSmallestDivisor(int lower, int higher){
		int nums[] = new int[higher-lower+1];
		
		for (int i = lower; i <= higher; i++){
			nums[i-1] = i;
		}
		boolean allDivided = false;
		int num = higher;
		while (!allDivided){
			for (int i = 1; i < nums.length; i++){
				if (!(isEvenDivis(num, i))){
					allDivided = false;
					break;
				}
				allDivided = true;
			}
			if (!allDivided){
				num++;
			}
		}
		return num;
	}
}
