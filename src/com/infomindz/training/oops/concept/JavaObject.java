/*
* JavaObject.java
* Created on Jul 16, 2019 11:54:43 AM
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
public class JavaObject
{

    int id;//field or data member or instance variable  
    String name;

    //creating main method inside the JavaObject class  
    public static void main(String args[])
    {
        //Creating an object or instance  
        JavaObject JO1 = new JavaObject();

        System.out.println(JO1.id);
        System.out.println(JO1.name);
    }
}
