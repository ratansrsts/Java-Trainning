/*
* SwitchMonthExample.java
* Created on Jul 25, 2019 10:18:13 AM
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

package com.infomindz.training.statements;

import java.util.Scanner;

/**
 *
 * @author ratan
 */
public class SwitchMonthExample {  
public static void main(String[] args) {  
    Scanner scan=new Scanner(System.in);
    int month; 
    System.out.println("Please choose 1-12 to see month:");
    month=scan.nextInt();
    String monthString="";
    switch(month){  
    case 1: monthString="1 - January";
    break;  
    case 2: monthString="2 - February";
    break;  
    case 3: monthString="3 - March";
    break;  
    case 4: monthString="4 - April";
    break;  
    case 5: monthString="5 - May";
    break;  
    case 6: monthString="6 - June";
    break;  
    case 7: monthString="7 - July";
    break;  
    case 8: monthString="8 - August";
    break;  
    case 9: monthString="9 - September";
    break;  
    case 10: monthString="10 - October";
    break;  
    case 11: monthString="11 - November";
    break;  
    case 12: monthString="12 - December";
    break;  
    default:System.out.println("Invalid Month");  
    }  
    System.out.println(monthString);
}  
} 
