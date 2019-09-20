/*
* Encapsulation.java
* Created on Jul 16, 2019 11:56:35 AM
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
public class Encapsulation
{

    private String name; // private = restricted access

    // Getter
    public String getName()
    {
        return name;
    }

    // Setter
    public void setName(String newName)
    {
        this.name = newName;
    }

    public static void main(String[] args)
    {
        
    }

}
