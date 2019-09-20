/*
* Animal.java
* Created on Jul 18, 2019 5:16:12 PM
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

package com.infomindz.training.oops.concept.keyword;

/**
 *
 * @author ratan
 */
public class Animal {
    
  private  String color;
  
  public void display()
  {
      System.out.println("color :"+color);
  }
    
    protected void behavior()
    {
        System.out.println("Parking");
    }

    /**
     * @return the color
     */
    public String getColor()
    {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color)
    {
        this.color = color;
    }

}
