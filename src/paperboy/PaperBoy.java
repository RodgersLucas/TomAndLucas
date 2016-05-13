/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperboy;

import paperboy.model.Character;
/**
 *
 * @author Lucas
 */
public class PaperBoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Character characterOne = new Character();
   
       String[] playerActions = {"Punch", "Throw Newspaper", "Run away", "Do nothing", "Yell at it"};
       characterOne.setHealth(90);
       characterOne.setActions(playerActions);
       
       String playerInfo = characterOne.toString();
       System.out.println(playerInfo);
    }
}
