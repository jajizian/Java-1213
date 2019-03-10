
/**
 * Array of References
 * String Tokenizers
 * search and sort
 * 
 *
 * @author (Jack Ajizian)
 * @version (7/30/2018)
 */
public class Book
{
    //fields
    //number of books/array slots
    private int numBooks;
    private String author;
    private String publisher;
    private String bookName;
    private String date;
    private String isbn;
    private double price;
    private int quantity;
    
    
    
    //default const
    public Book()
    {
        bookName = new String("book");
        author = new String("author");
        publisher = new String("publisher");
        price = 0.0;
        isbn = new String("ISBN");
        date = new String("date");
        quantity = 0;
        
        
        
    }
    
    //overloaded with all variables
    public Book(String pBookName, String pAuthor, String pPublisher, double pPrice, String pIsbn, String pDate, int pQuantity)
    {
        bookName = new String(pBookName);
        author = new String(pAuthor);
        publisher = new String(pPublisher);
        price = pPrice;
        isbn = new String(pIsbn);
        date = new String(pDate);
        quantity = pQuantity;
        
    }
    
    //setter for price
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
    //quantity setter
    public void setQuantity(int newQuantity)
    {
        quantity = newQuantity;
    }
   //get book name
    public String getBook()
    {
        return bookName;
    }
    //get isbn
    public String getISBN()
    {
        return isbn;
    }
    //get author
    public String getAuthor()
    {
        return author;
    }
    //get price
    public double getPrice()
    {
        return price;
    }
    
    //get quantity
    public int getQuantity()
    {
        return quantity;
    }
    
    //tostring
    public String toString()
    {
        return "\nBook name: " + bookName + ", " +
        "\nAuthor: " + author + ", " +
        "\nPublisher: " + publisher + ", " +
        "\nPrice for book: " + price + ", " +
        "\nISBN: " + isbn + ", " +
        "\nRelease Date: " + date + ", " +
        "\nQuantity in Stock: " + quantity;
                  
    }
    
    //equals to
    public boolean equals(Book other)
    {
        return this.bookName.equals(other.bookName);
    }
    
    public int compareTo(Book other)
    {
        return (this.bookName).compareToIgnoreCase(other.bookName);
    }
    
}
