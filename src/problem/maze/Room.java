package problem.maze;

import java.util.ArrayList;
import java.util.List;

public class Room {
  private ArrayList<Room> neighbors;
  private String name;
  
  public Room(String name) {
    this.name = name;
  }
  
  public void addNeighbors(List<Room> neighbors) {
    this.neighbors.addAll(neighbors);
  }
  
  public List<Room> getNeighbors() {
    return neighbors;
  }
  
  public String getName() {
    return name;
  }
}
