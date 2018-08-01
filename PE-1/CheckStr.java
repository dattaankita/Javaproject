package com.stackroute.demo;
import  java.util.Scanner;

public class CheckStr {
	public static void main(String args[])

    {
        String w;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter word:");
        w=s.next(); 
        s.close();
        
        for(int i=w.length()-1; i>=0 ;i--) {
        	
        		System.out.print(w.charAt(i));
        }	
        
    }
}
