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
        System.out.println("***** HELLO!  Welcome to The Delivery Game!!! *****\n"
                + "There are " + DeliveryGame.getNumOfStreets() + " streets that you could go down!\n"
                + "Have fun!!!");
        
        //Loops through menu until a correct value is chosen
        do{System.out.println("\n\nWhat would you like to do?\n"
                + "1. Pick A City\n"
                + "2. See High Scores\n"
                + "3. Quit\n"
                + "(Enter 1, 2, or 3)");
        
            Scanner input = new Scanner(System.in);
            DeliveryGame.setChoice( input.next());} 
        while(!"1".equals(DeliveryGame.getChoice()) && !"2".equals(DeliveryGame.getChoice()) && !"3".equals(DeliveryGame.getChoice()));
        //End of menu loop
        
        System.out.println(DeliveryGame.getChoice());
        
    }
    
}
