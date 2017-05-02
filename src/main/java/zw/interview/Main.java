package zw.interview;

import zw.interview.maze.Maze;
import zw.interview.maze.MazeRunner;

public class Main {

	public static void main(String[] args) {
		Maze maze = new Maze();
		MazeRunner mr = new MazeRunner(maze);
		maze.printMaze();
		System.out.println(mr.findPath());
		maze.printMaze();

	}

}
