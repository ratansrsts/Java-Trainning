/*
* AreaOfRectangle.java
* Created on Jul 16, 2019 4:27:48 PM
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
 * this AreaOfRectangle class used to calculate area of Rectangle has implement
 *
 * @author ratan
 */
public class AreaOfRectangle implements Area // AreaOfRectangle class implements Area interface
{

    public int length;      //declaring vaiables
    public int width;       //declaring vaiables

    @Override
    public int getCalculateArea()  //getCalculate method override to calculate area
    {
        return length * width;
    }
}
