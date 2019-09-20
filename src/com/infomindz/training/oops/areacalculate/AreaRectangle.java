/*
* AreaRectangle.java
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
 *
 * @author ratan
 */
public class AreaRectangle extends Area
{

    @Override
    int getAreaCalculate()
    {
        int area;
        int Length = 15;
        int Width = 10;
        area = Length * Width;
        return area;
    }
}
