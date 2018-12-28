package problem.maze;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Maze {
	public List<String> dfs(Room start, Room end) {
		if(start == null) return null;
		List<String> path = new ArrayList<String>();
		for(Room child : start.getNeighbors()) {
			path.add(child.getName());
			if(path.contains(end.getName()))
				return path;
			path.addAll(dfs(child, end));
			//Add something here to remove stuff from path if it doesn't work.
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
