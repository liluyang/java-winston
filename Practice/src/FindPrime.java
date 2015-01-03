
public class FindPrime {
	public static void main(String[] args) {
		new FindPrime().run();
	}
	
	private void run() {
		System.out.println("Answer is " + answer());
	}
	
	private int answer() {
		int count = 0;
		int res = 0;
		
		for (int listPos=2; count<100; listPos++) {
			if (isPrime(listPos)) {
				count++;
				if (count == 100) res = listPos;
			}
		}
		
		return res;
	}
	
	private boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i=2; i<=Math.sqrt(n); i++) {
			if (n%i == 0) return false;
		}
		return true;
	}
}
