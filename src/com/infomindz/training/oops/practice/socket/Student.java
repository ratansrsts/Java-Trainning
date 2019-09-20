/*
* Student.java
* Created on Jul 29, 2019 10:51:34 AM
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

/**
 *
 * @author ratan
 */
class student 
 {
   int id;
   String name;
   String course;
   student(int id,String name,String course)
    {
     this.id=id;
     this.name=name;
     this.course=course;
    }
   void showDetails()
    {
     System.out.println("Id:"+id);
     System.out.println("Name:"+name);
     System.out.println("Course:"+course);
    }  

    void close()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
