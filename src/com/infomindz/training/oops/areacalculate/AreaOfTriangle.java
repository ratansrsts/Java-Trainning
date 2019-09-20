/*
* AreaOfTriangle.java
* Created on Jul 16, 2019 4:29:19 PM
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
 * This class AreaOfTriangle is to declare the variables and mechanism to get area of Triangle
 * @author ratan
 */
public class AreaOfTriangle implements Area
{
       public double base;
       public double height;
       public double area;
       
    @Override
    public int getCalculateArea()  //getCalculate method override to calculate area
    {
        
        area = 0.5 * base * height;   //use the formula to calculate area of triangle
        return (int) area;
    }
}
