/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperboy.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author rjhall7
 */
public class Bicycle implements Serializable{
    private double speed;
    private String color;
    private String brand;
    private double tires;
    
    public Bicycle(){
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getTires() {
        return tires;
    }

    public void setTires(double tires) {
        this.tires = tires;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.speed) ^ (Double.doubleToLongBits(this.speed) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.color);
        hash = 71 * hash + Objects.hashCode(this.brand);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.tires) ^ (Double.doubleToLongBits(this.tires) >>> 32));
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
        final Bicycle other = (Bicycle) obj;
        if (Double.doubleToLongBits(this.speed) != Double.doubleToLongBits(other.speed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.tires) != Double.doubleToLongBits(other.tires)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "speed=" + speed + ", color=" + color + ", brand=" + brand + ", tires=" + tires + '}';
    }
    
    
    
}
