package com.example.crapsgame.models;

/**
 * Challenges model class has the challenges of the game
 *
 * @author Alejandro Medina
 *
 * @version 0.1.0
 */
public class ChallengeFPOE {

    /**
     * this is the student full name
     * @serialField
     */
    private String studentName;

    /**
     * Calculates the area of a rectangle
     * @param width: To represent the base of a rectangle.
     * @param height: To represent the height of a rectangle
     * @return The result of the operation
     */
    public double calculateRectangleArea(double width, double height){
        return width*height;
    }

    /**
     * To calculate triangle area
     * @param width: To represent the base of a triangle
     * @param height: To represent the height of a triangle
     * @return The triangle area
     * @throws ArithmeticException Division by 0
     */
    public double calculateTriangleArea(double width, double height) throws ArithmeticException{
        int divisor=2;
        return (width*height)/divisor;
    }

    /**
     * To print to console rectangle area
     * @param height: To represent the base
     * @param width: To represent the height
     * @see #calculateRectangleArea(double, double)
     * @since v 0.2.0
     */
    public void showRectangleArea(double width, double height){
        System.out.println("The rectangle area is " + calculateRectangleArea(width, height));
    }

}
