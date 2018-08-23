package com.sillycat.easyinterview.leetcode.matrix;

import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix/description/
 * 
 * @author Sillycat
 *
 */
public class SpiralMatrix54 {
	
	public List<Integer> spiralMatrix(int[][] matrix){
		if(matrix == null) {
			return Collections.<Integer>emptyList();
		}
		
		return null;
	}

	public static void main(String[] args) {
		System.out.println("----spiral matrix----------");
		//example 1
		int[][] matrix1 = { {1,2,3}, {4, 5, 6}, {7,8,9}};
		SpiralMatrix54 solution = new SpiralMatrix54();
		System.out.println(solution.spiralMatrix(matrix1));
		System.out.println("---------------------------");
	}

}
