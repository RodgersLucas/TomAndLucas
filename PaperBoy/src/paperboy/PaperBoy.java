/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperboy;

import paperboy.model.Player;
import paperboy.model.Map;
import paperboy.model.Bicycle;
import paperboy.model.Location;

/**
 *
 * @author rjhall7
 */
public class PaperBoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create player object
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Create Map object
        Map mapOne = new Map();
        
        mapOne.setRowCount(4);
        mapOne.setColCount(10);
        mapOne.setCityName("Sydney");
        
        String mapInfo = mapOne.toString();
        System.out.print(mapInfo);
        
        //Create Bicycle Object
        Bicycle bike = new Bicycle();
        
        bike.setSpeed(7.5);
        bike.setBrand("Giant");
        bike.setColor("Black");
        bike.setTires(4.5);
        
        String bikeInfo = bike.toString();
        System.out.print(bikeInfo);
        
        //Create Location Object
        Location location = new Location();
        
        location.setxCoordinate(3);
        location.setyCoordinate(6);
        location.setDescription("Uptown");
        
        String locationInfo = location.toString();
        System.out.print(locationInfo);
        
        
        
    }
    
}
