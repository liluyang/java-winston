package problem.winston;

import org.testng.annotations.Test;

public class MathTest {
  @Test
  public void test1() {
    for (int i = 100; i < 300; i++) {
      String s = "" + (i * i);
      int[] count = new int[5];
      boolean find = true;
      for (char c : s.toCharArray()) {
        if (++count[(c - '0')/2] > 1) {
          find = false;
          break;
        }
      }
      if (find) {
        System.out.println("perfect square = " + s);
      }
    }
    System.out.println("No solution");
  }
}
