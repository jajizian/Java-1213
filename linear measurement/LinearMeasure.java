
/**
 * This class has methods to allow a user to perform calculations
 * with linear measurements.
 * 
 * Its purpose is to illustrate object references as both
 * parameters and return values in methods.
 * 
 * @author Jack Ajizian 
 * @version 7/25/2018
 */
public class LinearMeasure
{
   private int numerator;
   private int denominator;
   
   //default constructor
    public LinearMeasure()
    {
   
       numerator=0;
       denominator=1;
    
      } 
    
    //constructor w/ params
    public LinearMeasure (int num, int denom)
    {
        numerator = num;
        denominator = denom;
        
        if (denom ==0)
        {
            denominator = 1;
        }
    }
    
   //multiply method
    public LinearMeasure multiply(LinearMeasure fraction)
    {
       LinearMeasure multiplyF = new LinearMeasure(numerator * fraction.getNumerator(), 
                                denominator * fraction.getDenominator());
                                
       multiplyF.simplify();
       return multiplyF;
       
     }
     
   //divide method
     public LinearMeasure divide(LinearMeasure division)
    {
        LinearMeasure divideF = new LinearMeasure(numerator * division.getDenominator(), 
                                denominator * division.getNumerator());
                                
       divideF.simplify();
       return divideF;
      
    }
    
    //add method
     public LinearMeasure add(LinearMeasure addF)
    {
      int newNum;
      int newDenom;
     
      if(denominator == addF.getDenominator())
      {
          newNum = numerator + addF.getNumerator();
          newDenom = denominator;
        }
        
        else 
        {
            newNum = (numerator * addF.getDenominator()) + 
                    (addF.getNumerator() * denominator);
            
            newDenom = denominator * addF.getDenominator();
        }
        
        LinearMeasure fraction = new LinearMeasure(newNum, newDenom);
        fraction.simplify();
        return fraction;
        
     }
     
     //subtract method
     public LinearMeasure subtract(LinearMeasure subF)
    {
      int newNum;
      int newDenom;
      
      if(denominator == subF.getDenominator())
      {
          newNum = numerator - subF.getNumerator();
          newDenom = denominator;
        }
        
        else 
        {
            newNum = (numerator * subF.getDenominator() -
                      subF.getNumerator() * denominator);
            
            newDenom = denominator * subF.getDenominator();
        }
        
        LinearMeasure fraction = new LinearMeasure(newNum, newDenom);
        fraction.simplify();
        return fraction;
     }
     
    
   //equals to
    public boolean equals(LinearMeasure other)
    {
       
       return (this.numerator / (double)(this.denominator)) == (other.numerator / (double)(other.denominator));
          
    }
    
    //compareTo
    public int compareTo(LinearMeasure other)
    {
        if(denominator == other.getDenominator())
        {
            if(other.getNumerator() > numerator)
                return 1;
            
        
            else if (other.getNumerator() == numerator)
                return 0;
        
            else
                return -1;
            }
        else
        {
            int cd = denominator * other.getDenominator();
            int newnum1 = numerator * other.getDenominator();
            int newnum2 = other.getNumerator() * denominator;
            
            if(newnum2 > newnum1)
            {
                return 1;
            }
            else if(newnum2 == newnum1)
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
      
    }
    
    //get num
    public int getNumerator()
    {
        return numerator;
    }
    
    //get denom
    public int getDenominator()
    {
        return denominator;
    }
    
    //tostring
    
    //gcd method
    public static int gcd(int a, int b)
    {
        
        if (b == 0)
        {
            return b=a;
        }
        else
        {
            return gcd(b, a%b);
        }
        
    }
    
    //simplify
    private void simplify( )
    {
        
       // int gcf = gcd(numerator, denominator);
       // numerator = (numerator/gcf);
       // denominator = (denominator/gcf);
       
      
      int n = Math.abs(numerator), d = Math.abs(denominator);
      int min = n;
      
      if(n>d)
      {
          min = d;
        }
        
        for (int i = min; i > 1; i--)
        {
            if (n % i == 0 && d % i == 0)
            {
                numerator /= i;
                denominator /= i;
                i=0;
            }
        }
    }
      
    //toString
    public String toString()
    {
        return numerator + "/" + denominator;
    }
 }



