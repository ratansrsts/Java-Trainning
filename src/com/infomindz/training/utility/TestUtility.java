/*
* TestUtility.java
* Created on Jul 16, 2019 6:38:59 PM
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
package com.infomindz.training.utility;

import com.infomindz.commons.utils.date.DateUtils;
import com.infomindz.commons.utils.io.FileUtils;
import com.infomindz.commons.utils.text.DenominationUtils;




/**
 *
 * @author ratan
 */
public class TestUtility
{

    public static void main(String[] args)
    {

        System.out.println(DateUtils.getCurrentYear());
        System.out.println(DateUtils.TIME_START_OF_DAY);
    }
}
