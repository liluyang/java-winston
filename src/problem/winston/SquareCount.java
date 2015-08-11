package problem.winston;

import org.testng.annotations.Test;

public class SquareCount {
  @Test
  public void test1() {
    int res = 0;
    for (int i=8, j=17; i>0; i--, j--) {
      res += i * j;
    }
    System.out.println("res = " + res);
  }
  
  @Test
  public void test2() {
    int res = 0;
    for (int i=8; i>0; i--) {
      res += i * (18 - i) + i * (i - 1) / 2;
    }
    System.out.println("res = " + res);
  }
}
