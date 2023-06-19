package com.jayshree;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Deccan  Logic";
		String word="",str="";
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{
				word+=s.charAt(i);
			}
			else
			{
			//	if(word!=" ")
				{
					str+=word+"  ";
					word="";
				}
					
			}
				
		}
	
		System.out.println(str);
		

	}

}
