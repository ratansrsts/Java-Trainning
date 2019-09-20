/*
* Teacher.java
* Created on Jul 22, 2019 3:12:38 PM
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
public class Teacher
{

    int idStudent;
    String nameStudent;
    String genderStudent;

    Teacher(int id, String name, String gender)
    {
        idStudent = id;
        nameStudent = name;
        genderStudent = gender;
    }

    public static void main(String[] args)
    {

        Teacher t1 = new Teacher(1234, "Md Ratan Hossain", "Male");
        t1.print();
    }

    public void print()
    {
        System.out.println(idStudent);
        System.out.println(nameStudent);
        System.out.println(genderStudent); 
    }

}
