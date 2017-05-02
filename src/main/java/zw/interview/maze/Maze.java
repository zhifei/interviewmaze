package zw.interview.maze;

public class Maze {

	private int[][] maze;
	private int height;
	private int width;

	private Block<Integer, Integer> entrance;
	private Block<Integer, Integer> exit;
	
	public Maze(){
		this(new int[][] { 
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
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 } }
		, new Block<Integer, Integer>(0,2), new Block<Integer, Integer>(15, 12));
	}

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

	public boolean isInBoundary(int x, int y)
	{
		return x > 0 && y > 0 && x < this.width && y < this.height;
	}
	
	public boolean isOpen(int x, int y)
	{
		return isInBoundary(x,y) && this.maze[x][y] == 1;
	}
	
	public Block<Integer, Integer> markVisited(int x, int y)
	{
		if(isInBoundary(x,y)){
			this.maze[x][y] = 0;
			return new Block<Integer, Integer>(x,y);
		}
		return null;			
	}
	
	public void printMaze()
	{
		for(int i = 0; i< maze.length; i++)
		{
			for(int j = 0; j< maze[i].length; j++)
			{
				System.out.print(maze[i][j]+ " ");
			}
			System.out.print("\n");
		}
	}
}
