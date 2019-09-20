/*
* Constructor.java
* Created on Jul 15, 2019 2:44:33 PM
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

/**
 *
 * @author ratan
 */
// Create a MyClass class
public class Constructor
{

    int x;

    // Create a class constructor for the Constructor class
    public Constructor()
    {
        x = 5;
    }

    public static void main(String[] args)
    {
        Constructor myObj = new Constructor();
        System.out.println(myObj.x);
    }
}
