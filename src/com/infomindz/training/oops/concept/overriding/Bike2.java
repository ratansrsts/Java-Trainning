/*
* Bike2.java
* Created on Jul 18, 2019 4:07:53 PM
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
package com.infomindz.training.oops.concept.overriding;

/**
 *
 * @author ratan
 */
class Bike2 extends Vehicle
{

    @Override
    void run()
    {
        System.out.println("Bike is running safely");
    }

    public static void main(String args[])
    {
        Bike2 obj = new Bike2();
        obj.run();
    }
}
