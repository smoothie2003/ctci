package com.ctci.chapter1;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Varun on 7/24/2016.
 */
public class Problem6 {

	static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {

		logger.info("Solution for problem 6");

		int[][] inputArray = fillArray();

		System.out.println(Arrays.deepToString(inputArray));

		inputArray = rotate2(inputArray, 5);

		System.out.println(Arrays.deepToString(inputArray));

		inputArray = rotate(inputArray, 5);
		
		System.out.println(Arrays.deepToString(inputArray));

	}
	
	private static int[][] rotate2(int[][] inputArray, int n) {
		
		for(int layer = 0; layer < n/2; layer++) {
			
			int first = layer;
			int last = n-first-1;
			
			for (int i = first; i < last; i++) {
				
				int offset = i - first;
				
				int top = inputArray[first][i];
				
				inputArray[first][i] = inputArray[last-offset][first];
				inputArray[last-offset][first] = inputArray[last][last-offset];
				inputArray[last][last-offset] = inputArray[i][last];
				inputArray[i][last] = top;
				
			}
			
			
		}
		
		return inputArray;
	}
	
	private static int[][] rotateArray2(int[][] inputArray, int n) {
		
		for(int layer = 0; layer < n/2; layer++) {
			int first = layer;
			int last = n - first - 1;
			
			for(int i = first; i < last; i++) {
				int offset = i-first;
				int top = inputArray[first][i];
				
				inputArray[first][i] = inputArray[last-offset][first];
				inputArray[last-offset][first] = inputArray[last][last-offset];
				inputArray[last][last-offset] = inputArray[i][last];
				inputArray[i][last] = top;
			}
			
		}
		
		return inputArray;
	}

	private static int[][] fillArray() {
		int[][] inputArray = new int[5][5];

		for (int i = 0; i < 5; i++) {
			inputArray[i][0] = 2;
			inputArray[i][2] = 5;
		}

		return inputArray;
	}

	public static int[][] turnArray(int[][] inputArray, int n) {

		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - first;

			for (int i = first; i < last; i++) {

				int offset = i - first;
				int top = inputArray[first][i];

				inputArray[first][i] = inputArray[last - offset][first];
				inputArray[last - offset][first] = inputArray[last][last - offset];
				inputArray[last][last - offset] = inputArray[i][last];
				inputArray[i][last] = top;

			}
		}

		return inputArray;
	}

	public static int[][] rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; ++i) {
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last - offset][first];

				// bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}

		return matrix;
	}

}
