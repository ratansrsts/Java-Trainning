/*
* Animal.java
* Created on Jul 24, 2019 3:00:20 PM
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


package com.infomindz.training.oops.concept.interfacec;

/**
 *
 * @author ratan
 */
 abstract interface Animal
{
     static  int x=10;
    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
    
}