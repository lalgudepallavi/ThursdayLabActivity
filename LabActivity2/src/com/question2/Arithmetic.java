package com.question2;
//Author-pallavi lalgude
//to display arithmetic addition

package com.Question2;

	//Write your code here
	class Arithmetic{
	    public int add(int a, int b){
	        int sum = a + b; 
	        return sum;
	    }
	}

	class Adder extends Arithmetic{  
	    public int callAdd(int a, int b){
	        return add(a, b);
	    }
	}