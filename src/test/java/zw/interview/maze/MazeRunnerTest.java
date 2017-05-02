package zw.interview.maze;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for MazeRunner class
 * 
 * @author Zhifei
 *
 */
public class MazeRunnerTest extends TestCase {

	@Test
	public void testFindPath() {
		MazeRunner mr = new MazeRunner(MockMazeGenerator.getTestMaze());
		assertEquals("Test a small maze", mr.findPath(), "{0,2}{1,2}{2,2}{2,1}{3,1}{4,1}{5,1}");

		MazeRunner mrFail = new MazeRunner(MockMazeGenerator.getMazeWithNoSolution());
		assertEquals("Test a maze with no solution", mrFail.findPath(), "Maze does not have a solution!");

		MazeRunner mrSample = new MazeRunner(MockMazeGenerator.getSampleMaze());
		assertEquals("Test the maze from interview question", mrSample.findPath(),
				"{0,2}{1,2}{2,2}{2,1}{3,1}{4,1}{5,1}{6,1}{6,2}{6,3}{7,3}{8,3}{8,2}{8,1}{9,1}{10,1}{10,2}{10,3}{11,3}{11,4}{11,5}{11,6}{10,6}{9,6}{8,6}{8,7}{8,8}{9,8}{10,8}{11,8}{12,8}{13,8}{14,8}{14,9}{14,10}{14,11}{13,11}{13,12}{14,12}");
	}

}
