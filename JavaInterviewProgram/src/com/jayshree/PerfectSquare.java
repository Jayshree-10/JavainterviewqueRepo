package com.jayshree;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,25,49};
		for(int i=1; i<=7; i++)
		{
			int sqr=i*i;
			for (int j=0; j<arr.length; j++)
			{
				if(arr[j]==sqr)
					System.out.println(arr[j]);
			}
			
		}
	}

}
