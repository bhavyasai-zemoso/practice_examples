package com.examples.java;
import java.util.Scanner;
import java.io.*;
public class ReadInput {
	   public static void main(String args[]) throws IOException{ 
	         Scanner sc = new Scanner(System.in);
	         int num=sc.nextInt();
	         String nl = sc.nextLine(); 
	         System.out.printf("Using nextLine() " +num+nl);
	         String n = sc.next(); 
	         System.out.printf("Using next() " +num+n);
	         
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	         int num1 = Integer.parseInt(br.readLine());
	         String c = br.readLine(); 
	         System.out.printf("Using readLine() " +c); 
	        }
}
