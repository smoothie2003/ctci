package com.ctci.chapter1;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Varun
 * Time Complexity - O(n^2)
 * Space Complexity - O(1)
 *
 */
public class Problem1alt {

	static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		logger.info("Starting Problem1 alt");

		Scanner input = new Scanner(System.in);

		String inputAsString = input.nextLine();

		if (inputAsString == null || inputAsString.isEmpty()) {
			logger.error("Empty Input !");
			input.close();
			return;
		}

		boolean isAllCharacterUnique = checkUnique(inputAsString.toCharArray());

		logger.info("String : " + inputAsString + " | isAllCharacterUnique :"
				+ isAllCharacterUnique);

		input.close();
	}

	private static boolean checkUnique(char[] charArray) {

		for (int i = 0; i < charArray.length; i++) {
			char value = charArray[i];
			for (int j = i + 1; j < charArray.length; j++) {
				char value2 = charArray[j];
				if (value == value2) {
					return false;
				} else {
					continue;
				}
			}
		}

		return true;
	}

}
