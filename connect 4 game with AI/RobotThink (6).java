import java.util.Random;
/**
 * This class is the computer's move choice processor. It's a seperate class because BlueJ can only handle so many lines of code at once so I moved the robotPriority method here and added
 * appropriate methods and fields around it so that it could function exactly how it did before.
 * 
 * This class is used to return an int that is the horizontal index of the computer's move choice. It decides this based on the tokens around each empty space that it can move to,
 * adding 1 to a priority counter for each token in a row next to this empty space in all four diagonal directions, both horizontal directions, and down. The added value is increased
 * to 1.2 for each player token, as it should play more defensively than offensively (if it played equally defensively and offensively it would behave weirdly)
 * If the computer has one space away from a connect four it adds 40 to priority, if the player is about to get connect four it adds 30 to priority so that if it can win, it will do that
 * over blocking a player move.
 * Finally, each indexed priority value is compared and the index of the highest is retrieved. If two values are the same a randomizer picks one of the two randomly so that
 * the computer does not bias to play from left to right.
 * It returns its chosen index which is sent into GameConnect's robotPriority method which only exists to call this class (which is again because bluej lags with too much code)
 * 
 * It's really good at the game and I like it a lot
 * 
 * @author Aimee Rusin, Jonathan Ajizian, Samantha Mitchell
 * @version 10 August 2018
 * 
 */
public class RobotThink
{
    // think array is to store different values for priority
    private double[] think;
    //highest, highestIndex and temp are used for searching through think and storing the highest value of the think array
    private double highest;
    private int highestIndex;
    private double temp;
    private int board[][];
    //board is here too because the code was copied and when you send a board array into this one it can use it the same way
    /**
     * Constructor for objects of class RobotThink
     * The constructor for this should never be run without parameters but a default one is here for fun
     */
    public RobotThink()
    {
        board = new int[6][7];
        think = new double[7];
        temp = 0;
        highest = 0;
        highestIndex = 0;
        //sets each index to 0
        for(int i = 0; i < board.length; i++)
        {
            for(int k = 0; k < board[0].length; k++)
            {
                board[i][k] = 0;
            }
        }
        think[0] =think[1] =think[2] =think[3] =think[4] =think[5] =think[6] = 0;
    }
/**
 * Overloaded constructor takes the board from the other class so that this one can use it
 * @param mat- Copy of the board from the other class
 */
    public RobotThink(int[][] mat)
    {
        board = mat;
        think = new double[7];
        temp = 0;
        highest = 0;
         highestIndex = 0;
        think[0] =think[1] =think[2] =think[3] =think[4] =think[5] =think[6] = 0;
    }
    /**
     * nextEmpty loops through vertical values at a specified column until it gets a 0 and it returns what is equal to the height of the zero. If it doesn't get an empty spot it returns -1
     * This is copied from GameConnect because robotPriority uses it
     * 
     * @param c- int for the column index you want to search
     * @return int- returns an int for the row index of the empty spot(or -1 if there is no empty spot)
     */
    public int nextEmpty(int c)
    {
        //This loop scans the column from the bottom upwards within array bounds, breaking as it returns an empty spot
        for(int i = 0; i < board[0].length; i++)
        {
            if(i<board.length&&c<board[i].length)
            {
                if(board[i][c]==0)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    /**
 * There is a LOT of ternary in this method because I wanted to try to keep it as clean as possible(also the BlueJ coloring was beginning to lag my computer)
 * 
 * Using nextEmpty(copied from the other class) the computer checks all 7 possible directions and considers the tokens placed there (every direction except for up)
 * It adds 1.2 for each consecutive player token and 1 for its own tokens to a priority double array index in order to decide which space is most important to move to.
 * If multiple directions have the same priority it will choose between them randomly. Its own connect fours have the highest priority and blocking player connect fours
 * have the second highest priority.
 * This flowerbox is similar to the one at the top of this class because this class only exists to hold this method
 * 
 * This is too ambitious and I am tired
 * @return int- returns the column value that the computer decides to move to
 */
public int robotPriority()
    {
        think[0] =think[1] =think[2] =think[3] =think[4] =think[5] =think[6] = 0; 
        for(int count = 0; count <=6; count++)
        {
            //makes sure the current count has an empty spot
            if(nextEmpty(count)!=-1)
                    {

                    //**checking below the empty space
                    //this if will only be entered if the current nextEmpty is higher than the bottom
                 if(nextEmpty(count)!=0)
                 {
                  //since we're now one above the bottom it does the above if again but can now consider the token below in the else
                    if(nextEmpty(count)!=1)
                    {
                        //same as before but the else considers the bottom two
                        if(nextEmpty(count)!=2)
                        {
                            //if it's a full line below it it enters this if else it checks the two spaces below it
                            if(board[nextEmpty(count)-1][count]==board[nextEmpty(count)-2][count]&&board[nextEmpty(count)-1][count]==board[nextEmpty(count)-3][count])
                            {
                                think[count]+=(board[nextEmpty(count)-1][count]==2?40:30);
                            }
                            else
                            {
                                /**
                                 * This ternary is copied to the one below it as they both check the two spaces below.
                                 * What's happening is it checks if the two below added together are equal to 3, which means they would be different since the tokens would have to be 1 and 2.
                                 * if they're indeed different it enters the next set of ternary which checks just the one below since the one below THAT is blocked off.
                                 * The last thing in the big ternary block is the else, which does the same thing as the one before it but the values are multiplied by two since
                                 * the two tokens below it must be the same since they !=3, and it just checks the one below to check.
                                 * This was the first directional checker that I completed fully and the others are all based off of it.
                                 */
                            think[count]+=((board[nextEmpty(count)-1][count]+board[nextEmpty(count)-2][count])==3?(board[nextEmpty(count)-1][count]==2?1:1.2):(board[nextEmpty(count)-1][count]==2?2:2.4));
                            }
                        }
                        else
                        {
                            think[count]+=((board[nextEmpty(count)-1][count]+board[nextEmpty(count)-2][count])==3?(board[nextEmpty(count)-1][count]==2?1:1.2):(board[nextEmpty(count)-1][count]==2?2:2.4));
                        }
                    }
                    else
                    {
                        //since this is after the first down if statement it just checks what the token below is and adds accordingly
                        think[count]+=(board[nextEmpty(count)-1][count]==2?1:1.2);
                    }
                 }
                
                 
                 
                 
                //**checking to the right of the empty space
                //starts from the right side at index 6 so it can act according to the space it has
                 if(count!=6)
                 {
                     if(count >1&&board[nextEmpty(count)][count+1]!=0&&board[nextEmpty(count)][count+1]==board[nextEmpty(count)][count-1]&&board[nextEmpty(count)][count-1]==board[nextEmpty(count)][count-2])
                     {//this if statement runs if count is between index 5 and 2 and so it can check for partially complete connect fours that aren't in a straight line(makigng sure they're not zero)
                        think[count]+=(board[nextEmpty(count)][count+1]==2?40:30);
                        }
                   //makes sure that the adjacent checked space is not zero so that it doesn't value an empty space as a full one
                   if(board[nextEmpty(count)][count+1]!=0){
                     //since we're now one away from the right it does the above if again but can now consider the token to the right in the else
                    if(count!=5)
                    {
                        //same as before but the else considers the two to the right
                        if(count!=4)
                        {
                            //if it's a full line to the right it it enters this if else it checks the two spaces directly to the right
                            if(board[nextEmpty(count)][count+1]==board[nextEmpty(count)][count+2]&&board[nextEmpty(count)][count+1]==board[nextEmpty(count)][count+3])
                            {
                                think[count]+=(board[nextEmpty(count)][count+1]==2?40:30);
                            }
                            else
                            {
                                /**
                                 * Everything in this whole next if/then chain was just copied from the down one and modified so the locations work to the right instead.
                                 */
                            think[count]+=((board[nextEmpty(count)][count+1]+board[nextEmpty(count)][count+2])==3?(board[nextEmpty(count)][count+1]==2?1:1.2):(board[nextEmpty(count)][count+1]==2?2:2.4));
                            }
                        }
                        else
                        {
                            think[count]+=((board[nextEmpty(count)][count+1]+board[nextEmpty(count)][count+2])==3?(board[nextEmpty(count)][count+1]==2?1:1.2):(board[nextEmpty(count)][count+1]==2?2:2.4));
                        }
                    }
                    else
                    {
                        //since this is after the first if statement it just checks what the token to the right is and adds accordingly
                        think[count]+=(board[nextEmpty(count)][count+1]==2?1:1.2);
                    }
                   }
                 }
                //**checking to the left of the empty space
                //starts from the left side at index 0 so it can act according to the space it has
                 if(count!=0)
                 {
                     if(count <5&&board[nextEmpty(count)][count+1]!=0&&board[nextEmpty(count)][count-1]==board[nextEmpty(count)][count+1]&&board[nextEmpty(count)][count-1]==board[nextEmpty(count)][count+2])
                     {//this if statement runs if count is between index 4 and 1 so it can check for partially complete connect fours that aren't in a straight line(making sure they arent zero
                        think[count]+=(board[nextEmpty(count)][count+1]==2?40:30);
                        }
                    //makes sure that the adjacent checked space is not zero so that it doesn't value an empty space as a full one
                   if(board[nextEmpty(count)][count-1]!=0){
                     //since we're now one away from the left it does the above if again but can now consider the token to the left in the else
                    if(count!=1)
                    {
                        //same as before but the else considers the two to the left
                        if(count!=2)
                        {
                            //if it's a full line to the left it it enters this if else it checks the two spaces directly to the left
                            if(board[nextEmpty(count)][count-1]==board[nextEmpty(count)][count-2]&&board[nextEmpty(count)][count-1]==board[nextEmpty(count)][count-3])
                            {
                                think[count]+=(board[nextEmpty(count)][count-1]==2?40:30);
                            }
                            else
                            {
                                /**
                                 * Everything in this whole next if/then chain was just copied from the right one and modified so the locations work to the left instead.
                                 */
                            think[count]+=((board[nextEmpty(count)][count-1]+board[nextEmpty(count)][count-2])==3?(board[nextEmpty(count)][count-1]==2?1:1.2):(board[nextEmpty(count)][count-1]==2?2:2.4));
                            }
                        }
                        else
                        {
                            think[count]+=((board[nextEmpty(count)][count-1]+board[nextEmpty(count)][count-2])==3?(board[nextEmpty(count)][count-1]==2?1:1.2):(board[nextEmpty(count)][count-1]==2?2:2.4));
                        }
                    }
                    else
                    {
                        //since this is after the first if statement it just checks what the token to the left is and adds accordingly
                        think[count]+=(board[nextEmpty(count)][count-1]==2?1:1.2);
                    }
                }
                 }
                    //**checking diagonally down and to the right from the empty space
                 /**
                  * The diagonals are a combination of the above since they need to check the horizontal index as well as the vertical index. Despite this, these can still be made more
                  * easily if I just copy the above code and modify it more. I am going to comment less below because if it was worth looking through the above stuff you can probably tell
                  * what I'm doing by the pattern.
                  */
                 //since this is diagonally down and to the right it first checks to make sure it's not on the bottom (via nextEmpty) and that it's not on the right (via count)
                 if(count!=6&&nextEmpty(count)!=0)
                 {
                    //makes sure that the adjacent checked space is not zero so that it doesn't value an empty space as a full one
                   if(board[nextEmpty(count)-1][count+1]!=0){

                     //Now the if checks to see if it's in the backwards L shape of tiles adjacent to the edge (because they all have one possible down to the right location
                    if(count!=5&&nextEmpty(count)!=1)
                    {
                        //Same as the above but one farther out.
                        if(count!=4&&nextEmpty(count)!=2)
                        {
                            //Now it checks for full rows and deals with it or goes to the else.
                            if(board[nextEmpty(count)-1][count+1]==board[nextEmpty(count)-2][count+2]&&board[nextEmpty(count)-1][count+1]==board[nextEmpty(count)-3][count+3])
                            {
                                think[count]+=(board[nextEmpty(count)-1][count+1]==2?40:30);
                            }
                            else
                            {
                                /**
                                 * Everything in this whole next if/then chain was just copied from the right one and modified so the locations work down as well
                                 */
                            think[count]+=((board[nextEmpty(count)-1][count+1]+board[nextEmpty(count)-2][count+2])==3?(board[nextEmpty(count)-1][count+1]==2?1:1.2):(board[nextEmpty(count)-1][count+1]==2?2:2.4));
                            }
                        }
                        else
                        {
                            think[count]+=((board[nextEmpty(count)-1][count+1]+board[nextEmpty(count)-2][count+2])==3?(board[nextEmpty(count)-1][count+1]==2?1:1.2):(board[nextEmpty(count)-1][count+1]==2?2:2.4));
                        }
                    }
                    else
                    {
                        //since this is after the first if statement it just checks what the token to the right and down is
                        think[count]+=(board[nextEmpty(count)-1][count+1]==2?1:1.2);
                    }
                }
                 }
                    //**checking diagonally up and to the right from the empty space
                    /**
                     * Flowerboxing this so it's more visible.
                     * After writing the first diagonal I am just changing pluses to minuses and vice versa in ALL of the diagonals so forgive me if i do not remember to change some comments.
                     * If you're still meticulously reading these comments and this code you're a real one :thumbs_up:
                     */
                    //since this is diagonally up and to the right it first checks to make sure it's not on the top (via nextEmpty) and that it's not on the right (via count)
                 if(count!=6&&nextEmpty(count)!=5)
                 {
                    //makes sure that the adjacent checked space is not zero so that it doesn't value an empty space as a full one
                   if(board[nextEmpty(count)+1][count+1]!=0){

                     //Now the if checks to see if it's in the weird L shape of tiles adjacent to the edge (because they all have one possible up to the right location
                    if(count!=5&&nextEmpty(count)!=4)
                    {
                        //Same as the above but one farther out.
                        if(count!=4&&nextEmpty(count)!=3)
                        {
                            //Now it checks for full rows and deals with it or goes to the else.
                            if(board[nextEmpty(count)+1][count+1]==board[nextEmpty(count)+2][count+2]&&board[nextEmpty(count)+1][count+1]==board[nextEmpty(count)+3][count+3])
                            {
                                think[count]+=(board[nextEmpty(count)+1][count+1]==2?40:30);
                            }
                            else
                            {
                                /**
                                 * Everything in this whole next if/then chain was just copied from the right one and modified so the locations work up as well
                                 */
                            think[count]+=((board[nextEmpty(count)+1][count+1]+board[nextEmpty(count)+2][count+2])==3?(board[nextEmpty(count)+1][count+1]==2?1:1.2):(board[nextEmpty(count)+1][count+1]==2?2:2.4));
                            }
                        }
                        else
                        {
                            think[count]+=((board[nextEmpty(count)+1][count+1]+board[nextEmpty(count)+2][count+2])==3?(board[nextEmpty(count)+1][count+1]==2?1:1.2):(board[nextEmpty(count)+1][count+1]==2?2:2.4));
                        }
                    }
                    else
                    {
                        //since this is after the first if statement it just checks what the token to the top right is and adds accordingly
                        think[count]+=(board[nextEmpty(count)+1][count+1]==2?1:1.2);
                    }
                }
                 }
                 //I cannot stress enough that the following ones are just copied and lightly edited from my above code
                 //**left and up diagonals
                    //since this is diagonally up and to the left it first checks to make sure it's not on the top (via nextEmpty) and that it's not on the left (via count)
                 if(count!=0&&nextEmpty(count)!=5)
                 {
                    //makes sure that the adjacent checked space is not zero so that it doesn't value an empty space as a full one
                   if(board[nextEmpty(count)+1][count-1]!=0){
                     //Now the if checks to see if it's in the weird L shape of tiles adjacent to the edge (because they all have one possible up to the left location                    
                    if(count!=1&&nextEmpty(count)!=4)
                    {
                        //Same as the above but one farther out.
                        if(count!=2&&nextEmpty(count)!=3)
                        {
                            //Now it checks for full rows and deals with it or goes to the else.
                            if(board[nextEmpty(count)+1][count-1]==board[nextEmpty(count)+2][count-2]&&board[nextEmpty(count)+1][count-1]==board[nextEmpty(count)+3][count-3])
                            {
                                think[count]+=(board[nextEmpty(count)+1][count-1]==2?40:30);
                            }
                            else
                            {
                                /**
                                 * Everything in this whole next if/then chain was just copied from the right one and modified so the locations work this way
                                 */
                            think[count]+=((board[nextEmpty(count)+1][count-1]+board[nextEmpty(count)+2][count-2])==3?(board[nextEmpty(count)+1][count-1]==2?1:1.2):(board[nextEmpty(count)+1][count-1]==2?2:2.4));
                            }
                        }
                        else
                        {
                            think[count]+=((board[nextEmpty(count)+1][count-1]+board[nextEmpty(count)+2][count-2])==3?(board[nextEmpty(count)+1][count-1]==2?1:1.2):(board[nextEmpty(count)+1][count-1]==2?2:2.4));
                        }
                    }
                    else
                    {
                        //since this is after the first if statement it just checks what the token to the top left is and adds accordingly
                        think[count]+=(board[nextEmpty(count)+1][count-1]==2?1:1.2);
                    }
                }
                 }

                    
                  //**left and down diagonals
                    //since this is diagonally down and to the left it first checks to make sure it's not on the bottom (via nextEmpty) and that it's not on the left (via count)
                 if(count!=0&&nextEmpty(count)!=0)
                 {
                    //makes sure that the adjacent checked space is not zero so that it doesn't value an empty space as a full one
                   if(board[nextEmpty(count)-1][count-1]!=0){
                     //Now the if checks to see if it's in the weird L shape of tiles adjacent to the edge (because they all have one possible down to the left location
                    if(count!=1&&nextEmpty(count)!=1)
                    {
                        //Same as the above but one farther out.
                        if(count!=2&&nextEmpty(count)!=2)
                        {
                            //Now it checks for full rows and deals with it or goes to the else.
                            if(board[nextEmpty(count)-1][count-1]==board[nextEmpty(count)-2][count-2]&&board[nextEmpty(count)-1][count-1]==board[nextEmpty(count)-3][count-3])
                            {
                                think[count]+=(board[nextEmpty(count)-1][count-1]==2?40:30);
                            }
                            else
                            {
                                /**
                                 * Everything in this whole next if/then chain was just copied from the right one and modified so the locations work this way
                                 */
                            think[count]+=((board[nextEmpty(count)-1][count-1]+board[nextEmpty(count)-2][count-2])==3?(board[nextEmpty(count)-1][count-1]==2?1:1.2):(board[nextEmpty(count)-1][count-1]==2?2:2.4));
                            }
                        }
                        else
                        {
                            think[count]+=((board[nextEmpty(count)-1][count-1]+board[nextEmpty(count)-2][count-2])==3?(board[nextEmpty(count)-1][count-1]==2?1:1.2):(board[nextEmpty(count)-1][count-1]==2?2:2.4));
                        }
                    }
                    else
                    {
                        //since this is after the first if statement it just checks what the token to the bottom left is and adds accordingly
                        think[count]+=(board[nextEmpty(count)-1][count-1]==2?1:1.2);
                    }
                }
                 }
            }
        }
        //I was going to sort the array but I realized that the values are in their places because this is a game lol
        for(int p = 0; p < 7; p++ )
        {
            if(think[p] > highest)//this loop finds the highest value
            {
                highest = think[p];
            }
        }
        for(int p = 0; p < 7; p++ )
        {
            if(think[p] == highest)//this loop counts the number of the highest value
            {
                temp =temp+1;
                highestIndex = p;//stores highestindex to be returned in a bit
            }
        }
            if(temp==1)
            return highestIndex;//it only took me several hours of coding to get to this point
            else 
            {
                Random rand = new Random();
                temp = 0;
                for(int c = 0; c < 1000; c++)//Using a for loop with a max of 1000 because I am untrustworthy and it kept infinite looping and this is the only change i feel like making
                {   
                    temp=(int)rand.nextInt(7);
                    if(think[(int)temp]==highest)//Basically I am making it randomize an int for index, check if it's equal to the highest value, and then return that index. arrays are weird.
                    break;
                }
                return (int)temp;
            }
    }
}
