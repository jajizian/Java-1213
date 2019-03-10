
/**
 * Game class creation for game actions and counting scores
 * several fields
 * Game constrctor with 2 params
 * addCard method for adding card to hand
 * getScore method for returning score
 * toString method using stringbuilder
 *
 * @author jack ajizian
 * @version 7/30/2018
 */

//Game class creation
public class Game
{
    //fields
    //cards array for players hand
    private Card[] cards = new Card[11];
    //cardCount var
    private int cardCount = 0;
    //score var
    private int score;
    
    /**
     * Game constructor
     * @param Card object for first card dealt
     * @param Card object for second card dealt
     */
    public Game(Card one, Card two)
    {
        //add 2 cards to hand of either dealer/player
        addCard(one);
        addCard(two);
    }
    
    /**
     * addCard method for adding cards to hand
     * @return void
     * @param Card object other
     */
    public void addCard(Card other)
    {
        //add new card to players hand
        cards[cardCount] = new Card(other.getSuit(), other.getFace());
        //increcement for each new card added
        cardCount++;
        
        //set value of the new card and add it to the players score
        switch(other.getFace().toLowerCase())
        {
            case "jack":
            case "queen":
            case "king":
                score = score + 10;
                break;
                
            case "ace":
            //if/else loop for deciding whether aces count as high or low
               if(score + 11 > 21)
            {
                score = score + 1;
            }
            else  
            {
                score = score + 11;
            }
                break;
                
            default:
                score = score + Integer.parseInt(other.getFace());
                break;
        }
    }
    
    /**
     * getScore method for returning score
     * @return int for score
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * toString method with StringBuilder and appending
     * this is what driver calls, has Card class toString inside the stringbuilder printout
     * @return String
     */
    public String toString()
    {
        //stringbuilder creation
        StringBuilder sb = new StringBuilder();
        
        //for loop for each card to append
        for (int i = 0; i < cardCount; i++)
        {
            sb.append("\nCard: "+ (i+1) + cards[i].toString() + "\n");
        } 
        return sb.toString();
    }
}
