package com.sillycat.easyinterview.leetcode.string;

/**
 * 
 * https://leetcode.com/problems/implement-strstr/description/
 * 
 * @author Sillycat
 *
 */
public class ImplementStrStr28 {

	public static int strStr(String haystack, String needle) {
		if (needle.isEmpty()) {
			return 0;
		}
		if (haystack.isEmpty() || needle.length() > haystack.length()) {
			return -1;
		}
		char[] haystacks = haystack.toCharArray();
		char[] needles = needle.toCharArray();
		int j = 0;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystacks[i] == needles[j]) {
				if (j == needles.length - 1) {
					return i - needles.length + 1;
				}
				j++;
			} else {
				if(j > 0) {
					i = i - j;
					j = 0;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("--------str Str ----------");
		int result1 = strStr("hello", "ll");
		System.out.println("ll is in hello index = " + result1);
		int result2 = strStr("aaaaa", "bba");
		System.out.println("bba is in aaaaa index = " + result2);
		int result3 = strStr("hereisasillycat", "silly");
		System.out.println("silly is in hereisasillycat index = " + result3);
		int result4 = strStr("mississippi", "issip");
		System.out.println("issip is in mississippi index = " + result4);
		int result5 = strStr("mississippi", "pi");
		System.out.println("pi is in mississippi index = " + result5);
		System.out.println("--------------------------");
	}

}
