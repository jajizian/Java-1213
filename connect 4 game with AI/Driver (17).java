/**
 * This class drives games of Connect Four. It creates a FileWriter to store the player's
 * and computer's scores, displays and updates the game's status, and loops until
 * the player stops entering 'y' to continue. The three of us collaborated in person to
 * make this class.
 *
 * @author Aimee Rusin, Jack Ajizian, Samantha Mitchell
 * @version 10 August 2018
 */

import java.io.*;
import java.util.*;
public class Driver
{
    //throws IOException for filewriter
    public static void main(String[] args)throws IOException
    {
        //creates scanner object for user input
        Scanner scan = new Scanner(System.in);
        //creates new GameConnect class object
        GameConnect gaim = new GameConnect();
        //FileWriter for appending wins to file
        FileWriter fw;
        //winner int for checking if PC or Player won
        int winner = 0;
        //Place exists so that the user's placed location is stored so that the game can check if that column is full
        int place = 0;
        //array of wins for counting number of wins for both player and pc (index 0 = player, index 1 = pc)
        int[] wins = {0,0};
        //char var for playing again or not
        char goAgain = 'y';

        //while player continues playing
        while(goAgain == 'y')
        {
            //prints empty board for user
            System.out.println(gaim.toString());
            //ask for player column to drop token
            System.out.println("What column do you want to drop a token into?");
            //takes user input and stores it in place
            place = scan.nextInt()-1;

            //while loop incase user selects full column or out of bounds, allows them to go again if so
            while(place<0||gaim.nextEmpty(place)==-1||place>6)
            {
                //if user enters column out of bounds of array
                if(gaim.nextEmpty(place)==-1)
                {
                    //error message
                    System.out.println("That column is full, please choose another column!");
                    //allows user to re-enter their column
                    place = scan.nextInt()-1;
                }
                //if user input is in bounds, but the column is full
                else
                {
                    System.out.println("Your input is out of bounds!  Please choose another column between 1 and 7!");
                    //allows user to re-enter a column number
                    place = scan.nextInt()-1;
                }
            }
            
            

            //places player's token in correct column
            gaim.dropToken(1, place);   
            //displays updated board with new player token
            System.out.println(gaim.toString());
            //shows computer's turn for user
            System.out.println("Computer's turn:");
            //drops computers token
            gaim.dropToken(2, gaim.robotPriority());

            //checks to see if someone won
            winner = gaim.winCheck();
            //if player won
            if(winner==1)
            {
                //win message
                System.out.println("You win!");
                //update win count which will be appended to text file
                wins[0]++;
            }
            //if computer won
            if(winner==2)
            {
                //win message
                System.out.println("The computer won!");
                //update win count which will be appended to text file
                wins[1]++;
            }

            //checks if someone won and asks user if they want to play again
            if(winner!=0)
            {
                //displays board with win on it
                System.out.println(gaim.toString());
                //clears board for next game
                gaim.clearBoard();    
                //displays win count for both player and pc
                System.out.println("You have won "+wins[0]+" times and the computer has won "+wins[1] +" times");
                //asks user to play again or not
                System.out.println("\nWould you like to play again?"
                    + "\nPress y to play again, any other input closes the game");
                //scans user input to either play again or close program
                goAgain = scan.next().charAt(0);
            }
        }
        //goodbye message for when user leaves
        System.out.println("Goodbye!");

        //String for filename
        String fileName = "wins.txt";
        //new FileWriter creation for (fileName, true for appending)
        fw = new FileWriter(fileName, true);
        //prints start of new session's wins
        fw.write("New Game Session:");
        //line separator for clarity
        fw.write(System.lineSeparator());
        //append and print dealer wins
        fw.append("Number of Player wins: " + wins[0]);
        //line separator
        fw.write(System.lineSeparator());
        //append and print player wins
        fw.append("Number of Computer wins: " + wins[1]);
        //double line separator for when new session starts
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        //close filewriter
        fw.close();

    }
}