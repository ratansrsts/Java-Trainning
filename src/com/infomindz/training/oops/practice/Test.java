/*
* Test.java
* Created on Jul 31, 2019 12:22:04 PM
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

/**
 *
 * @author ratan
 */
class A
{
    int i = 50;
 
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
    }
}
 
public class Test
{
   public static void main(String[] args)
   {
      //Creating two instances of class A
 
      A a1 = new A();
 
      A a2 = new A();
 
      //Assigning a2 to a1
 
      a1 = a2;
 
      //Now both a1 and a2 will be pointing to same object 
 
      //An object earlier referred by a1 will become abandoned
//      System.gc();
      System.out.println("done");
   }
}
