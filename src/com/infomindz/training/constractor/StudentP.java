/*
* StudentP.java
* Created on Jul 24, 2019 10:28:26 AM
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
/*
* Student3.java
* Created on Jul 24, 2019 10:17:48 AM
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

/**
 *
 * @author ratan
 */
    //Let us see another example of default constructor  
    //which displays the default values  
    class StudentP
{

    int id;
    String name;

    public StudentP(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    //method to display the value of id and name  
    void display()
    {
        System.out.println(id + " " + name);
    }

    public static void main(String args[])
    {
        //creating objects  
        StudentP s1 = new StudentP(1, " John");
        StudentP s2 = new StudentP(2, " Rifat");
        //displaying values of the object  
        s1.display();
        s2.display();
    }
}
