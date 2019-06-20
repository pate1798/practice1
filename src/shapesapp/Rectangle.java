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
public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(Color color, String texture, double length, double width) {
        super(color, texture);
        this.length = length;
        this.width = width;
    }
    public double calcArea(){
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getRatio() {
        return getLength() + "/" + getWidth();
    }

    public void rotate(double angle) {

    }

    public String toString() {
        return super.toString() + " - " + getRatio();

    }

}
