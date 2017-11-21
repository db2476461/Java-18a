/*
*
* Car Instrument Simulator Menu
* The purpose of this method is to implement menu functionality into the project. 
*/
package javafinalproject1.pkg0;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author david
 */

public class Menu 
{
    private int userSelection;
    private double totalCredits = 15000;
    int mpg;
    int fuelMax;
    String vehicle;
    
    /*
    *
    *Display Game Title
    */
    public void displayTitle()
    {
    System.out.println("\t\tCar Instrument Simulator");
    }
    
    /**
     *
     * Call to display game menu
     */
    public void displayMenu()
    {
        System.out.println("1. New Game");
        System.out.println("2. Load Game");
        System.out.println("3. Exit");
    }
    
    /**
     * 
     * Menu for new game
     */
    public void newGameMenu()
    {
    System.out.println("1. Purchase Vehicle");
    System.out.println("2. Check Balance");
    System.out.println("3. Race");
    System.out.println("4. Main Menu");
    }

    /**
     * 
     * @return the userSelection
     */
    public int getUserSelection() 
    {
        return userSelection;
    }

    /**
     * 
     * @param userSelection the userSelection to set
     */
    public void setUserSelection(int userSelection) 
    {
        this.userSelection = userSelection;
    }
    
    /*
    *
    * Display the players total credits
    */
    public void getTotalCredits() 
    {
        System.out.println("Total Credits: $" +totalCredits);
        newGameMenu();
    }
    
    /*
    *
    * Primary game mode, where instruments will function, and additional game content will take place. 
    */
    public void race() 
    {
        System.out.println("Race has not been implemented yet!");
        newGameMenu();
    }
    
    /*
    *
    * Ideally, a player will be able to load a file by its name. This is where user input will be written to a file. It may have to be reduced to simply accepting a name for a high score for the sake of simplicity. 
    */
    public void load()
    {
        System.out.println("Load game has not been implemented yet!");
    }
    
    /*
    *
    * Exit program, nuff said.
    */
    public void exit()
    {
        System.out.println("Closing game...");
    }
    
    /*
    *
    * This method will import a list of vehicles from a file. They will be read from a file. 
    * A user makes a selection from the list and proceeds to the race method.
    * This method will also need to keep a running total after vehicle purchases.
    * Also print out the vehicle stats so we know a choice has been made
    */
    public void purchaseVehicle() throws FileNotFoundException
    {
        /*
        *
        *Part 1 File operations
        */

        //create a new file object to contain a file named garage
        File file = new File("garage");
        Scanner inputFile = new Scanner(file);
        Scanner keyboard = new Scanner(System.in);
        //read the lines from the file until none are left
        while (inputFile.hasNext())
        {
        //Read the next name
        String vehicleName = inputFile.nextLine();
        
        //Display the last name read
        System.out.println(vehicleName);
        }
        
        //close the file
        inputFile.close();
        
        /*
        *
        *Part 2 vehicle selection, set vehicle properties for use in the odometer and fuel gauge classes, and print vehicle specs. 
        */
        
        System.out.println("Select a vehicle: ");
        int menuChoice = keyboard.nextInt();
        if(menuChoice ==1)
        {
            vehicle="Porche ";
            mpg=18;
            fuelMax=20;
            totalCredits -=25000;
        }
        else if(menuChoice ==2)
        {
            vehicle="Civic ";
            mpg=32;
            fuelMax=9;
            totalCredits -=4000;
        }
        else if(menuChoice ==3)
        {
            vehicle="Prelude";
            mpg=29;
            fuelMax=12;
            totalCredits -=12500;
        }
        else  if(menuChoice ==4)
        {
            vehicle="Eclipse";
            mpg=26;
            fuelMax=10;
            totalCredits -=9000;
        }
        else if(menuChoice ==5)
        {
            vehicle="WRX";
            mpg=21;
            fuelMax=15;
            totalCredits -=17000;
        }
        
        System.out.println("Vehicle: " +vehicle);
        System.out.println("Miles per gallon: " +mpg);
        System.out.println("Fuel Capacity: " +fuelMax +" gallons");
        System.out.println("Credits Remaining: $" +totalCredits);
        
        newGameMenu();
        
    }
      
}
