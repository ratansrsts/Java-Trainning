/*
* Pig.java
* Created on Jul 24, 2019 2:59:21 PM
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
package com.infomindz.training.oops.concept.interfacec;

/**
 *
 * @author ratan
 */
// Interface


// Pig "implements" the Animal interface
class Pig implements Animal
{

    @Override
    public void animalSound()
    {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep()
    {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class MyMainClass
{

    public static void main(String[] args)
    {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
