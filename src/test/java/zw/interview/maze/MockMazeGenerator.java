package zw.interview.maze;

/**
 * to generate data for test cases
 * 
 * @author Zhifei
 *
 */
public class MockMazeGenerator {
	
	public static Maze getTestMaze(){
		final int maze1[][] = new int[][] { 
		    { 0, 0, 1, 0, 0},
			{ 0, 0, 1, 0, 0}, 
			{ 0, 1, 1, 0, 0},
			{ 0, 1, 0, 0, 0}, 
			{ 0, 1, 0, 0, 0},
			{ 0, 1, 0, 0, 0}, 
			{ 0, 1, 0, 0, 0} };
		final Block<Integer, Integer> entrance = new Block<Integer, Integer>(0,2);
		final Block<Integer, Integer> exit = new Block<Integer, Integer>(6, 1);
		
		return new Maze(maze1, entrance, exit);
	}
	
	public static Maze getMazeWithNoSolution(){
		final int maze[][] = new int[][] { 
		    { 0, 0, 1, 0, 0},
			{ 0, 0, 1, 0, 0}, 
			{ 0, 1, 1, 0, 0},
			{ 0, 0, 0, 0, 0}, 
			{ 0, 1, 0, 0, 0},
			{ 0, 1, 0, 0, 0}, 
			{ 0, 1, 0, 0, 0} };
		final Block<Integer, Integer> entrance = new Block<Integer, Integer>(0,2);
		final Block<Integer, Integer> exit = new Block<Integer, Integer>(6, 1);
		
		return new Maze(maze, entrance, exit);
	}
	
	public static Maze getSampleMaze(){
		final int maze[][] = new int[][] { 
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
		final Block<Integer, Integer> entrance = new Block<Integer, Integer>(0,2);
		final Block<Integer, Integer> exit = new Block<Integer, Integer>(15, 12);
		
		return new Maze(maze, entrance, exit);
	}

}
