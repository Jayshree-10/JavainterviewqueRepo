package com.jayshree;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,3,4,5};
		int a2[]= {6,9,10,11,12,13};
		int a3[]=new int[a1.length+a2.length];
		int l1=a1.length;
		int l2=a2.length;
		int l3=0;
		for(int i=0;i<a3.length;i++)
		{
			if(i<l1)
			{
				a3[l3]=a1[i];
				l3=l3+1;
			}	
			if(i<l2)
			{
				a3[l3]=a2[i];
				l3=l3+1;
			}
			
		}
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));

	}

}
