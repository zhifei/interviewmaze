package zw.interview.maze;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for Block class
 * 
 * @author Zhifei
 *
 */
public class BlockTest extends TestCase {

	@Test
	public void testEqualsTo() {
		Block<Integer, Integer> first = new Block<Integer, Integer>(1, 1);
		Block<Integer, Integer> second = new Block<Integer, Integer>(1, 1);
		assertTrue("Test two blocks with same values", first.equalsTo(second));

		second = new Block<Integer, Integer>(1, 2);
		assertFalse("Test two blocks with different values", first.equalsTo(second));

	}

	@Test
	public void testToPrint() {
		Block<Integer, Integer> first = new Block<Integer, Integer>(1, 1);
		assertEquals("Test block print-friendly message", first.toPrint(), "{1,1}");
	}

}
