package com.examples.java;
import java.io.Console; 
public class ReadConsole {
	public static void main(String[] args)  
    {     
		String name = System.console().readLine();
        System.out.println(name);
		Console c=System.console();    
		System.out.println("Enter password: ");    
		char[] ch=c.readPassword(); 
         
    } 

}