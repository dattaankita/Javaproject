package com.stackroute.demo;
import  java.util.Scanner;

public class Checkno2 {
	int m=30;
	void Guess() {
		
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no");
        int n= s.nextInt();
        
        
       if(n>m) {
            System.out.println( "Number guessed is more than original number");
            Guess();
       }
        else if(n<m)  {
        	System.out.println("Number guessed is less than original number");
        	Guess();
        }
        else     
        	System.out.println("Number guessed matches the original number");
       s.close();
	}
	public static void main(String args[])

    {
		Checkno2 g= new Checkno2();
		g.Guess();
         }
}
