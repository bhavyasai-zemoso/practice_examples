package com.collections.java;
import java.util.*;
public class HashMapExp {
	    public static void main(String args[]) {
	    	HashMap <Student,String> m = new HashMap <Student,String>();
	        Student s = new Student("Harry");
	        m.put(s,s.getName());
	        System.out.println("Student is " + m.get(s));
	        
	    }
}
