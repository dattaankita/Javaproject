package com.stackroute.demo;
import  java.util.Scanner;
public class checkNo {
	public static void main(String args[])

    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        n = s.nextInt();
        s.close();
        
        if(n<30 && n>20) {
        	 if(n%2 !=0)
        		 System.out.println("Tom");
        	 else
        		 System.out.println("Jerry");
        	
        }
        else
        	System.out.println("Invalid input");
    }
}
