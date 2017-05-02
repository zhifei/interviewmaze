package zw.interview.maze;

/**
 * Block.java by Zhifei Wang
 * 
 * This class represents a single block of a maze. It has X and Y coordinates.
 * It is a utility class for tuple operations.
 */

public class Block<X, Y> {

	public final Integer x; // row position
	public final Integer y; // column position

	public Block(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public boolean equalsTo(Block<X, Y> compare) {
		return this.x == compare.x && this.y == compare.y;
	}

	public String toPrint() {
		return "{" + x + "," + y + "}";
	}
}
