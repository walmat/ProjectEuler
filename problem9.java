package projectEuler.net;

public class problem9 {

	public static void main(String[] args) {
		int sum = 1000;
		System.out.println(findTriplets(sum));
		
	}

	private static int findTriplets(int sum){
		int a;
        int product=0;
        for (a = 1; a <= sum/3; a++){
            for (int b = a + 1; b <= sum / 2; b++){
                int c = sum - a - b;
                if (c > 0 && (a * a + b * b == c * c)){
                   System.out.println("a="+a+ " b="+b+ " c="+c);
                    product = a * b * c;
                }
            }
        }
		return product;
	}
}
