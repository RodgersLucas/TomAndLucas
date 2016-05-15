/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperboy;

import paperboy.model.Character;
import paperboy.model.Item;
import paperboy.model.Obstacle;
import paperboy.model.Enemy;

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
       
       Item itemOne = new Item();
       itemOne.setHealthValue(5);
       itemOne.setProbability(40);
       String itemInfo = itemOne.toString();
       System.out.println(itemInfo);
              
       Obstacle obstacleOne = new Obstacle();
       obstacleOne.setTimer(30);
       obstacleOne.setVictoryCondition(true);
       String obstacleInfo = obstacleOne.toString();    
       System.out.println(obstacleInfo);
       
       Enemy enemyOne = new Enemy();
       enemyOne.setDamage(30);
       String enemyInfo = enemyOne.toString();
       System.out.println(enemyInfo);
      
       
    }
}
