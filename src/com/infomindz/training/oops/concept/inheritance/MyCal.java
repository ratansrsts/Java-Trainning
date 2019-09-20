/*
* MyCal.java
* Created on Jul 18, 2019 11:04:36 AM
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

package com.infomindz.training.oops.concept.inheritance;

/**
 *
 * @author ratan
 */
 public class MyCal extends Calculation
{

    @Override
    public int multiplication(int x, int y)
    {
       return x * y;
//        System.out.println("The product of the given numbers:" + z);
    }

    public static void main(String args[])
    {
        int a = 20, b = 10;
        MyCal demo = new MyCal();
        int r = demo.addition(a, b);
        System.out.println("  Addition       = "+r);
        demo.subtraction(a, b);
        System.out.println("  Subtraction    = "+r);
        r = demo.multiplication(a, b);
        System.out.println("  Multiplication = "+r);

    }
    
 
     }
