/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu5;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author KingStupitd
 */
public class Tugas1 extends JPanel{

    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;

    public Tugas1() {
        // The Font is Arial size 18 and is italicized
        font = new Font("Arial", Font.ITALIC, 18);

        // Some colors are predefined in the Color class
        redColor = Color.RED;
        backgroundColor = Color.ORANGE;

        // Colors can be created using Red, Green, Blue values
        blueColor = new Color(0, 0, 122);

        // Set the background color of the panel
        setBackground(backgroundColor);
    }

    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph);

        // Set font
        graph.setFont(font);
        // Create a title
        graph.drawString("Draw Shapes", 90, 20);

        // Set the color for the first shape
        graph.setColor(blueColor);

        // Draw a rectangle
        graph.drawRect(120, 120, 120, 120);

        // Fill a rectangle
        graph.fillRect(115, 115, 90, 90);

        // Set the color for the next shape
        graph.setColor(redColor);

        // Draw a circle (arc with 360 degrees)
        graph.fillArc(110, 110, 50, 50, 0, 360);

        // Set color for next shape
        graph.setColor(Color.CYAN);

        // Draw another rectangle
        graph.drawRect(50, 50, 50, 50);

        // Fill a rectangle
        graph.fillRect(50, 50, 60, 60);
    }

    public static void main(String[] args) {   
        JFrame frame = new JFrame("Draw Shapes");
        Tugas1 panel = new Tugas1();
        
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    
}
