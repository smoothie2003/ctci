package com.ctci.chapter1;

/**
 * Created by Varun on 7/24/2016.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a method to replace all spaces in a string with '%20' You may assume that the string
 * has sufficient space at the end of the string to hold the additional characters, and that you
 * are given the true length of the string.
 */
public class Problem4 {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.info("Cracking the Coding Interview : Problem 4");

        Scanner input = new Scanner(System.in);

        String inputString = input.nextLine();

        char[] inputAsCharArray = inputString.toCharArray();
        StringBuilder outputAsCharArray = new StringBuilder();

        for(int i = 0; i < inputAsCharArray.length; i++) {
            if(inputAsCharArray[i] == ' ') {
                outputAsCharArray.append('%');
                outputAsCharArray.append('2');
                outputAsCharArray.append('0');
            } else {
                outputAsCharArray.append(inputAsCharArray[i]);
            }
        }

        logger.info("Output :" + outputAsCharArray.toString());



    }

}
