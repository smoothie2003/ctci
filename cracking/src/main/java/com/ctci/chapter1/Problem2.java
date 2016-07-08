package com.ctci.chapter1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Created by Varun on 7/7/2016.
 */
public class Problem2 {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("Problem 2 Reverse a string");

        Scanner input = new Scanner(System.in);

        String inputAsString = input.nextLine();

        if(inputAsString == null || inputAsString.isEmpty()) {
            logger.error("Input string is null");
            input.close();
            return;

        }

        char[] inputAsArray = inputAsString.toCharArray();

        for(int i = 0, j = inputAsArray.length-1; i < j; i++, j--) {
            char valueAtI = inputAsArray[i];
            char valueAtJ = inputAsArray[j];

            inputAsArray[i] = valueAtJ;
            inputAsArray[j] = valueAtI;
        }

        String output = new String(inputAsArray);

        logger.info("Problem 2 : Input : " + inputAsString + " | Output : " +output);

        input.close();
    }
}
