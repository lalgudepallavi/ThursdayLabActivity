package com.program;
import java.util.Scanner;
// program for print first and last digit
public class Program1 {

	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the  number: ");
		        int num = sc.nextInt();
		        
		        int first = num;
		        while (first >= 10) {
		            first /= 10;
		        }
		        int last = num % 10;
		        System.out.println("First digit: " + first);
		        System.out.println("Last digit: " + last);
		    }
		

	

}