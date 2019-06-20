/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesapp;

import java.util.ArrayList;

/**
 *
 * @author belalwa
 */
public class ShapesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape[] s = {new Circle(Color.GREEN, "grainy", 10.1),
            new Rectangle(Color.RED, "grainy", 10.1, 12.0),
            new Square(Color.BLUE, "grainy", 10.1)};

        for (Shape sh : s) {
        //    if (sh instanceof Rotatable) {
             //   System.out.println(((Rotatable) sh).calcArea());
            }
            /*      else if(sh instanceof Rectangle){
                ((Rectangle)sh).rotate(16.5);
            }*/
            Circle c1 = new Circle(Color.BLUE,"metal",6);
            Circle c2 = new Circle(Color.RED,"solid",9);
          
            int blueComp= c1.getColor().getBlueComp();
            String cn = c1.getColor().getColorName();
            String tex =c1.getTexture();
            double r =c1.getRadius();
            int rc= c1.getColor().getRedComp();
            
            String c2cn= c2.getColor().getColorName();
            String c2tex=c2.getTexture();
            int c2bc=c2.getColor().getBlueComp();
            int c2rc=c2.getColor().getRedComp();
            double c2r =c2.getRadius();
          
            boolean ans = s.equals(c1);
            System.out.println(cn);
            System.out.println(tex);
            System.out.println(r);
            System.out.println(blueComp);
            
        System.out.println("   ");
            System.out.println(c2cn);
            System.out.println(c2tex);
            System.out.println(c2r);
            System.out.println(c2rc);
            
            
            
            System.out.println("   ");
            
         
            System.out.println(Shape.some());
            System.out.println(Circle.some());
            System.out.println(Square.some());
            System.out.println(ans);

        }
    }

