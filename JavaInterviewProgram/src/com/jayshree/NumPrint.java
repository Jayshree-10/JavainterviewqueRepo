package com.jayshree;

import java.util.Arrays;
import java.util.Scanner;

public class NumPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int ei = 0; // 0,2,4,6,8
		int oi = 1; // 1,3,5,7,9
		System.out.println("Please enter number");
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				arr[ei] = num;
				ei = ei + 2;
			} else {
				arr[oi] = num;
				oi = oi + 2;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
