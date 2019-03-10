
//Jack Ajizian ITSC 1213
// 7/11/2018
//activity 3- currencies and their exchange rates
//methods to keep all the fields
//consistent to hold equivalent values

public class Currency
{
    //fields
    private double dollar;
    private double euro;
    private double pound;
    private double rupee;
    private double aussie;
    private double canada;
    
    private final double DOLLAR_TO_EURO;
    private final double DOLLAR_TO_POUND;
    private final double DOLLAR_TO_RUPEE;
    private final double DOLLAR_TO_AUSSIE;
    private final double DOLLAR_TO_CANADA;
    
    //constructor one
    public Currency()
    {
        //sets all fields to 0
        dollar = euro = pound = rupee = aussie = canada = 0;
        
        //sets up exchange rate values
        DOLLAR_TO_EURO = 0.853707;
        DOLLAR_TO_POUND = 0.754565;
        DOLLAR_TO_RUPEE = 68.779561;
        DOLLAR_TO_AUSSIE = 1.3519;
        DOLLAR_TO_CANADA = 1.315081;
        
    }
    
    //constructor two
    public Currency(double amount, String type)
    {
        //sets up exchange rate values
        //need in this constructor in order to initialize them
        DOLLAR_TO_EURO = 0.853707;
        DOLLAR_TO_POUND = 0.754565;
        DOLLAR_TO_RUPEE = 68.779561;
        DOLLAR_TO_AUSSIE = 1.3519;
        DOLLAR_TO_CANADA = 1.315081;
        
        setAmount(amount, type);
    }
    
    public String toString()
    {
        return "Dollars: " + dollar + 
        "\nEuros: " + euro +
        "\nPounds: " + pound +
        "\nRupees: " + rupee +
        "\nAUSD: " + aussie +
        "\nCAD: " + canada;
        
    }
    //set methods are always void
    public void setAmount(double amount, String type)
    {
         //switch statements
        switch (type)
        {
            case "dollar" : dollar = amount;
            break;
            
            case "euro" : dollar = amount/DOLLAR_TO_EURO;
            break;
            
            case "pound" : dollar = amount/DOLLAR_TO_POUND;
            break;
            
            case "rupee" : dollar = amount/DOLLAR_TO_RUPEE;
            break;
            
            case "aussie" : dollar = amount/DOLLAR_TO_AUSSIE;
            break;
            
            case "canada" : dollar = amount/DOLLAR_TO_CANADA;
            break;
            
            
        } //end of switch statement
        
        
        euro = dollar * DOLLAR_TO_EURO;
        pound = dollar * DOLLAR_TO_POUND;
        rupee = dollar * DOLLAR_TO_RUPEE;
        aussie = dollar * DOLLAR_TO_AUSSIE;
        canada = dollar * DOLLAR_TO_CANADA;
        
    }
    
    public double getAmount(double amount, String type)
    {
        
        return amount;
    }
    
}
