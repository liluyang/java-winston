package problem.example;

public class CircularMatrix {
  public final static void main(String[] args) {
    new CircularMatrix().run();
  }
  
  private void run() {
    generateMatrix(5, 4);
  }
  
  private void generateMatrix(int M, int N) {
    int[][] matrix = new int[M][];
    for (int i = 0; i < M; i++) {
      matrix[i] = new int[N];
    }
    
    int next = 1;
    for (int i = 0; i <= Math.min(M, N) / 2; i++) {
      next = fillMatrix(next, matrix, i, i, M - i * 2, N - i * 2);
    }
    
    int digit = (int)Math.log10(M * N) + 2;
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        System.out.format("%1$-" + digit + "d", matrix[i][j]);
      }
      System.out.println();
    }
  }
  
  private int fillMatrix(int next, int[][] matrix, int row, int col, int height, int width) {
    for (int i = 0; i < width - 1; i++) {
      matrix[row][col + i] = next++;
    }
    for (int i = 0; i < height - 1; i++) {
      matrix[row + i][col + width - 1] = next++;
    }
    for (int i = width - 1; i > 0; i--) {
      matrix[row + height - 1][col + i] = next++;
    }
    for (int i = height - 1; i > 0; i--) {
      matrix[row + i][col] = next++;
    }
    if (width == 1 && height == 1) matrix[row][col] = next++;
    return next;
  }
}
