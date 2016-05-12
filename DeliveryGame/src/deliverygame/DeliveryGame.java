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
public class DeliveryGame {

    static private double timer = 10000;
    static private int numOfStreets = 12;
    
    static public int getNumOfStreets(){
        return numOfStreets;
    }
    
    public static void main(String[] args) {
        System.out.println("***** HELLO!  Welcome to The Delivery Game!!! *****\n"
                + "There are " + DeliveryGame.getNumOfStreets() + " streets that you could go down!\n"
                + "Have fun!!!");
        
        System.out.println("\n\nWhat would you like to do?\n"
                + "1. Pick A City\n"
                + "2. See High Scores\n"
                + "3. Quit");
    }
    
}
