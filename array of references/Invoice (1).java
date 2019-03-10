
/**
 * Array of References
 * String Tokenizers
 * search and sort
 * 
 *
 * @author (Jack Ajizian)
 * @version (7/30/2018)
 */
public class Invoice
{
    //fields
    private String invoiceID;
    private String description;
    private double amount;
    private boolean isPaid;

    
    //default const
    public Invoice()
    {
        String invoiceID = "invoice ID";
        String description = "description";
        double amount = 0.0;
        boolean isPaid = true;

    }
    //overloaded with all variables
    public Invoice(String id, String desc, double price, boolean paid)
    {
        invoiceID = id;
        description = desc;
        amount = price;
        isPaid = paid;

    }
    //setter for price
    public void setAmount(double newAmount)
    {
        amount = newAmount;
    }
    //boolean setter
    public void setBoolean(boolean newBoolean)
    {
        isPaid = newBoolean;
    }
    //get id name
    public String getID()
    {
        return invoiceID;
    }
    //get description
    public String getDesc()
    {
        return description;
    }
    //get price
    public double getPrice()
    {
        return amount;
    }
    //get boolean
    public boolean getBoolean()
    {
        return isPaid;
    }

    //tostring
    public String toString()
    {
        return "\nInvoice ID: " + invoiceID + ", " +
        "\nDescription: " + description + ", " +
        "\nAmount: " + amount + ", " +
        "\nTrue or False: " + isPaid;

    }

    //equals to
    public boolean equals(Invoice other)
    {
        return this.invoiceID.equals(other.invoiceID);
    }

    public int compareTo(Invoice other)
    {
        if(this.amount < other.amount)
        {
            return -1;
        }
        else if(other.amount < this.amount)
        {
            return 1;
        }
        return 0;

       
    }

}
