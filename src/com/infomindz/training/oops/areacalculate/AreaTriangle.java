/*
* AreaTriangle.java
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
 *
 * @author ratan
 */
public class AreaTriangle extends Area
{

    @Override
    int getAreaCalculate()
    {
        double Base = 10;
        double Height = 7;
        double area;
        area = .5 * Base * Height;
        return (int) area;
    }
}
