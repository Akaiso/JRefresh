// Program that uses class MyLine to draw random lines.

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;



public class GUIDrawPanel extends JPanel {
    private SecureRandom randomNumbers = new SecureRandom();
    private GUIMyLine[] lines; // array of lines

    //constructor, creates a panel with random shapes
    public GUIDrawPanel(){
        setBackground(Color.WHITE);
        
        lines = new GUIMyLine[5 + randomNumbers.nextInt(5)];

        // create lines
        for(int count = 0; count < lines.length; count++){
            //generate random coordinates
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            //generate a random color
            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            // add the line to the list of lines to be displayed
            lines[count] = new GUIMyLine(x1, y1, x2, y2, color);


        }
    }

    // for each shape array, draw the individualshapes
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // draw the lines
        for(GUIMyLine line : lines)
        line.draw(g);
    }
}
