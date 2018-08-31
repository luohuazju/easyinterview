package com.sillycat.easyinterview.leetcode.string;

/**
 * 
 * https://leetcode.com/problems/longest-common-prefix/description/
 * Horizontal scanning
 * Vertical scanning
 * @author Sillycat
 *
 */
public class T14LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		for (int i = 0;i < strs[0].length(); i++) {
			char needle = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if( i == strs[j].length() || strs[j].charAt(i) != needle) {
					//find the first <>
					return strs[0].substring(0, i);
				}
			}
		}
		return strs[0];
	}

	public static void main(String[] args) {
		System.out.println("--------Longest Common Prefix ----------");
		String[] params1 = { "flower", "flow", "flight" };
		String result1 = longestCommonPrefix(params1);
		System.out.println("result1 = " + result1);

		String[] params2 = { "dog", "racecar", "car" };
		String result2 = longestCommonPrefix(params2);
		System.out.println("result2 = " + result2);
		
		String[] params3 = { "aa", "a" };
		String result3 = longestCommonPrefix(params3);
		System.out.println("result3 = " + result3);
		System.out.println("----------------------------------------");
	}

}
