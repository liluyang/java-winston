package problem.maze;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Maze {
	public static ArrayList<String> path = new ArrayList<String>();
	
	public List<String> dfs(Room start, Room end) {
		if(start == null) {
			path.remove(path.size() - 1);
			return null;
		}
		for(Room room : start.getNeighbors()) {
			if(!path.contains(end.getName())) {
				path.add(start.getName());
				dfs(room, end);
			}
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
