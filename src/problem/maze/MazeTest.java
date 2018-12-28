package problem.maze;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class MazeTest {
  @Test
  public void test1() {
    runMaze(Arrays.asList("A", "D", "G", "H", "I"), "100", "100", "111");
  }

  private void runMaze(List<String> expected, String... matrix) {
    Maze maze = new Maze();

    char name = 'A';
    int M = matrix.length;
    int N = matrix[0].length();
    Room[][] room = new Room[M][N];
    for (int i = 0; i < M; i++) {
      String row = matrix[i];
      room[i] = new Room[N];
      for (int j = 0; j < N; j++) {
        room[i][j] = new Room(name, row.charAt(j) == '1');
        name++;
      }
    }

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (!room[i][j].getValue())
          continue;
        if (i > 0 && room[i - 1][j].getValue()) {
          room[i][j].addNeighbor(room[i - 1][j]);
        }
        if (i < M - 1 && room[i + 1][j].getValue()) {
          room[i][j].addNeighbor(room[i + 1][j]);
        }
        if (j > 0 && room[i][j - 1].getValue()) {
          room[i][j].addNeighbor(room[i][j - 1]);
        }
        if (j < N - 1 && room[i][j + 1].getValue()) {
          room[i][j].addNeighbor(room[i][j + 1]);
        }
      }
    }

    List<String> answer = maze.dfs(room[0][0], room[M - 1][N - 1]);
    assertEquals(expected, answer);
  }

}
