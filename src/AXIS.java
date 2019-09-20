
import com.infomindz.training.oops.concept.polymorphism.Bank;

/*
* AXIS.java
* Created on Jul 31, 2019 4:50:18 PM
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
public class AXIS implements Bank
{

    @Override
    public float getRateOfInterest()
    {
        return 9.7f;
    }
}