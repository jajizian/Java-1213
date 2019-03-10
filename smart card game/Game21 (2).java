
/**
 *Driver named Game21, plays the game
 *several fields
 *while loops for both dealer and player which are nested inside a goAgain loop
 *
 * @author jack ajizian
 * @version 7/30/2018
 */

import java.util.*;
import java.io.*;

//Game21 class creation
public class Game21
{
    public static void main(String[] args)throws IOException
    {
        //fields
        //Deck objects for dealer and player
        Deck dealerDeck = new Deck();
        Deck playerDeck = new Deck();
        //Game objects for dealer and player
        Game dealer;
        Game player;
        //Scanner object
        Scanner kb = new Scanner(System.in);
        //goAgain var
        char goAgain = 'y';
        //win counter
        int[] wins = {0,0};

        //FileWriter variable (couldnt get PrintWriter to append)
        FileWriter fw;

        //while loop for while player wants to continue
        while(goAgain == 'y')
        {
            //shuffles dealer and player decks
            dealerDeck.shuffle();
            playerDeck.shuffle();
            //new player and dealer decks, get topCard for both players
            dealer = new Game(dealerDeck.getTopCard(), dealerDeck.getTopCard());
            player = new Game(playerDeck.getTopCard(), playerDeck.getTopCard());

            //dealer goes first, prints his hand
            System.out.println("Dealer's cards: \n" + dealer.toString());
            System.out.println("Dealer's score: \n" + dealer.getScore());

            //while for dealer hitting or not
            while(dealer.getScore() <= 16)
            {
                //when hitting, add card and print new card
                dealer.addCard(dealerDeck.getTopCard());
                System.out.println("\nDealer hits.");

                //if for when dealer busts
                if(dealer.getScore() > 21 )
                {
                    System.out.println(dealer.toString());
                    System.out.println("Dealer busts with score: " + dealer.getScore());
                    System.out.println("Player wins.");

                    //adds win to player 
                    wins[1]++;
                    break;
                }
                //if for when dealer gets blackjack, allows player to try and tie
                if (dealer.getScore() == 21)
                {
                    System.out.println(dealer.toString());
                    System.out.println("Dealer scored a 21!"
                        + "\nThe player must tie now.");

                }
                //if for when dealer gets new card added
                if (dealer.getScore() < 21) 
                {
                    System.out.println("Dealer's new hand: \n" + dealer.toString()
                        + "\nDealer's new score: " + dealer.getScore());

                }

            }

            //divider to show when dealers turn is over and player turn begins
            System.out.println("----------------------------------------------------");
            //prints players score and hand
            System.out.println("Player's score: " + player.getScore());
            System.out.println("Player's hand: " + player.toString());

            //while loop with several conditions listed below:
            //player score is under 21
            //AND dealer score is <= 21
            //AND player score is < dealer score 
            //OR player and dealer score is the same

            while(player.getScore() < 21  && dealer.getScore() <= 21 && player.getScore() < dealer.getScore() || player.getScore() == dealer.getScore() )
            {
                //if both have same score, prints Tie message
                if(player.getScore() == dealer.getScore())
                {
                    System.out.println("Dealer and Player tie.  \nNo wins awarded.");
                    break;
                }

                //asks player if they would like to hit or not
                System.out.println("Would you like to hit?");
                System.out.println("Press y for yes, press n for no");

                //if they hit:
                if(kb.next().charAt(0) == 'y')
                {
                    //add new card to player hand and get new score
                    player.addCard(playerDeck.getTopCard());
                    player.getScore();
                }
                //if they dont hit...
                else 
                {
                    goAgain = 'n';  
                    //loss message for player, updates win for dealer
                    System.out.println("Player didn't hit for some reason and loses the hand...");
                    wins[0]++;
                    break;

                }    

                //if player busts:
                if(player.getScore() > 21)
                {
                    //bust message, adds win to dealer
                    System.out.println("Player busts with score: " + player.getScore());
                    System.out.println(player.toString());
                    wins[0]++;

                }
                //if player is still continuing the round
                else
                {
                    //prints out updated player score
                    System.out.println("Player's score: " + player.getScore());
                    System.out.println(player.toString());
                }

                //if player gets blackjack and dealer is under 21 or over 21
                if(player.getScore() == 21 && dealer.getScore() < 21 || dealer.getScore() > 21)
                {
                    //player wins message, adds win to player count
                    System.out.println("Player wins with score: " + player.getScore());
                    wins[1]++;

                }

                //if dealer and player is under 21 AND player has higher score  
                if(dealer.getScore() < 21 && player.getScore() < 21 && player.getScore() > dealer.getScore())
                {
                    //player wins statement, updates win count for player
                    System.out.println("Player wins with score " + player.getScore());
                    wins[1]++;
                    break;
                }
            }
            //end of game message
            System.out.println("\nEND OF GAME!");
            //displays both dealer and player wins
            System.out.println("Number of Dealer wins: " + wins[0]);
            System.out.println("Number of Player wins: " + wins[1]);


            //ask user to play again or not
            System.out.println("Would you like to play again?" + 
                "\nPress y for yes, n for no");

            //checks for user input whether to play again or not
            goAgain = kb.next().charAt(0);
        }

        
        //String for filename
        String fileName = "wins.txt";
        //new FileWriter creation for (fileName, true for appending)
        fw = new FileWriter(fileName, true);
        //prints start of new session's wins
        fw.write("New Game Session:");
        //line separator for clarity
        fw.write(System.lineSeparator());
        //append and print dealer wins
        fw.append("Number of Dealer wins: " + wins[0]);
        //line separator
        fw.write(System.lineSeparator());
        //append and print player wins
        fw.append("Number of Player wins: " + wins[1]);
        //double line separator for when new session starts
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        //close filewriter
        fw.close();
        

    }

}