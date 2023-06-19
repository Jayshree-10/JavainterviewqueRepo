package com.jayshree;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int i, num=8, first, last, middle;
		  int arr[]= {1,2,3,4,5,6,7,8,9,10};
		  System.out.println(arr.toString());
		    first = 0;
		    last = 9;
		    middle = (first+last)/2;
		    while(first <= last)
		    {
		        if(arr[middle]<num)
		            first = middle+1;
		        else if(arr[middle]==num)
		        {
		            System.out.println("\nThe number, "+num+" found at Position "+middle+1);
		            break;
		        }
		        else
		            last = middle-1;
		        middle = (first+last)/2;
		    }
		    if(first>last)
		        System.out.println("\nThe number, "+num+" is not found in given Array");
		  
	}

}
