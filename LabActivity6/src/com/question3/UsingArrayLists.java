package com.question3;
import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayLists {

	public static void main(String[] args) {
	ArrayList<String> fruitbaskets1 =new ArrayList<>();
	
	fruitbaskets1.add("Apple");
	fruitbaskets1.add("Mango");
	fruitbaskets1.add("Papaya");
	fruitbaskets1.add("Pear");
	fruitbaskets1.add("Jackfruit");
	
	ArrayList<String> fruitbaskets2 =new ArrayList<>();
	
	fruitbaskets2.add("Dragonfruit");
	fruitbaskets2.add("Grapes");
	fruitbaskets2.add("Banana");
	fruitbaskets2.add("Pomegranate");
	
	fruitbaskets1.addAll(fruitbaskets2);
	//Add all the fruits from first basket to second
	System.out.println(" elements form first basket to second is " 
	+fruitbaskets1);
	//check for a specified fruit is present in the basket.
	System.out.println("wheather Apple is present in fruitbaskets1 ? " 
	+fruitbaskets1.contains("Apple"));
	//check whether the basket is empty
   System.out.println("wheather the fruitbaskets1 is empty or not " 
   +fruitbaskets1.isEmpty());
   
   fruitbaskets1.removeAll(fruitbaskets2); 
   Collections.sort(fruitbaskets1); 
   System.out.println(fruitbaskets1);
   
   System.out.println(fruitbaskets2);
   Collections.sort(fruitbaskets2,Collections.reverseOrder()); 
   for(String s:fruitbaskets2)
   {
  	 System.out.println(s);
   }
   
   fruitbaskets1.remove(2);
   System.out.println("removing mango from 2nd postion"+fruitbaskets1); 
   
	}

}