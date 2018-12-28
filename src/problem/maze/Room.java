package problem.maze;

import java.util.ArrayList;
import java.util.List;

public class Room {
  private ArrayList<Room> neighbors;
  private String name;
  private boolean value;
  
  public Room(char name, boolean value) {
    this.name = "" + name;
    this.value = value;
    this.neighbors = new ArrayList<Room>();
  }
  
  public void addNeighbors(List<Room> neighbors) {
    this.neighbors.addAll(neighbors);
  }
  
  public void addNeighbor(Room neighbor) {
    this.neighbors.add(neighbor);
  }
  
  public List<Room> getNeighbors() {
    return neighbors;
  }
  
  public String getName() {
    return name;
  }
  
  public boolean getValue() {
    return value;
  }
}
