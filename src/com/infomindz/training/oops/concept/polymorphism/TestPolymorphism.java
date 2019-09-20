
import com.infomindz.training.oops.concept.polymorphism.Bank;
import com.infomindz.training.oops.concept.polymorphism.ICICI;
import com.infomindz.training.oops.concept.polymorphism.SBI;

/**
* Polymorphism.java
* Created on Jul 16, 2019 11:55:40 AM
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
public class TestPolymorphism
{

    public static void main(String args[])
    {
        Bank bank;
        bank = new SBI();
        System.out.println("SBI Rate of Interest  : " + bank.getRateOfInterest());
        bank = new ICICI();
        System.out.println("ICICI Rate of Interest: " + bank.getRateOfInterest());
        bank = new AXIS();
        System.out.println("AXIS Rate of Interest : " + bank.getRateOfInterest());
    }
}
