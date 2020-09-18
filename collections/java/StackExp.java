package com.collections.java;
 
import java.util.*; 

public class StackExp {
	static boolean isBalanced(String str) 
	{
		Stack<Character> stack = new Stack<Character>(); 
		int n=str.length();
		for (int i = 0; i < n; i++) { 
			char x = str.charAt(i);
			if (x == '(' || x == '{') {
				stack.push(x); 
				continue; 
			}
			if (stack.isEmpty()) 
				return false;
			if(x==')') {
				stack.pop(); 
				if (x == '{') 
					return false; 
				}

				else if(x=='}') {
				stack.pop(); 
				if (x == '(') 
					return false;	
		}
		}
		return (stack.isEmpty()); 
	
	}

	
	public static void main(String[] args) 
	{ 
		String str = "({})"; 
		if (isBalanced(str)) 
			System.out.println("yes"); 
		else
			System.out.println("no"); 
	} 
} 
