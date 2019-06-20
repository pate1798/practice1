/*
 *  Jeel Patel
 * Student ID: 991548626
 *  PROG24178 OOP-2 Java 
 */
package shapesapp;

/**
 *
 * @author jeel
 */
public class Square extends Rotatable {

    private double line;

    public Square(Color color, String texture, double line) {
        super(color, texture);
        this.line = line;
    }

    public double calcArea(){
        return line*line;
        
    }
    
    public double getLine() {
        return line;
    }

    public static short some() {
        return 3;
    }

    public void rotate(double angle) {

    }

    public String toString() {
        return super.toString() + "-" + getLine();

    }

   
    

}
