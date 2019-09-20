/*
* OverLoadingTest.java
* Created on Jul 22, 2019 5:40:06 PM
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
public class OverLoadingTest
{

    private int x;
    private int y;
    private int z;
    private int zz;
//    private Integer y1;

    private void add(int x, int y)
    {
        this.x = x;
        this.y = y;

    }

    void add(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void add(int x, int y, int z, int zz)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.z = zz;
    }

    public static void main(String[] args)
    {
        OverLoadingTest t1 = new OverLoadingTest();
        t1.add(24, 54);
        System.out.println(t1.x + t1.y);
        OverLoadingTest t2 = new OverLoadingTest();
        t2.add(12, 14, 52);
        System.out.println(t2.x + t2.y+t2.z);
        OverLoadingTest t3 = new OverLoadingTest();
        t3.add(24, 21, 41, 12);
        System.out.println(t3.x + t3.y+t3.z+t3.zz);
    }

}
