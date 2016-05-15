/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperboy.model;

import java.io.Serializable;
import java.util.Arrays;
/**
 *
 * @author Lucas
 */
public class Character implements Serializable{
    
    // class instance variables
    private int health;
    private String[] actions;

    public Character() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String[] getActions() {
        return actions;
    }

    public void setActions(String[] actions) {
        this.actions = actions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.health;
        hash = 89 * hash + Arrays.deepHashCode(this.actions);
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
        final Character other = (Character) obj;
        if (this.health != other.health) {
            return false;
        }
        if (!Arrays.deepEquals(this.actions, other.actions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "health=" + health + ", actions=" + actions + '}';
    }
    
    
}


