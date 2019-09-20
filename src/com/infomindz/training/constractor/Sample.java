/*
* Sample.java
* Created on Jul 24, 2019 9:40:23 AM
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
public class Sample
{

    private boolean x;
    private Integer a;
    private int b;
    private Boolean c;

    Sample()
    {
    }

    /**
     * @return the x
     */
    public boolean isX()
    {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(boolean x)
    {
        this.x = x;
    }

    /**
     * @return the a
     */
    public Integer getA()
    {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Integer a)
    {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB()
    {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b)
    {
        this.b = b;
    }

    /**
     * @return the c
     */
    public Boolean isC()
    {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Boolean c)
    {
        this.c = c;
    }

}

class Main
{

    public static void main(String[] args)
    {

        Sample s = new Sample();
        System.out.println(s.isX());
        System.out.println(s.getA());
        System.out.println(s.getB());
        System.out.println(s.isC());
    }
}
