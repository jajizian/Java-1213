
/**
 * Write a description of class PreferredCustomer here.
 *
 * @author jack ajizian
 * @version 8/6/2018
 */
public class PreferredCustomer extends Customer
{
    //fields
    private double custPurchases;
    private double custDiscount;
    
    //args constructor
    public PreferredCustomer(String name, String address, String phone, 
    int ID, boolean mail,
    double purchases)
    {
        super(name, address, phone, ID, mail);
        custPurchases = purchases;
        
        if(purchases >= 500)
        {
            custDiscount = .05;
            
        }
        
        if(purchases >= 1000)
        {
            custDiscount = .06;
            
        }
        
        if(purchases >= 1500)
        {
            custDiscount = .07;
            
        }
        
        if(purchases >= 2000)
        {
            custDiscount = .10;
            
        }
        
        
    }
    
    public void setPurchases(double pPurchases)
    {
        custPurchases = pPurchases;
    }
    
    
    public double getPurchases()
    {
        return custPurchases;
    }
    
    public double getDiscount()
    {
        return custDiscount;
    }
    
    public String toString()
    {
        return "\nCustomer name: " + 
        super.getName() + "\nCustomer address: " + super.getAddress()
        + "\nCustomer phone number: " + super.getPhone()
        + "\nCustomer ID: " + super.getID()
        + "\nCustomer mail list: " + super.getMailList()
        + "\nCustomer purchases: " + custPurchases
        + "\nCustomer discount: " + custDiscount;
    }
}
