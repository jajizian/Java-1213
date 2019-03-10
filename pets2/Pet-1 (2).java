
/**
 * This is the Pet class.
 * This class has a fields section for pet information
 * This class has 2 constructors: a default and one that uses 3 params from the fields
 * This class has a toString method, an equals method, a compareTo method, and a setAll method
 *
 * @author Jack Ajizian
 * @version 8/3/2018
 */

import java.io.*;
import java.util.*;

//class creation
public class Pet
{
    //fields
    private String petType;
    private String petName;
    //capital Double as to not get dereferenced in compareTo method
    private Double adoptCost;

    /**
     * Default Pet Constructor, no params
     * Sets fields to " " for strings and 0.0 for double
     */
    public Pet()
    {
        //set fields to placeholder values
        petType = " ";
        petName = " ";
        adoptCost = 0.0;
    }

    /**
     * Second Constructor w/ 3 params
     * @param String type (type of pet)
     * @param String name (name of pet)
     * @param double cost (cost of pet)
     */
    public Pet(String type, String name, double cost)
    {
        //sets fields to parameters
        petType = type;
        petName = name;
        adoptCost = cost;   
    }
    
    /**
     * toString method: returns String of all fields
     * @return String
     */
    public String toString()
    {
        return "Type of pet: " + petType 
               +"\nPet Name: " + petName
               +"\nAdoption cost: $" + adoptCost + "\n";
    }
    
    /**
     * equals method: Checks if pet type and pet name are the same
     * @return boolean
     * @param other for Pet class object
     */
    public boolean equals(Pet other)
    {
        return this.petType == other.petType && this.petName == other.petName;
    }
    
    /**
     * compareTo method: checks if adoption cost of pets
     * @return double
     * @param other for Pet class object
     */
    public double compareTo(Pet other)
    {
        return (this.adoptCost).compareTo(other.adoptCost);
    }
    
    /**
     * setAll method: utilized in Driver to set type,name, and cost from text file to tokens
     * @return void
     * @param String type of pet
     * @param String name of pet
     * @param double cost of pet
     */
    public void setAll(String type, String name, double cost)
    {
        this.petType = type;
        this.petName = name;
        this.adoptCost = cost;
    }

}
