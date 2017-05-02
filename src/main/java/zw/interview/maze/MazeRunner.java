package zw.interview.maze;

import java.util.Stack;

public class MazeRunner {
	
	Maze maze;
	Stack<Block<Integer, Integer>> path;
	
	public MazeRunner(Maze maze){
		this.maze = maze;
		this.path = new Stack<Block<Integer, Integer>>();
	}
	
	
	public String findPath(){
		
		Block<Integer, Integer> currentPos = maze.getEntrance();
		Block<Integer, Integer> nextPos;
		
		while((!currentPos.equalsTo(maze.getExit())) )
		{
			nextPos = moveForward(currentPos);
			if(nextPos == null){
				if (path.empty()) {
					return "Maze does not have a solution!";
				}
				currentPos = path.pop(); //back track
			}
			else{
				path.push(currentPos);
				currentPos = nextPos;
			}
		}
				
		return pathToString();
	}
	
	private Block<Integer, Integer> moveForward(Block<Integer, Integer> currentPos){
		
		 if(maze.isOpen(currentPos.x + 1, currentPos.y))
			 return maze.markVisited(currentPos.x + 1, currentPos.y);
		 
		 if(maze.isOpen(currentPos.x -1, currentPos.y))
			 return maze.markVisited(currentPos.x -1, currentPos.y);	
		 
		 if(maze.isOpen(currentPos.x, currentPos.y + 1))
			 return maze.markVisited(currentPos.x, currentPos.y + 1);	
		 
		 if(maze.isOpen(currentPos.x, currentPos.y - 1))
			 return maze.markVisited(currentPos.x, currentPos.y - 1);
		 
		return null;
	}
	
	private String pathToString()
	{
		StringBuilder sb = new StringBuilder();
		while (!path.empty()) {
			sb.insert(0, path.pop().toPrint());
		}
		return sb.toString();
	}

}
