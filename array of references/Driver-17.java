
/**
 * Book class driver
 *
 * @author Jack Ajizian
 * @version 7/30/2018
 */

import java.io.*;
import java.util.*;
public class Driver
{
    public static void main(String[] args)throws IOException
    {
        int numBooks;
        String author;
        String publisher;
        String bookName;
        String date;
        String isbn;
        double price;
        int quantity;

        Book[] book; 
        Scanner keyboard = new Scanner(System.in);
        Scanner fileName = new Scanner(new File("bookdata.txt"));
        StringTokenizer tokens;

        int numberOfBooks;
        numberOfBooks = fileName.nextInt();
        fileName.nextLine();

        book = new Book[numberOfBooks];

        for (int i = 0; i < book.length; i++)
        {
            tokens = new StringTokenizer(fileName.nextLine(), ",");

            bookName = tokens.nextToken();
            author = tokens.nextToken();
            publisher = tokens.nextToken();
            price = Double.parseDouble(tokens.nextToken());
            isbn = tokens.nextToken();
            date = tokens.nextToken();
            quantity = Integer.parseInt(tokens.nextToken());

            book[i] = new Book(bookName, author, publisher, price, isbn, date, quantity);

            
        }
        
        System.out.println("\nHere is the list of books:");
        for(int i = 0; i < book.length; i++)
        {
            System.out.println(book[i]);
        }
        
        //this is where i stopped
        //present the menu with choices
        //System.out.println("Enter the name of a book title 

    }
}
