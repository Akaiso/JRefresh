// MyLine class represents a line.

import java.awt.Color;
import java.awt.Graphics;



public class GUIMyLine {
    private int x1; // x-coordinate of first endpoint
    private int y1; // y-coordinates of first endpoint
    private int x2; // x-coordinate of second endpoint
    private int y2; // y-coordinate of second endpoint
    private Color color; // color of the line

    // constructor with input values
    public GUIMyLine(int x1, int y1, int x2, int y2, Color color){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    // Draw the line in the specified color
    public void draw(Graphics g){
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }
}
