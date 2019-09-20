/*
* AreaCalculation.java
* Created on Jul 16, 2019 2:57:56 PM
*
* Copyright © 2012 InfoMindz R&D, SDN BHD.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of
* InfoMindz R&D, SDN BHD.("Confidential Information"). You shall
* not disclose such Confidential Information and shall use it only
* in accordance with the terms of the license agreement you entered
* into with InfoMindz.
 */
package com.infomindz.training.oops.areacalculate;

import java.util.Scanner;

/**
 *
 * This AreaCalculation class is used to choose an option among four types of
 * Area Calculation get user input and according to that input will calculate
 * area of chosen option
 *
 * @author ratan
 */
public class AreaCalculation
{

    /**
     * Asking for the user chosen input for area
     *
     * @param args
     */
    public static void main(String[] args)
    /**
     * this is the main class
     */
    {
        int userChoice = 0;

        do
        {
            try
            {
                Scanner scanner = new Scanner(System.in);
                //creating object scanner to get input from user
                System.out.println("Please enter -");
                System.out.println("1 to Calculate Area of Circle");
                System.out.println("2 to Calculate Area of Rectangle");
                System.out.println("3 to Calculate Area of Triangle");
                System.out.println("4 to Calculate Area of Square");
                System.out.println("5 to Exit \n");

                userChoice = scanner.nextInt();

                switch (userChoice)
                {
                    case 1:
                        AreaOfCircle areaOfCircle = new AreaOfCircle();
                        System.out.println("Enter Radius of Circle:");
                        areaOfCircle.setRadius(scanner.nextInt());
                        System.out.println("Area of Circle :" + areaOfCircle.getCalculateArea() + "\n"); // Display area of circle
                        break;

                    case 2:
                        AreaOfRectangle areaOfRectangular = new AreaOfRectangle(); // create object of area
                        System.out.print("Enter Leanth of Rectangle:");
                        areaOfRectangular.length = scanner.nextInt(); //get input from user
                        System.out.print("Enter Width of Rectangle :");
                        areaOfRectangular.width = scanner.nextInt();//get input from user
                        System.out.println("Area of Rectangle        :" + areaOfRectangular.getCalculateArea() + "\n"); // Displaying area of Rectangle
                        break;
                    case 3:
                        AreaOfTriangle areaOfTriangle = new AreaOfTriangle(); //Object creating 
                        System.out.print("Enter Triangle Height:");
                        areaOfTriangle.height = scanner.nextInt(); // taking value for height from user
                        System.out.print("Enter Triangle Base  :"); // taking value for height from user
                        areaOfTriangle.base = scanner.nextInt();
                        System.out.println("Area of Triangle     :" + areaOfTriangle.getCalculateArea() + "\n"); // Display the result of area of Triangle
                        break;
                    case 4:
                        System.out.print("Enter a Side of Square : ");
                        AreaOfSquare areaOfSquare = new AreaOfSquare();
                        areaOfSquare.side = scanner.nextInt(); //get input from user
                        System.out.println("Area of Square         : " + areaOfSquare.getCalculateArea() + "\n"); // Display the result of area of Triangle
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input! \n");
                        break;
                }
            }
            catch (Exception e)
            {
                System.out.println("exception" + e);
            }

        }
        while (userChoice != 5);

    }
}
