package zw.interview.maze;

/**
 * Maze.java by Zhifei Wang
 * 
 * A maze is presented in a two-dimension array.
 */

public class Maze {

	private int[][] maze;
	private int height;
	private int width;

	private Block<Integer, Integer> entrance;
	private Block<Integer, Integer> exit;

	public Maze(int[][] maze, Block<Integer, Integer> entrance, Block<Integer, Integer> exit) {
		this.maze = maze;
		this.height = maze.length;
		this.width = maze[0].length;
		this.entrance = entrance;
		this.exit = exit;
	}

	public Block<Integer, Integer> getEntrance() {
		return entrance;
	}

	public Block<Integer, Integer> getExit() {
		return exit;
	}

	/**
	 * check if block is within the boundary of the maze
	 * 
	 * @param x
	 *            - the horizontal position of the block
	 * @param y
	 *            - the vertical position of the block
	 * @return
	 */
	public boolean isInBoundary(int x, int y) {
		return x > 0 && y > 0 && x < this.height && y < this.width;
	}

	/**
	 * check if block is within the boundary of the maze, nor a wall, nor
	 * visited
	 * 
	 * @param x
	 *            - the horizontal position of the block
	 * @param y
	 *            - the vertical position of the block
	 * @return
	 */
	public boolean isOpen(int x, int y) {
		return isInBoundary(x, y) && this.maze[x][y] == 1;
	}

	/**
	 * mark the corresponding block in the maze so that it wouldn't be visited
	 * again
	 * 
	 * @param x
	 *            - the horizontal position of the block
	 * @param y
	 *            - the vertical position of the block
	 * @return
	 */
	public Block<Integer, Integer> markVisited(int x, int y) {
		if (isInBoundary(x, y)) {
			this.maze[x][y] = 0;
			return new Block<Integer, Integer>(x, y);
		}
		return null;
	}
}
