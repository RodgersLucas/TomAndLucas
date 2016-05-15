/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperboy.model;

import java.io.Serializable;
/**
 *
 * @author Lucas
 */
public class Obstacle implements Serializable{
    
    private double timer;
    private boolean victoryCondition;

    public Obstacle() {
    }

    public double getTimer() {
        return timer;
    }

    public void setTimer(double timer) {
        this.timer = timer;
    }

    public boolean isVictoryCondition() {
        return victoryCondition;
    }

    public void setVictoryCondition(boolean victoryCondition) {
        this.victoryCondition = victoryCondition;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.timer) ^ (Double.doubleToLongBits(this.timer) >>> 32));
        hash = 59 * hash + (this.victoryCondition ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Obstacle{" + "timer=" + timer + ", victoryCondition=" + victoryCondition + '}';
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
        final Obstacle other = (Obstacle) obj;
        if (Double.doubleToLongBits(this.timer) != Double.doubleToLongBits(other.timer)) {
            return false;
        }
        if (this.victoryCondition != other.victoryCondition) {
            return false;
        }
        return true;
    }
    
    
}
