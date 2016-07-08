package com.ctci.chapter1;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Varun
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 * 
 */
public class Problem1 {
	
	static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		logger.info("Starting Problem");
		
		Scanner input = new Scanner(System.in);
		
		String inputAsString = input.nextLine();
		
		if(inputAsString == null || inputAsString.isEmpty()) {
			logger.error("Empty Input !");
			input.close();
			return;
		}
		
		boolean isAllCharacterUnique = checkUnique(inputAsString.toCharArray());
		
		logger.info("String : " + inputAsString + 
				    " | isAllCharacterUnique :" + isAllCharacterUnique);
		
		input.close();
	}

	private static boolean checkUnique(char[] charArray) {
		
		Character[] allElements = new Character[256];
		
		for(int i = 0; i < charArray.length; i++) {
			Character value = allElements[charArray[i]];
			
			if (value == null) {
				allElements[charArray[i]] = charArray[i];
				continue;
			} else {
				return false;
			}
		}
		
		return true;
	}

}
