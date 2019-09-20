/*
* AreaOfSquare.java
* Created on Jul 16, 2019 4:30:56 PM
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
public class AreaOfSquare implements Area
{

    public int side;

    @Override
    public int getCalculateArea() //getCalculate method override to calculate area
    {
        return side * side;//use the formula to calculate area of square
    }
}
