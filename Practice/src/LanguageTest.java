import org.testng.annotations.Test;

public class LanguageTest {
	@Test
	public void test1() {
		int N = 123456789;
		
		int M = 0;
		while (N > 0) {
			M = (M * 10) + (N % 10);
			N /= 10;
			System.out.println(M);
		}
		
		System.out.println(M);
	}
	
	@Test
	public void test2() {
		int N = 123456789;
		int M = Integer.parseInt(new StringBuilder(""+N).reverse().toString());
		System.out.println(M);
	}
}
