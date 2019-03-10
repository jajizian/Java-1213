//Jack Ajizian
//ITSC1213 lab 3
//7/11/2018

public class Paycheck
{
    //fields
    private String EmployeeName;
    private double HourlyPay;
    private int HoursWorked;
    private double GrossPay;
    int difference;
    
    //constructor one, no args
    public Paycheck()
    {
        EmployeeName = "unknown";
        HourlyPay=0;
        HoursWorked=0;
        GrossPay=0;
        
    }
   
    //constructor two, with args
    public Paycheck(String name, double pay, int hours)
    {
        EmployeeName = name;
        HourlyPay=pay;
        HoursWorked=hours;
        
        if (HoursWorked > 40)
        {
            //this might need evaluation
            difference = HoursWorked - 40;
            
            GrossPay = (40*HourlyPay) + (difference*(HourlyPay*1.5));
        }
        else 
        {
            GrossPay = HourlyPay * HoursWorked;
        }
        
    }
     
    //set employee name
    public void setEmployeeName(String name)
    {
        name = EmployeeName;
    }
    //set method for number of hours worked
    public void setHoursWorked(double hours)
    {
        hours = HoursWorked;
    }
    
    //set method for hourly pay
    public void setHourlyPay(double pay)
    {
        pay = HourlyPay;
    }
    
    //get method for name
    public String getEmployeeName()
    {
        return EmployeeName;
    }
    
    //get method for hourly pay
    public double getHourlyPay()
    {
        return HourlyPay;
    }
    
    //get method for hours worked
    public int getHoursWorked()
    {
        return HoursWorked;
    }
    
    //get method for gross pay
    public double getGrossPay()
    {
        return GrossPay;
    }
    
    //to string method to run driver multiple times
    public String toString()
    {
        return "Employee: " + EmployeeName +
     "\nHours Worked: " + HoursWorked + 
     "\nRate of Pay: " + HourlyPay +
     "\nGross Pay: $" + GrossPay;
    }
}
