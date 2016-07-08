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
 *  Sort the array and then see if they match.
 *
 *  Time complexity : O(NlogN) - Due to sorting.
 *  Space Complexity : O(3N) - Initial String, then to char array, then to new string.
 *
 */
public class Problem3 {

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

        if(wordOne.length() != wordTwo.length()) {
            logger.error("Word One and Word Two length do not match so can't be perm");
            return false;
        }

        String wordOneSorted = sort(wordOne);
        String wordTwoSorted = sort(wordTwo);



        if(wordOneSorted.equals(wordTwoSorted)) {
            return true;
        }

        return false;
    }

    private static String sort(String word) {
        char[] wordArray = word.toCharArray();
        java.util.Arrays.sort(wordArray);

        return new String(wordArray);
    }

}
