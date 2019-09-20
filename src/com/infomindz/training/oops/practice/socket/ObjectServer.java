/*
* ObjectServer.java
* Created on Jul 29, 2019 10:52:22 AM
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

package com.infomindz.training.oops.practice.socket;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ratan
 */
class ObjectServer
 {
  public static void main(String arg[]) throws Exception
   {
  
   // Server will be started on 1700 port number
    ServerSocket server=new ServerSocket(1700);
	
   // Server listening for connection
    Socket s=server.accept();
	
   // Stream object for sending object 
    ObjectOutputStream os=new ObjectOutputStream(s.getOutputStream());
	
   student object1=new student(12,"Pankaj","M.tech");
   os.writeObject(object1);
   
   s.close();
   }
 }
