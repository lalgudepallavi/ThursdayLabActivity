package com.question2;
import java.util.Map;
import java.util.TreeMap;

public class UsingTreemap {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> tmap=new TreeMap<>();

		for(int i=1;i<=20;i++)
		{
			tmap.put(i, i*i);
		}
		for(Map.Entry e:tmap.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());		
		}
		TreeMap<Integer,Integer> map1=new TreeMap<>();
		System.out.println("-----------------------------------------");
		map1.putAll(tmap);			
		System.out.println(map1);
		System.out.println("-----------------------------------------");
		
		System.out.println("To  search for a specific key :"+tmap.containsKey(5));			
		System.out.println("To search a specific value in key: "+tmap.containsValue(1));		
		System.out.println("-----------------------------------------");
		System.out.println("To find greatest key "+tmap.higherKey(19));			//greatest key less than or equal to the given key.
		
		System.out.println(tmap.pollFirstEntry());			
		System.out.println(tmap.pollLastEntry());			
		System.out.println(tmap);
		
	}

}