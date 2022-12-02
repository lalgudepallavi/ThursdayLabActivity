package com.question1;

//Author : pallavi lalgude
//code to display highstplacement in college

import java.util.Scanner;

public class Highplacement {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a, b, c, largest, temp,eql;  
		//object of the Scanner class  
		Scanner sc = new Scanner(System.in);  
		//reading input from the user  
		System.out.println("Enter the placements of CSE:");  
		a = sc.nextInt();  
		System.out.println("Enter the placements of IT:");  
		b = sc.nextInt();  
		System.out.println("Enter the placements of MECT:");  
		c = sc.nextInt();  
		//comparing a and b and storing the largest placement23 in a temp variable  
		temp=a>b?a:b;  
		//comparing the temp variable with c and storing the result in the variable  
		largest=c>temp?c:temp;  	
		//prints the largest number  
		System.out.println("The largest placement is: "+largest); 
		//if placementys are same CBE and IT
		if(a==b ) 
		{
			System.out.println("placements of CSB and IT is same");
			
		}
		//if placementys are same MECT and IT
		else if (b==c) 
		{
			System.out.println("placements of IT and MECT is same");
		
	    }
		//if placementys are same MECT and IT
		else if(a==c ) 
		{
			System.out.println("placements of CSB and MECT is same");
		
	    }else
	    {
	    	
	    }
		
	}

	}


