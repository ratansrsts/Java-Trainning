/*
* FinalMethodOverload.java
* Created on Jul 31, 2019 11:00:52 AM
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
package com.infomindz.training.oops.practice.finalm;

import java.util.Scanner;

/**
 *
 * @author ratan
 */
public class FinalMethodOverload
{

    final void calc(int a, int b)
    {
        int c = a + b;
        System.out.println("Addition--" + c);
    }

    final void calc(double c, double d) // this is final method //overloading
    {
        System.out.println("Just printing numbers.." + c + "..." + d);
    }

    void calc(String name) // this method is not final..only overloading
    {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("my name is " + name);
    }

    public static void main(String[] args)
    {
        FinalMethodOverload fmo = new FinalMethodOverload();
        fmo.calc(23, 34);
        fmo.calc(3.9, 6.6);
        System.out.println("What is your name??");
        fmo.calc("TEJA");
    }
}
