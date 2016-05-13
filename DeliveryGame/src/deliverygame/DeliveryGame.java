package deliverygame;

import deliverygame.model.Player;
//import java.util.Scanner;

public class DeliveryGame{
   
    public void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        //Get the user name and set it to player
        //System.out.println("\n\nWhat is your name?");
        Player newPlayer;
        newPlayer = new Player();
        //newPlayer.setName( input.next() );
        //System.out.println("That's a lovely name, " + newPlayer.getName());
        
        newPlayer.setName("Fred Flinstone");
        newPlayer.setTime(7.00);
        
        String playerInfo = newPlayer.toString();
        System.out.println(playerInfo);
        
    }
}
