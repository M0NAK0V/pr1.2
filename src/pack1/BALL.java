package pack1;

import java.lang.*;
public class BALL {
    private String colour;
    private int diameter;

    public BALL(String c, int d) {
        colour = c;
        diameter = d;
    }

    public BALL(String c) {
        colour = c;
        diameter = 14;
    }

    public BALL() {
        colour = "Black";
        diameter = 16;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public int getDiameter() {
        return diameter;
    }

    public String toString() {
        return "Ball colour: " + colour + ", and diameter: " + diameter;
    }

}
