package com.ctci.chapter1;

public class Problem8 {
	
	public static void main(String args[]) {
		
		String arg1 = "waterbottles";
		String arg2 = "bottleswater";
		
		System.out.println("Arg 1 :" + arg1 + " | Arg 2 :" + arg2);
		
		boolean isRotation = checkRotation(arg1, arg2);
		
	}

	private static boolean checkRotation(String arg1, String arg2) {
		char[] arg1AsChar = arg1.toCharArray();
		char[] arg2AsChar = arg2.toCharArray();
		
		boolean isRotation = false;
		
		int offset = 0;
		
		for(int i = 0 ; i < arg2AsChar.length; i++) {
			
			if (offset >= arg2AsChar.length) {
				return false;
			}
			
			if(arg1AsChar[i] != arg2AsChar[i]) {
				offset++;
			} else {
				
			}
		}
		
		return false;
	}

}
