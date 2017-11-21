/*
*
* Car Instrument Simulator Menu
* The purpose of this method is to implement menu functionality into the project. 
*/
package javafinalproject1.pkg0;

/**
 *
 * @author david
 */

public class Menu 
{
    private int userSelection;
    private double totalCredits = 5000;
    
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
    }
    
    /*
    *
    * Primary game mode, where instruments will function, and additional game content will take place. 
    */
    public void race() 
    {
        System.out.println("Race has not been implemented yet!");
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
    */
    public void purchaseVehicle()
    {
        System.out.println("Purchase Vehicle not yet implemented!");
    }
      
}
