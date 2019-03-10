/**
 * This is the GameConnect class.
 * This class has a field section that creates a 2 dimensional array for the board, and a StringBuilder utilized in the toString method and the clearBoard method
 * This class has one constructor, which sets the board size and sets all elements to 0, and instantiates the StringBuilder
 * This class has a nextEmpty method which returns the board location and makes sure it is in bounds
 * This class has a dropToken method which drops a token at a specified location for the player, and either random spot or block/win location for the PC
 * This class has a winCheck method which splits the board into 4 quadrants, scanning each for a win
 * This class has a robotPriority method which runs code from the RobotThink class
 * This class has a toString method which utilizes StringBuilder to print the board array
 * This class has a clearBoard method which resets the board array when a new game begins
 * 
 * @author Aimee Rusin, Jack Ajizian, Samantha Mitchell
 * @version 8/10/2018
 */

import java.io.*;
import java.util.*;
public class GameConnect 
{
    //fields:
    //2D board array
    private int board[][];
    //StringBuilder for printing board/clearing board
    private StringBuilder display;

    /**
     * GameConnect constructor
     * Sets the board size and sets all elements to 0, and creates new StringBuilder object
     */
    public GameConnect()
    {
        //set board size
        board = new int[6][7];
        //display is for creating a string to print
        display = new StringBuilder();
        //for loops to go through rows and then columns
        for(int i = 0; i < board.length; i++)
        {
            for(int k = 0; k < board[0].length; k++)
            {
                //set all index's to 
                board[i][k] = 0;
            }
        }
    }

    /**
     * nextEmpty method:  recieves the number of the column (param) the user wants to drop a token into,
     *         returns the number of the row that is the next empty slot in that column, or -1 if there is none
     * @param int c (Column number is sent into the method)
     * @return int (returns next empty row, or returns -1 if column is full)
     */
    public int nextEmpty(int c)
    {
        //for loop which goes through columns in boardarray, from bottom to top
        for(int i = 0; i < board[0].length; i++)
        {
            //confirms column is within array bounds
            if(i<board.length && c<board[i].length)
            {
                //confirms the slot is open
                if(board[i][c]==0)
                {
                    //returns next empty row as int
                    return i;
                }
            }
        }
        //return -1 if column is full
        return -1;
    }

    /**
     * dropToken method: places a token in the correct spot in the array, given the column entered.
     * @param int team (player number to set the token spot to (1 for player, 2 for PC))
     * @param int c (column number is sent into the method)
     * @return void
     */
    public void dropToken(int team, int c)
    {
        //if for checking if column is full
        if(nextEmpty(c)==-1)
        {
            //error message
            System.out.println("That column is full!");
        }
        else
        {
            //else for dropping the token at specified location for correct player/pc
            board[nextEmpty(c)][c] = team;
        }
    }

    /** 
     *  winCheck method: splits the board array into 4 quadrants (bottom left, bottom right, top left, top right, in that order),
     *                   then checks each location to see if it has 4 tokens in a row 
     *  @return int (returns the value of the location that it's found a row of four at, which also means it returns the winning
     *               player or pc number)
     */
    public int winCheck()
    {
        //if statement to check if board is full
        if((board[5][0]*board[5][1]*board[5][2]*board[5][3]*board[5][4]*board[5][5]*board[5][6])!=0)
        {
            System.out.println("Board is full! Game tie!");
            return -1;
        }
        //for loop to scan through entire board array (rows, then columns)
        for(int v = 0; v < board.length; v++)
        {
            for(int h = 0; h < board[0].length; h++)
            {
                //ensures board position isnt empty
                if(board[v][h]!=0){
                    //bottom half of the board
                    if(v<=2)
                    {
                        //bottom left side of the board
                        if(h<=3)
                        {
                            //checking for horizontal wins, return location and winner
                            if(board[v][h]==board[v][h+1]&&board[v][h]==board[v][h+2]&&board[v][h]==board[v][h+3])
                            {return board[v][h];}
                            //checking for vertical wins, return location and winner
                            if(board[v][h]==board[v+1][h]&&board[v][h]==board[v+2][h]&&board[v][h]==board[v+3][h])
                            {return board[v][h];}
                            //checking for diagonal wins up to the right, return location and winner
                            if(board[v][h]==board[v+1][h+1]&&board[v][h]==board[v+2][h+2]&&board[v][h]==board[v+3][h+3])
                            {return board[v][h];}
                        }
                        //bottom right side of the board
                        if(h>=3)
                        {
                            //checking for horizontal wins, return location and winner
                            if(board[v][h]==board[v][h-1]&&board[v][h]==board[v][h-2]&&board[v][h]==board[v][h-3])
                            {return board[v][h];}
                            //checking for vertical wins, return location and winner
                            if(board[v][h]==board[v+1][h]&&board[v][h]==board[v+2][h]&&board[v][h]==board[v+3][h])
                            {return board[v][h];}
                            //checking for diagonal wins up to the left, return location and winner
                            if(board[v][h]==board[v+1][h-1]&&board[v][h]==board[v+2][h-2]&&board[v][h]==board[v+3][h-3])
                            {return board[v][h];}
                        }
                    }
                    //top half of the board
                    if(v>=3)
                    {
                        //top left side of the board
                        if(h<=3)
                        {
                            //checking for horizontal wins, return location and winner
                            if(board[v][h]==board[v][h+1]&&board[v][h]==board[v][h+2]&&board[v][h]==board[v][h+3])
                            {return board[v][h];}
                            //checking for vertical wins, return location and winner
                            if(board[v][h]==board[v-1][h]&&board[v][h]==board[v-2][h]&&board[v][h]==board[v-3][h])
                            {return board[v][h];}
                            //checking for diagonal wins down to the right, return location and winner
                            if(board[v][h]==board[v-1][h+1]&&board[v][h]==board[v-2][h+2]&&board[v][h]==board[v-3][h+3])
                            {return board[v][h];}
                        }
                        //top right side of the board
                        if(h>=3)
                        {
                            //checking for horizontal wins, return location and winner
                            if(board[v][h]==board[v][h-1]&&board[v][h]==board[v][h-2]&&board[v][h]==board[v][h-3])
                            {return board[v][h];}
                            //checking for vertical wins, return location and winner
                            if(board[v][h]==board[v-1][h]&&board[v][h]==board[v-2][h]&&board[v][h]==board[v-3][h])
                            {return board[v][h];}
                            //checking for diagonal wins down to the left, return location and winner
                            if(board[v][h]==board[v-1][h-1]&&board[v][h]==board[v-2][h-2]&&board[v][h]==board[v-3][h-3])
                            {return board[v][h];}
                        }
                    } 
                }
            }
        }
        //returns 0 for no wins so nothing is affected
        return 0;
    }

    /**
     * robotPriority method: the code in this method runs the robotPriority method in the RobotThink class (made new class to improve efficiency of both classes)
     * @return int (returns the column value where computer decides to place token)
     */
    public int robotPriority()
    {
        //new RobotThink class object, takes 2D array as argument
        RobotThink robo = new RobotThink(board);
        //returns column value for robo object
        return robo.robotPriority();
    }

    /**
     * toString method: prints the board, creating it with the display StringBuilder to utilize appending
     * @return String (returns a string of the board)
     */
    public String toString()
    {
        //new display StringBuilder object
        display = new StringBuilder();
        //for loop that goes through rows and columns of board array
        for(int i = 5; i > -1; i--)
        {
            for(int k = 0; k < board[0].length; k++)
            {
                //appends and prints the board array
                display.append(board[i][k]+" ");
            }
            //skips a line for every vertical line passed
            display.append("\n");
        }
        return display.toString();
    }

    /**
     * clearBoard method: this method is utilized in the driver to clear the 2D board array after a new game is started
     * @return String (returns a string of the cleared board)
     */
    public String clearBoard()
    {
        //new display StringBuilder object
        display = new StringBuilder();
        //for loop to set each row and column index to 0
        for(int i = 0; i < board.length; i++)
        {
            for(int k = 0; k < board[0].length; k++)
            {
                //set to 0
                board[i][k] = 0;
            }
        }
        return display.toString();
    }
}
