package com.sillycat.easyinterview.datastructure.array;

import java.util.Scanner;

public class SolutionDS {

	private static int validateInput(Scanner in, int min, int max){
		int n = 0;
		try{
			n = in.nextInt();
			if(n < min || n > max){
				System.err.print("Wrong input value, should be " + min + "<=N<=" + max);
				System.exit(-1);
			}
		}catch(Exception e){
			System.err.print("Wrong input value, should be Integer");
			System.exit(-1);
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = SolutionDS.validateInput(in, 1, 1000);
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = SolutionDS.validateInput(in, 1, 10000);
        }
        
        for(int arr_i=n-1;arr_i>=0;arr_i--){
            System.out.print(arr[arr_i] + " ");
        }

	}

}
