package com.ctci.chapter1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Created by Varun on 7/8/2016.
 * Problem : the solution actually doesn't give a solution. Which is problematic.
 * Secondly, the 5th edition problem is different than the 4th edition one.
 * Therefore doing the 5th edition one.
 * Given two strings, write a method to decide if one is a permutation of the other.
 * permutation is a ordering issue.
 *
 * Algo 1 : read both strings, and convert to char arrays.
 *  if length do not match return false;
 *  run through char array 1 and increment the int array.
 *  run through char array 2 and decrement the main int array. if 0 then exit out.
 *
 *  Time complexity : O(N) - Since we run through the words only once.
 *  Space Complexity : O(2N) - Since we are just using the the initial and arrays.
 *
 */

public class Problem3alt {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.info("Cracking the Coding Interview : Problem 3");

        Scanner input = new Scanner(System.in);

        String wordOne = input.nextLine();
        String wordTwo = input.nextLine();

        if(wordOne == null || wordTwo == null || wordOne.isEmpty() || wordTwo.isEmpty()) {
            logger.error("Check input, empty string : " + " One : " + wordOne + " Two : " + wordTwo);
            input.close();
            return;
        }

        boolean isPerm = checkPerm(wordOne, wordTwo);

        logger.info("isPerm : " + isPerm + " | For inputs :" + "One :" + wordOne + " Two : " + wordTwo);
        input.close();
    }

    private static boolean checkPerm(String wordOne, String wordTwo) {

        int[] charIntArray = new int[256];

        char[] wordOneArray = wordOne.toCharArray();
        char[] wordTwoArray = wordTwo.toCharArray();

        for(int i = 0; i < wordOneArray.length; i++) {
            charIntArray[wordOneArray[i]]++;
        }

        for(int j = 0; j < wordTwoArray.length; j++) {
            if(charIntArray[wordTwoArray[j]] > 0) {
                charIntArray[wordTwoArray[j]]--;
            } else {
                return false;
            }
        }

        return true;
    }

}
