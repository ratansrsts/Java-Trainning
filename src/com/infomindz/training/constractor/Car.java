/*
* Car.java
* Created on Jul 22, 2019 2:58:09 PM
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
package com.infomindz.training.constractor;

/**
 *
 * @author ratan
 */
public class Car
{

    private int modelYear;
    private String modelName;

    public Car(int year, String name)
    {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args)
    {
        Car myCar = new Car(1969, "Mustang");
        System.out.println(myCar.getModelYear() + " " + myCar.getModelName());
    }

    /**
     * @return the modelYear
     */
    public int getModelYear()
    {
        return modelYear;
    }

    /**
     * @param modelYear the modelYear to set
     */
    public void setModelYear(int modelYear)
    {
        this.modelYear = modelYear;
    }

    /**
     * @return the modelName
     */
    public String getModelName()
    {
        return modelName;
    }

    /**
     * @param modelName the modelName to set
     */
    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    /**
     * @return the modelYear
     */
}
