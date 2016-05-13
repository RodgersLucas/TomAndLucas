/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverygame.model;

/**
 *
 * @author rjhall7
 */
public class Player {
    private static String name;
    private static double bestTime;
    
    public static void setName( String newName ){
        name = newName;
    }
    
    public static String getName(){
        return name;
    }
    
    public static void setTime ( double newBestTime ){
        bestTime = newBestTime;
    }
    
    public static double getTime () {
        return bestTime;
    }
}
