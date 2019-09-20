/*
* AreaOfCircle.java
* Created on Jul 24, 2019 4:02:40 PM
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
 * this AreaOfCircle class used to calculate area of circle has implement
 *
 * @author ratan
 */
public class AreaOfCircle implements Area
{

    static double pi = 3.1416; // assigning the value of pi
    private int radius;        //declaring vaiables

    @Override
    public int getCalculateArea()
    {
        return (int) (double) (pi * (radius * radius));
    }

    /**
     * @return the radius
     */
    public int getRadius() //get the value off radius here
    {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) //set the value of radius
    {
        this.radius = radius;
    }
}
