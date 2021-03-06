/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverygame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author rjhall7
 */
public class Player implements Serializable{
    private String name;
    private double bestTime;

    public Player() {
    }
    
    public void setName( String name ){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setTime ( double bestTime ){
        this.bestTime = bestTime;
    }
    
    public double getTime () {
        return bestTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + '}';
    }
    
    
}
