package zw.interview.maze;

public class Block<X, Y> {

	public final Integer x;
	public final Integer y;

	public Block(Integer x, Integer y)
	{
		this.x = x;
		this.y = y;
	}
	
	public boolean equalsTo(Block<X,Y> compare)
	{
		return this.x == compare.x && this.y == compare.y;
	}
	
	public String toPrint()
	{
		return "{" + x + "," + y + "}";
	}
}
