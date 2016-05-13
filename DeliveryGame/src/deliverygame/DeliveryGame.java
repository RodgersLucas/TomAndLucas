/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverygame;

/**
 *
 * @author Tom Hall and Lucas Rodgers
 */

import deliverygame.model.Player;
import java.util.Scanner;

public class DeliveryGame {
    
    
    
    // Creates timer variable (used later in the streets) and
    // numOfStreets which shows all of the options a user could
    // pick.  Both are constants (but don't have to be?)
    static private double timer = 10000;
    static private int numOfStreets = 12;
    private  static String choice;
    
    //Method returns number of streets available
    static public int getNumOfStreets(){
        return numOfStreets;
    }
    
    static public void setChoice( String userChoice ){
        DeliveryGame.choice = userChoice;
    }
    
    static public String getChoice (){
        return choice;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("***** HELLO!  Welcome to The Delivery Game!!! *****\n"
                + "There are " + DeliveryGame.getNumOfStreets() + " streets that you could go down!\n"
                + "Have fun!!!");
        
        //Get the user name and set it to player
        System.out.println("\n\nWhat is your name?");
        Player newPlayer = new Player();
        newPlayer.setName( input.next() );
        System.out.println("That's a lovely name, " + newPlayer.getName());
        
        //Loops through menu until a correct value is chosen
        do{System.out.println("\n\nWhat would you like to do?\n"
                + "1. Pick A City\n"
                + "2. See High Scores\n"
                + "3. Quit\n"
                + "(Enter 1, 2, or 3)");
        
            
            DeliveryGame.setChoice( input.next());} 
        while(!"1".equals(DeliveryGame.getChoice()) && !"2".equals(DeliveryGame.getChoice()) && !"3".equals(DeliveryGame.getChoice()));
        //End of menu loop
        
        // Show user's choice
        //TODO make the program do stuff based on input
        System.out.println("Your choice was " + DeliveryGame.getChoice());
        
        
        
    }
    
}
