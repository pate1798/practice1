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
public abstract class Shape {

    private Color color;
    private String texture;
    
    public Shape(){
        color =Color.RED;
        texture="smooth";
               
    }

    public Shape(Color color, String texture) {
        this.texture = texture;
       this.color=color;
    }
    public abstract double calcArea();{
        
    }

    public Color     getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }

    public static short some() {
        return 1;
    }
   
    public String toString(int i) {
        return getColor() + " - " + getTexture();
    }

}
