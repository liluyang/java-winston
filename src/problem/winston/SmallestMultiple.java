package problem.winston;

public class SmallestMultiple {
  public final static void main(String[] args) {
    new SmallestMultiple().run();
  }
  
  private void run() {
    long num = lcd(1, 2);
    for(long x = 3; x <= 20; x++) {
        num = lcd(num, x);
    }
    System.out.println(num);
  }
  
  //Returns least common denominator of m and n
  private long lcd(long m, long n) {
   return m * n / gcd(m, n);
  }

  //Returns largest common divisor of m and n
  private long gcd(long m, long n) {
    return m >= n ? calc(m, n) : calc(n, m);
  }
  
  private long calc(long m, long n) {
    return m % n == 0 ? n : calc(n, m%n);
  }
}
