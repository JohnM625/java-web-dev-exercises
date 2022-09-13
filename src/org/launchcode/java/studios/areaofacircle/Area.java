package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    System.out.print("Enter a radius: ");
    double radius = input.nextDouble();
    while (radius < 0) {
        System.out.println("Radius must be non-negative.");
        System.out.print("Enter a radius: ");
        radius = input.nextDouble();
    }
    System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
    }
}
