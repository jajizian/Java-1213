
/**
 * Write a description of class Customer here.
 *
 * @author jack ajizian
 * @version 8/6/2018
 */
public class Customer extends Person
{
    //fields
    private int customerID;
    private boolean mailList;
    
    //default constructor
    // public Customer()
    // {
        // customerID = 0;
        // mailList = false;
    // }
    
    public Customer(String name, String address, String phone, int ID, boolean mail)
    {
        super (name, address, phone);
        customerID = ID;
        mailList = mail;
    }
    
    public void setCustomerID(int custID)
    {
        customerID = custID;
    }
    
    public void setMailList(boolean custMail)
    {
        mailList = custMail;
    }
    
    public int getID()
    {
        return customerID;
    }
    
    public boolean getMailList()
    {
        return mailList;
    }
    
    public String toString()
    {
        return "\nCustomer name: " + 
        super.getName() + "\nCustomer address: " + super.getAddress()
        + "\nCustomer phone number: " + super.getPhone()
        + "\nCustomer ID: " + customerID 
        + "\nCustomer mail list: " + mailList;
    }
}
