package com.jayshree;

public class RemoveDuplicateFromString {

	public static void removeDuplicate(String str)
	{
		StringBuffer sb=new StringBuffer(); 
		char arr[]=str.toCharArray();
		boolean flag=true;
		for(int i=0; i<arr.length;i++)
		{
			int j=0;
			for( j=0; j<i;j++)
			{
				if(arr[i]==arr[j])
				{
				  //  System.out.println(arr[i]);
				    break;
				}	
					
			
			}
			if(i==j)
			{
				sb.append(arr[i]);
				System.out.println(arr[i]);
			}
		
		}
				
		System.out.println(sb.toString());
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          removeDuplicate("jayshree");
	}

}
