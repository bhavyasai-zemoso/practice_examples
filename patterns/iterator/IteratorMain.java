package com.patterns.iterator;

public class IteratorMain {

	public static void main(String[] args) {

	      NameCollection nc = new NameCollection();
	      
	      for(Iterator iter = nc.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
	}