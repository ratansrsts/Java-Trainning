/*
* InetDemo.java
* Created on Jul 19, 2019 3:26:33 PM
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

package com.infomindz.training.javasocket.examples.net;

/**
 *
 * @author ratan
 */
    import java.net.*;

public class InetDemo
{

    public InetDemo()
    {

    }

    public static void main(String[] args)
    {
        try
        {
            InetAddress ip = InetAddress.getByName("www.google.com");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());

            String[] empNames =
            {
                "A", "B"
            };
            System.out.println("IP Address: " + empNames[1]);

        }
        catch (UnknownHostException e)
        {
            System.out.println(e);
        }
    }
}
