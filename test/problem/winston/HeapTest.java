package problem.winston;

public class HeapTest {

  public static void main(String[] args) {
    new HeapTest().run();
  }

  private void run() {
    int[][] a = new int[1024][];
    int N = 4096000;
    for (int i = 0; i < 1024; i++) {
      a[i] = new int[N];
    }
    System.out.println("Allocate all successfully!");
  }
}
