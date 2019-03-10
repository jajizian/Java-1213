
/**
 * Create a class to hold and manipulate data for a pet adoption service
 *
 * @author Jack Ajizian
 * @version 7/20/2018
 */

import java.util.*;
import java.io.*;

public class Pet
{
    //fields
    private String petType;
    private String petName;
    private Double adoptCost;
    private String adoptCost1;
    private String adoptCost2;

    //default constructor
    public Pet()
    {
        petType="";
        petName="";
        adoptCost = 0.0;
    }

    //constructor w/ params
    public Pet(String type, String name, double cost)
    {
        this.petType = type;
        this.petName = name;
        this.adoptCost = cost;

    }

    //toString
    public String toString()
    {
        return "Type of pet: " + petType +
        "\nPet name: " + petName +
        "\nCost of pet is: $" + adoptCost;
    }

    //equals()
    public boolean equals(Pet other)
    {
        return this.petType == other.petType && this.petName == other.petName;
    }

    //compareTo
    public double compareTo(Pet other)
    {
        return (this.adoptCost).compareTo(other.adoptCost);
    }
    
    //set method
    public void setAll(String type, String name, double cost)
    {
        this.petType = type;
        this.petName = name;
        this.adoptCost = cost;

    }


  
}
