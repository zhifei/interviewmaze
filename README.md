# interviewmaze

by Zhifei Wang

This project is to print out the path for a given maze, from Entrance to Exit.

The solution consists of 4 classes
Main.java - it invokes MazeRunner with pre-defined maze from the interview question, for demo purpose.
Maze.java - it hosts the data structure of maze in a 2-dimension array. it also provides functions to access the maze.
MazeRunner.java - it uses "follow the wall" technique to traverse the maze and generates the path.
Block.java - it is a Tuple utility class to represent x and y coordinates for a given block in the maze.
