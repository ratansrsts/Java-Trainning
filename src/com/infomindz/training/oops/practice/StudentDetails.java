/*
* StudentDetails.java
* Created on Jul 24, 2019 6:32:43 PM
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

import java.util.Scanner;

/**
 *
 * @author ratan
 */
public class StudentDetails
{

    
    public static void main(String[] args)
            
    {        Scanner in = new Scanner(System.in);
    
             Student sd=new Student();
             
             System.out.println("Enter your id           :");
             int idIn=in.nextInt();
             sd.setId(idIn);
             
             System.out.println("Enter your name         :");
             String nameIn=in.nextLine();  
             sd.setName(nameIn);
             
             System.out.println("Enter your address      :");
             String depthIn=in.nextLine();
             sd.setDep(depthIn);

             System.out.println("Enter your Email        :");
             String mailIn=in.nextLine();
             sd.setMail(mailIn);
             
             System.out.println("Enter your address      :");
             String adressIn=in.nextLine();
             sd.setAddress(adressIn);
             
             System.out.println("Enter your phone number :");
             int phoneIn=in.nextInt();
             sd.setPhone(phoneIn);
             
             System.out.println(sd.getId());
             System.out.println(sd.getName());
             System.out.println(sd.getDep());
             System.out.println(sd.getMail());
             System.out.println(sd.getAddress());
             System.out.println(sd.getPhone());
             
             
             
    }

}


//System.out.println("Enter your Department   :");
//             String depIn=in.nextLine();
//             sd.setDep(depIn);