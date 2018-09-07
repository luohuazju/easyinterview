package com.sillycat.easyinterview.leetcode.array;

import java.util.Arrays;

/**
 * 
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
 * 
 * @author sillycat
 *
 */
public class T80RemoveDuplicatesFromSortedArrayII {

	public static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length <= 2) {
			return nums.length;
		}
		int j = 1; // slow pointer
		for (int i = 2; i < nums.length; i++) {
			// not equels 2 times || not equals current
			if (nums[j] != nums[j - 1] || nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];
			}
		}
		return j + 1;
	}

	public static void main(String[] args) {
		System.out.println("--------Remove Duplicates from Sorted Array II-----");
		int[] sample1 = { 1, 1, 1, 2, 2, 3 };
		System.out.println("New Length of " + Arrays.toString(sample1) + " is " + removeDuplicates(sample1));
		System.out.println(Arrays.toString(sample1));
		int[] sample2 = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
		System.out.println("New Length of " + Arrays.toString(sample2) + " is " + removeDuplicates(sample2));
		System.out.println(Arrays.toString(sample2));
		System.out.println("---------------------------------------------------");
	}

}
