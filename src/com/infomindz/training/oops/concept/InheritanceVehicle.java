/*
* Inheritance.java
* Created on Jul 16, 2019 11:55:16 AM
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
class InheritanceVehicle
{

    protected String brand = "Ford";

    public void honk()
    {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends InheritanceVehicle
{

    private final String  modelName = "Mustang";

    public static void main(String[] args)
    {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }

}
