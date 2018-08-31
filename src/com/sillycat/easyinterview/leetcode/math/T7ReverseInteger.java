package com.sillycat.easyinterview.leetcode.math;

/**
 * https://leetcode.com/problems/reverse-integer/description/
 * 
 * @author sillycat
 *
 */
public class T7ReverseInteger {

	public static int reverse(int x) {
		int result = 0;
		while (x != 0) {
			int pop = x % 10;
			// -2147483648
			// 2147483647
			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
				return 0;
			}
			if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
				return 0;
			}
			result = result * 10 + pop;
			x = x / 10;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("------Reverse Integer -------");
		System.out.println("result1 for 123 is " + reverse(123));
		System.out.println("result2 for -123 is " + reverse(-123));
		System.out.println("result3 for 120 is " + reverse(120));
		System.out.println("result4 for 1534236469 is " + reverse(1534236469));
		System.out.println("-----------------------------");
	}

}
