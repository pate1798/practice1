/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesapp;

/**
 *
 * @author belalwa
 */
public class Circle extends Shape {

    private double radius;

    public Circle(Color color, String texture, double radius) {
        super(color, texture);
        this.radius = radius;

    }

    public double calcArea(){
        return Math.PI*radius*radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public static short some() {
        return 2;
    }

    public String toString() {
        return super.toString() + " - " + getRadius();
    }
}
