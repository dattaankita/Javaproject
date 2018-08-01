package com.stackroute.demo;
import  java.util.Scanner;

public class CheckNo1 {
	public static void main(String args[])

    {
        int sum=0;
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no");
        str= s.nextLine();
        s.close();
        
        String []arr= str.split(" ");
        
        for(int i=0;i<arr.length;i++) {
        	sum= sum + (Integer.parseInt(arr[i]));
        }
        System.out.println(sum);
    }
	}

