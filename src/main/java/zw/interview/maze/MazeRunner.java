package zw.interview.maze;

import java.util.Stack;

/**
 * Maze.java by Zhifei Wang
 * 
 * The MazeRunner is to solve the maze problem using "follow-the-wall"
 * technique.
 */
public class MazeRunner {

	Maze maze;
	Stack<Block<Integer, Integer>> path;

	public MazeRunner(Maze maze) {
		this.maze = maze;
		this.path = new Stack<Block<Integer, Integer>>();
	}

	/**
	 * The Path is a stack of traversed blocks. The code always attempts to find
	 * the next movable block by this order: down, up, left, right. When there
	 * is no more movable blocks, it back-tracks to previous traversed blocks
	 * until it finds one with movable blocks. If it back-tracks all the way to
	 * the Start position, it means there is no solution to the maze and an
	 * error message will be returned.
	 * 
	 * 
	 * @return list of blocks of the solution starting from Start position; or
	 *         an error message if the maze doesn't have a solution
	 */
	public String findPath() {

		Block<Integer, Integer> currentPos = maze.getEntrance();
		Block<Integer, Integer> nextPos;

		while ((!currentPos.equalsTo(maze.getExit()))) {
			nextPos = moveForward(currentPos);
			if (nextPos == null) {
				if (path.empty()) {
					return "Maze does not have a solution!";
				}
				currentPos = path.pop(); // back track
			} else {
				path.push(currentPos);
				currentPos = nextPos;
			}
		}

		return pathToString();
	}

	/**
	 * Find the next movable block near the current block Always attempt in this
	 * order: down, up, left, right
	 * 
	 * @param currentPos
	 * @return next movable block
	 */
	private Block<Integer, Integer> moveForward(Block<Integer, Integer> currentPos) {

		if (maze.isOpen(currentPos.x + 1, currentPos.y))
			return maze.markVisited(currentPos.x + 1, currentPos.y);

		if (maze.isOpen(currentPos.x - 1, currentPos.y))
			return maze.markVisited(currentPos.x - 1, currentPos.y);

		if (maze.isOpen(currentPos.x, currentPos.y + 1))
			return maze.markVisited(currentPos.x, currentPos.y + 1);

		if (maze.isOpen(currentPos.x, currentPos.y - 1))
			return maze.markVisited(currentPos.x, currentPos.y - 1);

		return null;
	}

	/**
	 * the Path now has all the steps. since it's a stack, the most recent move
	 * is on the top (the Exit). to create a user-friendly output, this function
	 * reverses the steps so that it's from Entrance to Exit
	 * 
	 * @return solution to the maze
	 */
	private String pathToString() {
		StringBuilder sb = new StringBuilder();
		while (!path.empty()) {
			sb.insert(0, path.pop().toPrint());
		}
		return sb.toString();
	}

}
