package com.sillycat.easyinterview.leetcode.array;

/**
 * https://leetcode.com/problems/remove-element/description/
 * 
 * @author sillycat
 *
 */
public class T27RemoveElement {

	public static int removeElement(int[] nums, int val) {
		int j = 0;
		for(int i = 0; i< nums.length; i++) {
			if(nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
    }
	
	public static String printArray(int[] nums, int length) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i< length; i++) {
			sb.append(nums[i]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("------Remove Element ---------");
		int[] sample1 = { 3, 2, 2, 3};
		int result1 = removeElement(sample1, 3);
		System.out.println("result1 count = " + result1);
		System.out.println("result1 array = " + printArray(sample1, result1));
		int[] sample2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int result2 = removeElement(sample2, 2);
		System.out.println("result2 count = " + result2);
		System.out.println("result2 array = " + printArray(sample2, result2));
		System.out.println("------------------------------");
	}

}
