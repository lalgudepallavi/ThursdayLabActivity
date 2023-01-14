package com.quetion1;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {

	public static void main(String[] args) {
		ArrayList<UsingComparable> al=new ArrayList<UsingComparable>();  
		
		al.add(new UsingComparable (101,19,"pankaj",67000) );
		al.add(new UsingComparable (102,29,"rahul",6000) );
		al.add(new UsingComparable (103,21,"nikhil",38500) );
		al.add(new UsingComparable (104,25,"Abhay",11900) );
		
		
		Collections.sort(al);  
		for(UsingComparable st:al){ 
		
			System.out.println(st.id+" "+st.age+" "+st.name+" "+st.Salary);
		
		
		

	}

}
}