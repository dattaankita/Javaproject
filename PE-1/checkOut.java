package com.stackroute.demo;
import  java.util.Scanner;

public class checkOut {
	public static void main(String args[])

    {
        String w;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter word:");
        w=s.next(); 
        System.out.println("Enter no:");
        int n= s.nextInt();
        s.close();
        
        System.out.print(w);
        
         for(int i=0;i<n;i++) {
        	for(int j=w.length()-n;j<w.length();j++) {
        		System.out.print(w.charAt(j));
        	}
        }
    }
}
