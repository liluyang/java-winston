package problem.maze;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Maze {
	public List<String> dfs(Room start, Room end) {
		List<Room> path = new ArrayList<Room>();
		HashSet<Room> visited = new HashSet<Room>();
		
		
		return null;
	}
	
	private ArrayList<Room> findPath(Room start, Room end, HashSet<Room> visited) {
	  visited.add(start);
	  ArrayList<Room> path = new ArrayList<Room>();
	  for(Room room : start.getNeighbors()) {
	    
	  }
    return path;
  }
	
	public List<String> bfs(Room start, Room end) {
		Queue<Room> queue = new LinkedList<Room>();
		while(!queue.contains(end)) {
			queue.addAll(start.getNeighbors());
		}
		return null;
	}
}
