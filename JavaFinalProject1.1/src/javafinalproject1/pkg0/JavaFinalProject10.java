/*
Course: CIS-18A-Java
Professor: John W O'Connor
Group Name: The Phishermen
Members: Malay Patel
         Brandon Ramirez
         David Branson
         Jesse Garcia
         Jiman Chung
Final Project Description:

It's time to put those programming skills to work! With a group of 3-5 of your classmates, you'll create a Java application of sufficient complexity.  
You can choose what kind of program you'd like to build - if you're lost or don't have ideas, check out the programming challenges in the back of each chapter of your book.
You'll need to have a minimum of the following:
1. At least 3 classes / objects NOT including your "main" class.
2. You'll need to read data from a file
3. You'll need to write data to a file
4. You'll need to accept input from the user. 
5. Must also have a coding and styling guidelines. Entire group must follow the guidelines set by the group
6. Each file must have a header to describe it.
7. The program have to run (33% of grade). 
8. Group evaluation worth 10% of grade. 

Program Description:
Car Instrument Simulator (From Gaddis Starting /w Java 6th Edition. Chapter 8, #10)
  
Simulate a car’s fuel gauge and odometer. 
The classes you will design are the following:

The FuelGauge Class: This class will simulate a fuel gauge. 
Its responsibilities are as follows:
To know the car’s current amount of fuel, in gallons.
To report the car’s current amount of fuel, in gallons.
To be able to increment the amount of fuel by 1 gallon. This simulates putting fuel
in the car. (The car can hold a maximum of 15 gallons.)
To be able to decrement the amount of fuel by 1 gallon, if the amount of fuel is
greater than 0 gallons. This simulates burning fuel as the car runs.
  
The Odometer Class: This class will simulate the car’s odometer. 
Its responsibilities are as follows:
To know the car’s current mileage.
To report the car’s current mileage.
To be able to increment the current mileage by 1 mile. The maximum mileage the
odometer can store is 999,999 miles. When this amount is exceeded, the odometer
resets the current mileage to 0.
To be able to work with a FuelGauge object. It should decrease the FuelGauge
object’s current amount of fuel by 1 gallon for every 24 miles traveled. (The car’s
fuel economy is 24 miles per gallon.)
*/

package javafinalproject1.pkg0;

import java.util.Scanner;

public class JavaFinalProject10 
{


public static void main(String[] args) 
{
//global variables 
int menuChoice;
Boolean exit = false;

while(exit!=true)
{
    //create new Menu object named menu
    Menu menu = new Menu();
     //display game title
    menu.displayTitle();
    //display game menu
    menu.displayMenu();
    //create new scanner object named keyboard to accept user input
    Scanner keyboard = new Scanner(System.in);
    //capture user menu choice
    menuChoice = keyboard.nextInt();
    //store the menu selection for our decision structure
    menu.setUserSelection(menuChoice);

    if(menuChoice == 1)
    {
        menu.newGameMenu();

        //nested loop containing new game menu
        menuChoice = keyboard.nextInt();
        if(menuChoice == 1)
        {
            menu.purchaseVehicle();
        }
        else if(menuChoice== 2)
        {
            menu.getTotalCredits();
        }
        else if(menuChoice== 3)
        {
            menu.race();
        }
        else if(menuChoice== 4)
        {
            menu.displayMenu();
        }

    }
    else if(menuChoice == 2)
    {
        menu.load();
    }
    else if(menuChoice == 3)
    {
        menu.exit();
        exit = true;
    }

}


}
    
}
