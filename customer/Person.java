
/**
 * Write a description of class Person here.
 *
 * @author jack ajizian
 * @version 8/6/2018
 */
public class Person
{
    //fields
    private String pName;
    private String pAddress;
    private String pPhoneNum;
    
    
    public Person()
    {
        pName = " ";
        pAddress = " ";
        pPhoneNum = " ";
    }
    
    public Person(String name, String address, String phone)
    {
        pName = name;
        pAddress = address;
        pPhoneNum = phone;
    }
    
    //mutator method name
    public void setName(String personName)
    {
        pName = personName;
    }
    
    //mutator method address
    public void setAddress(String personAddress)
    {
        pAddress = personAddress;
    }
    
    //mutator method phone
    public void setPhone(String personPhone)
    {
        pPhoneNum = personPhone;
    }
    
    //accessor name
    public String getName()
    {
        return pName;
    }
    
    //accessor address
    public String getAddress()
    {
        return pAddress;
    }
    
    //accessor phone
    public String getPhone()
    {
        return pPhoneNum;
    }
    
    public String toString()
    {
        return "\nPerson's name: " + pName
             + "\nPerson's address: " + pAddress
             + "\nPerson's phone number: " + pPhoneNum;
        
    }
}
