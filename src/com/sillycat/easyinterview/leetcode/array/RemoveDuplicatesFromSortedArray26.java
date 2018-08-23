package com.sillycat.easyinterview.leetcode.array;

/**
 * 
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * 
 * @author Sillycat
 *
 */
public class RemoveDuplicatesFromSortedArray26 {

	public static int removeDuplicates(int[] nums) {
		int j = 0;
		if (nums == null) {
			return j;
		}
		for (int i = 1; i < nums.length; i++) {
			if (nums[j] != nums[i]) {
				j++;
				nums[j] = nums[i];
			}
		}
		return j + 1;
	}

	public static String printArray(int[] nums, int length) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(nums[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("------Remove Element ---------");
		int[] sample1 = { 1, 1, 2 };
		int result1 = removeDuplicates(sample1);
		System.out.println("result1 count = " + result1);
		System.out.println("result1 array = " + printArray(sample1, result1));
		int[] sample2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int result2 = removeDuplicates(sample2);
		System.out.println("result2 count = " + result2);
		System.out.println("result2 array = " + printArray(sample2, result2));
		int result3 = removeDuplicates(null);
		System.out.println("result3 count = " + result3);
		System.out.println("result3 array = " + printArray(null, result3));
		System.out.println("------------------------------");

	}

}
