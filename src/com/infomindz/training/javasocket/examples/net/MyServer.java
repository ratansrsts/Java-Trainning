/*
* MyServer.java
* Created on Jul 19, 2019 11:39:43 AM
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

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ratan
 */
public class MyServer
{

    public static void main(String[] args)
    {
        try
        {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();//establishes connection   
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            ss.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }

}
