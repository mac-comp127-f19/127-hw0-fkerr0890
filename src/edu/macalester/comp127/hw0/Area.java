package edu.macalester.comp127.hw0;

/**
 * @author Shilad Sen
 */
public class Area {

    public static void main(String[] args) {
        System.out.println(getSquareArea(2));
        System.out.println(getCircleArea(2));
    }

    /**
     * Calculates the area of a square.
     * @param sideLength The length of the side of a square
     * @return The area
     */

    public static double getSquareArea(double sideLength) {
        return Math.pow(sideLength, 2);
    }

    /**
     * Calculates the area of a circle.
     * @param radius The radius of the circle
     * @return The area
     */
    public static double getCircleArea(double radius) {
        return Math.PI*Math.pow(radius, 2);
    }

}
