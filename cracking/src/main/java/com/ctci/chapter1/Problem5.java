package com.ctci.chapter1;

/**
 * Created by Varun on 7/24/2016.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example the string aabcccccaaa would become a2b1c5a3. If the compressed string would not
 * become smaller than the original string your method should return the original string.
 *
 * Solved : You don't need the second for loop since you can just do using one.
 */
public class Problem5 {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
       logger.info("Cracking the Coding Interview : Problem 4");

        Scanner input = new Scanner(System.in);

        String inputAsString = input.nextLine();

        String compressedString = compressString(inputAsString);

        if(compressedString.length() >= inputAsString.length()) {
            logger.info("Problem solution : compressed string is longer than original string :" + inputAsString);
        } else {
            logger.info("Problem solution : compressed string is the following : " + compressedString);
        }

    }

    private static String compressString(String inputAsString) {

        StringBuilder output = new StringBuilder();

        char[] inputAsArray = inputAsString.toCharArray();

        for(int i = 0; i < inputAsArray.length; i++) {
            int count = 1;
            for(int j = i+1; j <= inputAsArray.length; j++) {
                if(j == inputAsArray.length) {
                    output.append(inputAsArray[i]);
                    output.append(count);
                    i = j;
                    break;
                }
                if(inputAsArray[i] == inputAsArray[j]) {
                    count++;
                } else {
                    output.append(inputAsArray[i]);
                    output.append(count);
                    i=j-1;
                    break;
                }
            }
        }

        return output.toString();
    }

}
