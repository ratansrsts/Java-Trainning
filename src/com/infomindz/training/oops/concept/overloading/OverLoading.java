/*
* OverLoading.java
* Created on Jul 18, 2019 3:04:14 PM
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
package com.infomindz.training.oops.concept.overloading;

/**
 *
 * @author ratan
 */
public class OverLoading
{

    void sum(int a, long b)
    {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c, int d)
    {
        System.out.println(a + b + c + d);
    }

    public static void main(String args[])
    {
        OverLoading obj = new OverLoading();
        obj.sum(20, 20);
        obj.sum(20, 20, 20, 20);

    }

}
