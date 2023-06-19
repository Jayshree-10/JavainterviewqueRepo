package com.jayshree;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort 
{
	public static void checkArr(int a[])
	{

		//Arrays.asList({1,2,3,4});
		for(int i=0;i<a.length-1;i++) 
		{
			int min=i;
			for(int j=i+1; j<a.length;j++)
			{
				if(a[j]<a[min]) 
				{
					min=j;
				}                                  //45 6 7 8 90 3
			}
			int temp =a[min];
			a[min] =a[i];
			a[i] =temp;
			//System.out.print(a[i]+" ");	
		}
		System.out.print(Arrays.toString(a));	
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		//Code for checking array input
		System.out.println("Enter array elements");
		int arr[]  = new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		checkArr(arr);
		sc.close();
	}
//34 5 77 89 9
}