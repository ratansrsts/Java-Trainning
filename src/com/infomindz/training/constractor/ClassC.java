/*
* ClassC.java
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
package com.infomindz.training.constractor;

/**
 *
 * @author ratan
 */
// Create a MyClass class
public class ClassC
{

    int x;
    int y;
    int z;

    // Create a class constructor for the ClassC class
     ClassC(int x, int y)
    {
     z=x+y;

    }

    public static void main(String[] args)
    {      

        ClassC myObj = new ClassC(12,25);
        
        System.out.println(myObj.z);
    }
}
