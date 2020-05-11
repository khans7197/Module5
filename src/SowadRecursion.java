/* Author: Sowad Khan
Date: May 11th, 2020
Module 5: Creating fractal spiral for which shape the user picks
Turtle for java was downloaded from http://sites.asmsa.org/java-turtle/down
 */

import javax.swing.*;

public class SowadRecursion {
    public static Turtle t; // Turtle variable

    public static void shapeSpiral(int iterations, int length, double angle) { // Method to draw spiral
        if (iterations > 0) { // Base case, stops running once iterations is 0
            t.forward(length); // Moves turtle forward
            t.right(angle); // Turns the turtle at the angle specified

            shapeSpiral(iterations - 1, length - 3, angle + 0.01); // Recursive call to change
            // spiral angle and its length
        }
    }
    public static void main(String[] args) { // Main method
        String userShape = JOptionPane.showInputDialog("Pick what shape you want to spiral (Shapes: Triangle, " +
                "Square, Pentagon, Star, Hexagon)"); // Asking user to pick a shape

        t = new Turtle(); // Creating new turtle
        t.hide(); // Hiding turtle from the screen

        switch (userShape.toLowerCase()) { // Switch statement to use what the user picked
            case "triangle": // User picked triangle
                shapeSpiral(300, 25, 120); // Call recusrive function
                break;
            case "square": // User picked Square
                shapeSpiral(300, 25, 90);
                break;
            case "pentagon": // User picked pentagon
                shapeSpiral(300, 25, 75);
                break;
            case "star": // User picked star
                shapeSpiral(300, 25, 150);
                break;
            case "hexagon": // User picked hexagon
                shapeSpiral(300, 25, 60);
                break;
            default: // Default case is triangle
                shapeSpiral(300, 25, 120);
        }

    }
}
