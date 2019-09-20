/*
* Dog.java
* Created on Jul 18, 2019 5:16:25 PM
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
package com.infomindz.training.oops.concept.keyword;

/**
 *
 * @author ratan
 */
public class Dog extends Animal
{

    String color = "Black";

    void printColor()
    {
        System.out.println(color);
//        System.out.println(super.color);
    }
    
    public static void main(String[] args)
    {
        Animal a =new Animal();
        a.setColor("Green");
        String name=a.getColor();
        System.out.println("Parking :"+name);
        
        
    }
}
