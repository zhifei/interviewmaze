package zw.interview.maze;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for Maze class
 * 
 * @author Zhifei
 *
 */
public class MazeTest extends TestCase {

	@Test
	public void testGetEntrance() {
		Maze maze = MockMazeGenerator.getTestMaze();
		assertTrue("Test Maze entrance is correct", maze.getEntrance().equalsTo(new Block<Integer, Integer>(0, 2)));
	}

	@Test
	public void testGetExit() {
		Maze maze = MockMazeGenerator.getTestMaze();
		assertTrue("Test Maze exit is correct", maze.getExit().equalsTo(new Block<Integer, Integer>(6, 1)));
	}

	@Test
	public void testIsInBoundary() {
		Maze maze = MockMazeGenerator.getTestMaze();
		assertTrue("Test block is within the maze", maze.isInBoundary(1, 1));
		assertFalse("Test block is not within the maze", maze.isInBoundary(-1, 1));

	}

	@Test
	public void testIsOpen() {
		Maze maze = MockMazeGenerator.getTestMaze();
		assertTrue("Test block is open", maze.isOpen(1, 2));
		assertFalse("Test block is a wall", maze.isOpen(0, 0));

	}

	@Test
	public void testMarkVisited() {
		Maze maze = MockMazeGenerator.getTestMaze();
		assertTrue(maze.isOpen(1, 2));
		maze.markVisited(1, 2);
		assertFalse("Test block is marked visited", maze.isOpen(1, 2));
	}

}
