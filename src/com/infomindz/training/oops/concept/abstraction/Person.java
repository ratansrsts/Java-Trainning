/*
* Person.java
* Created on Jul 24, 2019 2:43:40 PM
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
package com.infomindz.training.oops.concept.abstraction;

/**
 *
 * @author ratan
 */
//abstract class
public abstract class Person
{

    private String name;
    private String gender;

    public Person(String nm, String gen)
    {
        this.name = nm;
        this.gender = gen;
    }

    //abstract method
    public abstract void work();

    @Override
    public String toString()
    {
        return "Name=" + this.name + "::Gender=" + this.gender;
    }

    public void changeName(String newName)
    {
        this.name = newName;
    }
}
