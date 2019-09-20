/*
* Rectangle.java
* Created on Jul 15, 2019 4:10:28 PM
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
package com.infomindz.training.oops;

import java.util.Scanner;

/**
 *
 * @author ratan
 */
public class Rectangle
{

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        int height, width, areaOfRectangle;
        System.out.print("Please Enter The height: ");
        height = scan.nextInt();
        System.out.print("Please Enter The Width : ");
        width = scan.nextInt();

        areaOfRectangle = height * width;

        System.out.println("Area of Rectangle: " + areaOfRectangle + " m^2");

    }

}
