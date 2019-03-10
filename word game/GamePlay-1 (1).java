
/**
 * Hangman game utilizing 4 premade text files with 20 phrases in each
 * Allow user to choose from the 4 categories stored in .txt files
 * Chooses a random line from chosen category
 * User plays a round with random phrase from chosen category
 * Asks user to play again or not after they are finished
 * 
 * 
 * 
 * @author Jack Ajizian
 * @version 7/24/2018
 */

import java.io.*;
import java.util.*;

public class GamePlay
{
    public static void main(String[ ] args) throws IOException
    {
        //Scanner for user input
        Scanner input = new Scanner(System.in);
        //RNG object for choosing line of text from file
        Random rng = new Random();
        //placeholder object for file user choosers
        String file;
        //array holding text from txt files
        String[] text = new String[20];
        //allow user to continue playing 
        char playAgain = 'y';

        ////checks if user has already entered a letter or not
        boolean [ ] used = new boolean[255];
        char guess;

        //String placeholder for user category choice, used in switch statement below
        String kb;
        //Scanner for whatever user chooses
        Scanner choose;

        //starting loop
        while (playAgain == 'y')
        {

            //Displays category options for user
            System.out.println("Please enter 1, 2, 3, or 4 for the following options:");
            System.out.println("\n1: Top Movies of 2017.");
            System.out.println("\n2: Top Songs of 2017");
            System.out.println("\n3: Top TV Shows of 2017");
            System.out.println("\n4: Top Games All Time");

            //converts user input to kb String
            kb = input.next();

            //switch statement based off user option
            switch (kb)
            {
                //case 1
                case "1":
                System.out.println("\nYou have chosen the movie category!");
                System.out.println("You may begin guessing now.");
                //sets String file to .txt file
                file = "movies.txt";
                //reads txt file
                choose = new Scanner(new File(file));
                //reads through txt file and stores 20 phrases into the text array
                for (int x = 0; x < 20; x++)
                {
                    text[x] = choose.nextLine();
                }
                break;

                //case 2
                case "2":
                System.out.println("\nYou have chosen the songs category!");
                System.out.println("You may begin guessing now.");
                //sets String file to .txt file
                file = "songs.txt";
                //reads txt file
                choose = new Scanner(new File(file));
                //reads through txt file and stores 20 phrases into the text array
                for (int x = 0; x < 20; x++)
                {
                    text[x] = choose.nextLine();
                }
                break;

                //case 3
                case "3":
                System.out.println("\nYou have chosen the TV show category!");
                System.out.println("You may begin guessing now.");
                //sets String file to .txt file
                file = "television.txt";
                //reads txt file
                choose = new Scanner(new File(file));
                //reads through txt file and stores 20 phrases into the text array
                for (int x = 0; x < 20; x++)
                {
                    text[x] = choose.nextLine();
                }
                break;

                //case 4
                case "4":
                System.out.println("\nYou have chosen the game category!");
                System.out.println("You may begin guessing now.");
                //sets String file to .txt file
                file = "games.txt";
                //reads txt file
                choose = new Scanner(new File(file));
                //reads through txt file and stores 20 phrases into the text array
                for (int x = 0; x < 20; x++)
                {
                    text[x] = choose.nextLine();
                }
                break;
                
                //default error message in case user does not enter appropriate input
                default:
                System.out.println("\nError! You must enter the number corresponding to the categories listed!"
                            +       "\nPlease restart the program to play again.");
                return;
            }

            
            //creates new instance of GameWord, randomly chooses random phrase
            GameWord myPhrase = new GameWord(text[rng.nextInt(20)]);
            //prints out new instance of GameWord using the toString method
            System.out.println("\n" + myPhrase.toString( ));

            
            //loops through GameWord methods during gameplay
            while(!myPhrase.checkWin( ) && ! myPhrase.getGameOver( ))
            {
                do
                {
                    //tells user to enter another character
                    System.out.print("\nEnter your character: ");
                    //reads user input
                    guess = input.next( ).charAt(0);
                    //tells user that they had a duplicate input if that is the case
                    if(used[guess]) System.out.println("That letter has already been guessed.");

                }
                //updates user based on their inputs
                while (used[guess]);
                used[guess] = true; 
                myPhrase.find(guess);
                System.out.println("\n" + myPhrase.toString( ));
            }

            //winning message when user wins
            if(myPhrase.checkWin( ))
            {
                System.out.println("Congratulations! You won!");
            }

            //clears array of used letters after game is over, regardless of win or loss
            for (int y = 0; y < used.length; y++)
            {
                used[y] = false;
            }

            //ask user to play again or not
            System.out.println("\nEnter y to play again" +
                "\nAny other input will close the program.");
            //takes user input and checks with initial while loop to play again or not
            playAgain = input.next().charAt(0);
        }
    }
}
