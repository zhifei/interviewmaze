package zw.interview;

import zw.interview.maze.Block;
import zw.interview.maze.Maze;
import zw.interview.maze.MazeRunner;
/**
 * main class for Maze Solution.
 * by Zhifei Wang
 */
public class Main {

	public static void main(String[] args) {
		
		final int sampleMaze[][] = new int[][] { 
		    { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0 }, 
			{ 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
			{ 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0 }, 
			{ 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0 }, 
			{ 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0 },
			{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, 
			{ 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0 },
			{ 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0 }, 
			{ 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0 },
			{ 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0 }, 
			{ 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0 },
			{ 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0 }, 
			{ 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 } };
		final Block<Integer, Integer> sampleMazeEntrance = new Block<Integer, Integer>(0,2);
		final Block<Integer, Integer> sampleMazeExit = new Block<Integer, Integer>(15, 12);
		
		Maze maze = new Maze(sampleMaze, sampleMazeEntrance, sampleMazeExit);
		MazeRunner mr = new MazeRunner(maze);
		System.out.println(mr.findPath());
	}

}
