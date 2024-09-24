package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class QuadrantsCoordinateLies  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x-coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter the y-coordinate: ");
        int y = scanner.nextInt();

        // Determine the quadrant
        if (x > 0 && y > 0) {
            System.out.println("The coordinate (" + x + ", " + y + ") lies in Quadrant I.");
        } else if (x < 0 && y > 0) {
            System.out.println("The coordinate (" + x + ", " + y + ") lies in Quadrant II.");
        } else if (x < 0 && y < 0) {
            System.out.println("The coordinate (" + x + ", " + y + ") lies in Quadrant III.");
        } else if (x > 0 && y < 0) {
            System.out.println("The coordinate (" + x + ", " + y + ") lies in Quadrant IV.");
        } else if (x == 0 && y != 0) {
            System.out.println("The coordinate (" + x + ", " + y + ") lies on the y-axis.");
        } else if (y == 0 && x != 0) {
            System.out.println("The coordinate (" + x + ", " + y + ") lies on the x-axis.");
        } else {
            System.out.println("The coordinate (" + x + ", " + y + ") lies at the origin.");
        }

    }
}
