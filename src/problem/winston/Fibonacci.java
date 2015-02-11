package problem.winston;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;

		for (int times = 0; times < 18; times++) {
			b = b + a;
			a = b - a;
		}
		
		System.out.println(b);
	}
	
	private int fibonacci(int n) {
		if (n < 2) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
