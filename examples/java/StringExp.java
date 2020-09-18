package com.examples.java;
 
import java.io.*; 
import java.util.*; 
  
public class StringExp { 
    public static void main(String[] args) 
    { 
        String str = "Harry Potter";
        StringBuffer sbr = new StringBuffer(str); 
        StringBuilder sbb = new StringBuilder(str);
        System.out.println(sbr.reverse());  
        System.out.println(sbb.reverse()); 
        
        List<Character> list = new ArrayList<>(); 
        
        for (int i=0;i<str.length();i++) 
            list.add(str.charAt(i)); 
  
        Collections.reverse(list); 
        Iterator li = list.listIterator(); 
        while (li.hasNext()) 
            System.out.print(li.next()); 
    }

	}
