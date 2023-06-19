package com.jayshree;

public class Expression {
	
	

	public static void missingDigit(String xp)
	{
		
		int res = 0;
		char result = ' ';
		String x;
		
		 // Split the expression to
	    // extract operands, operator
	    // and resultant
	    String exp[] = xp.split(" ");
	 
	    String first_operand = exp[0];
	    String operator = exp[1];
	    String second_operand = exp[2];
	    String resultant = exp[exp.length-1];

	    int fn=0,sn=0;
	    // If x is present in resultant
	    if(resultant.indexOf("x") != -1){
	    	System.out.println("if");
	        x = resultant;
	        fn = Integer.parseInt(first_operand);
	        sn = Integer.parseInt(second_operand);
	 
	        if(operator.equals("+"))
	            res = fn+sn;
	        else if(operator.equals("-"))
	            res =fn+sn;
	        else if(operator.equals( "*"))
	            res = fn+sn;
	        else
	            res = (int) Math.floor(fn/sn);
	    }
	 
	     // If x in present in operands
	    else{
	 
	     res = Integer.parseInt(resultant);
	 
	        // If x in the first operand
	        if(first_operand.indexOf("x") != -1)
	        {
	            x = first_operand;
	            sn = Integer.parseInt(second_operand);
	 
	            if(operator.equals("+"))
	                res = res - sn;
	            else if(operator.equals("=="))
	                res = res + sn;
	            else if(operator.equals("*"))
	                res = (int) Math.floor(res / sn);
	            else
	                res = res * sn;
	        }
	 
	        // If x is in the second operand
	        else{
	 
	           x = second_operand;
	            fn = Integer.parseInt(first_operand);
	 
	            if(operator.equals("+"))
	                res = res-fn;
	            else if(operator.equals("-"))
	                res = fn - res;
	            else if(operator.equals("*"))
	                res = (int) Math.floor(res / fn);
	            else
	                res = (int) Math.floor(fn / res);
	        }
	    }
	    System.out.println(res);
	    System.out.println(fn);
	    System.out.println(sn);
	    System.out.println(x);
	
	   
	    int  k = 0;
	    String s=String.valueOf(res);
	   for(int i=0; i<x.length();i++)
	   {
		   
		   if(x.charAt(i)=='x')
		   {
			   result=s.charAt(k);
			   break;
		   }
		   else
			   k=k+1;
	   }

	  System.out.println(result);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		missingDigit("3x + 12 = 46");
		missingDigit("4x + 10 = 52");
		missingDigit("55 + 9x = 108");

	}

}
