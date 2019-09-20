/*
* NoArgCtor.java
* Created on Jul 24, 2019 10:38:47 AM
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
    class NoArgCtor {
        int i;
        // constructor with no parameter
        private NoArgCtor(){
            i = 5;
            System.out.println("Object created and i = " + i);
        }
        public static void main(String[] args) {
            NoArgCtor obj = new NoArgCtor();
        }
    }