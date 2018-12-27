package problem.winston;

public class Stone {

  public static void main(String[] args) {
    new Stone().run();
  }

  private void run() {
    int[] a = new int[4];
    int type211 = 0;
    
    for (a[0] = 0; a[0] < 3; a[0]++) {
      for (a[1] = 0; a[1] < 3; a[1]++) {
        for (a[2] = 0; a[2] < 3; a[2]++) {
          for (a[3] = 0; a[3] < 3; a[3]++) {
            int[] b = new int[3];
            for (int i=0; i<4; i++) b[a[i]]++;
            if (b[0] > 0 && b[1] > 0 && b[2] > 0) type211++;
          }
        }
      }
    }
    
    System.out.println("total = " + type211);
  }
}
