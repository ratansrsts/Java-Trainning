/*
* InstanceCounter.java
* Created on Jul 22, 2019 9:36:23 AM
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
package com.infomindz.training.statickeyword;

/**
 *
 * @author ratan
 */
public class InstanceCounter
{

    private static int numInstances = 0;

    protected static int getCount()
    {
        return numInstances;
    }

    private static void addInstance()
    {
        numInstances++;
    }

    InstanceCounter()
    {
        InstanceCounter.addInstance();
    }

    private void displayName()
    {

    }

    public static void main(String[] arguments)
    {

        System.out.println("Starting with " + InstanceCounter.getCount() + " instances");

        for (int i = 0; i < 500; ++i)
        {
            InstanceCounter instanceCounter = new InstanceCounter();
        }
        System.out.println("Created " + InstanceCounter.getCount() + " instances");
        try
        {
            int x = 100 / 00;
        }
        catch (Exception e)
        {
        }
        finally
        {
            System.out.println("finally has used.");
        }
        
        testStatic st=new testStatic();
        testStatic.class.cast(st);
    }
    
    
    

}

class testStatic
{
       static{System.out.println("static block");}
}
