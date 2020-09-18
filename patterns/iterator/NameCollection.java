package com.patterns.iterator;
import java.util.List;
import java.util.ArrayList;
public class NameCollection implements Container{

	   public static ArrayList<String> list=new ArrayList<String>();
	   static {
		   list.add("Harry");
		   list.add("Hermoine");
		   list.add("Ron");
	   }
	   @Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }
	   private class NameIterator implements Iterator {

		      int index;

		      @Override
		      public boolean hasNext() {
		      
		         if(index < list.size()){
		            return true;
		         }
		         return false;
		      }

		      @Override
		      public Object next() {
		      
		         if(this.hasNext()){
		            return list.get(index++);
		         }
		         return null;
		      }		
		   }
}