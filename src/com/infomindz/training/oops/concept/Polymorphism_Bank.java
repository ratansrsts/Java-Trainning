/*
* Polymorphism.java
* Created on Jul 16, 2019 11:55:40 AM
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
package com.infomindz.training.oops.concept;

/**
 *
 * @author ratan
 */
class Bank
{

    float getRateOfInterest()
    {
        return 0;
    }
}

class SBI extends Bank
{

    @Override
    float getRateOfInterest()
    {
        return 10.2f;
    }
}

class ICICI extends Bank
{

    @Override
    float getRateOfInterest()
    {
        return 7.3f;
    }
}

class AXIS extends Bank
{

    @Override
    float getRateOfInterest()
    {
        return 9.7f;
    }
}

class TestPolymorphism
{

    public static void main(String args[])
    {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
    }
}
