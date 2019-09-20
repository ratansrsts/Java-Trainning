/*
* WhileLoop.java
* Created on Jul 25, 2019 11:59:33 AM
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
package com.infomindz.training.oops.practice;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 *
 * @author ratan
 */
public class MyClass
{

    public static void main(String[] args) throws UnknownHostException
    {
        int i = 0;

        while (i < 0)
        {
            System.out.println(i);
            i++;
        }
        
        System.out.println(Arrays.toString(Inet4Address.getAllByName("www.sofweb.com")));
    }
}
