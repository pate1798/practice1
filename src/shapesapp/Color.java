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
public enum Color {
    RED("red",255,0,0),
    GREEN("green",0,255,0),
    BLUE("blue ",0,0,300);
     
    private final String colorName;
    private final int redComp;
    private final int blueComp;
    private final int greenComp;

    public String getColorName() {
        return colorName;
    }

    public int getRedComp() {
        return redComp;
    }

    public int getBlueComp() {
        return blueComp;
    }

    public int getGreenComp() {
        return greenComp;
    }
    
    private Color(String  colorName, int redComp,int greenComp,int blueComp)
    {
        this.colorName=colorName;
        this.redComp=redComp;
        this.greenComp=greenComp;
        this.blueComp=blueComp;
    }
}
