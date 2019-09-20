/*
* ComplexNumber.java
* Created on Jul 31, 2019 5:03:19 PM
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
package com.infomindz.training.oops.practice;

/**
 *
 * @author ratan
 */
public class ComplexNumber
{
    //for real and imaginary parts of complex numbers

    double real, img;

    //constructor to initialize the complex number
    ComplexNumber(double r, double i)
    {
        this.real = r;
        this.img = i;
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
    {
        //creating a temporary complex number to hold the sum of two numbers
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;

        //returning the output complex number
        return temp;
    }

    public static void main(String args[])
    {
        ComplexNumber c1 = new ComplexNumber(5.5, 4);
        ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
        ComplexNumber temp = sum(c1, c2);
        System.out.printf("Sum is: " + temp.real + " + " + temp.img + "i");
    }
}
