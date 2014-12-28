
public class FindPrime {
	public static void main(String[] args) {
		new FindPrime().run();
	}
	
	private void run() {
		System.out.println("Answer is " + answer());
	}
	
	private int answer() {
		int[] a = new int[1001];
		int[] b = new int[101];
		int Prime=0;
		
		for (int i=1; i<1001; i++) {
			a[i] = i;
		}

		int listPos=1;
		int bPos=1;
		while (Prime<100){
			if (isPrime(a[listPos])) {
				Prime++;
				b[bPos]=a[listPos];
				bPos++;
			}
			listPos++;
		}
		
		return b[100];
	}
	
	private boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i=2; i<=Math.sqrt(n); i++) {
			if (n%i == 0) return false;
		}
		return true;
	}
}
