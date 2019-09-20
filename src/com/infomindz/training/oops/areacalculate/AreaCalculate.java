/*
* AreaCalculate.java
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

/**
 *
 * @author ratan
 */
class Area
{

    int getAreaCalculate()
    {
        return 0;
    }
}

public class AreaCalculate
{

    public static void main(String[] args)
    {
        Area areaOfSquare = new Areasquare();
        System.out.println("Area of Square      : " + areaOfSquare.getAreaCalculate());
        Area areaOfRectangle = new AreaRectangle();
        System.out.println("Area of Rectangular : " + areaOfRectangle.getAreaCalculate());
        Area areaOfTriangle = new AreaTriangle();
        System.out.println("Area of Triangle    : " + areaOfTriangle.getAreaCalculate());
    }

}
