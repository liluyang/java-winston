package problem.winston;

import java.util.Base64;
import java.util.Comparator;
import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class LanguageTest {
  @Test
  public void test1() {
    int N = 123456789;

    int M = 0;
    while (N > 0) {
      M = (M * 10) + (N % 10);
      N /= 10;
    }

    System.out.println(M);
  }

  @Test
  public void test2() {
    int N = 123456789;
    int M = Integer.parseInt(new StringBuilder("" + N).reverse().toString());
    System.out.println(M);
  }

  @Test
  public void test3() {
    String f = "hello.txt";
    System.out.println(f.matches(".*txt$"));
  }

  @Test
  public void test4() {
    String input = "-(void)Disable_test";
    String input2 = "hello, world; -(void)test";
    String pattern = "-\\(void\\)(Disabled_)?test";
    System.out.println(input.matches(pattern));
    System.out.println(input2.matches(pattern));
  }

  @Test
  public void test5() {
    String input = "Winston & Sophia _ 2016";
    String encoded = Base64.getEncoder().encodeToString(input.getBytes());
    System.out.println("encoded = " + encoded);

    String decoded = new String(Base64.getDecoder().decode(encoded));
    System.out.println("decoded = " + decoded);
  }

  @Test
  public void test6() {
    Comparator<Integer> comparator = new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        return b - a;
      }
    };
    PriorityQueue<Integer> queue2 = new PriorityQueue<Integer>(10, comparator);
    queue2.add(1);
    queue2.add(2);
    queue2.add(3);
    int a = queue2.remove();
    System.out.println("PriorityQueue first = " + a);
  }
}
