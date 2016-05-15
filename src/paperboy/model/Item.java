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
public class Item implements Serializable{
   
    //class instance variables
    private int healthValue;
    private int probability;

    public Item() {
    }

    
    
    
    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.healthValue;
        hash = 97 * hash + this.probability;
        return hash;
    }

    @Override
    public String toString() {
        return "Item{" + "healthValue=" + healthValue + ", probability=" + probability + '}';
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
        final Item other = (Item) obj;
        if (this.healthValue != other.healthValue) {
            return false;
        }
        if (this.probability != other.probability) {
            return false;
        }
        return true;
    }

    
    
}
