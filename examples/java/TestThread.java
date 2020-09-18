package com.examples.java;

public class TestThread {
	   public static void main(String args[]) {
	      ThreadExp T1 = new ThreadExp("Thread1");
	      T1.start(); 
	      ThreadExp T2 = new ThreadExp("Thread2");
	      T2.start();
	} 
}
	class ThreadExp extends Thread {
		   Thread t;
		   String new_thread;
		   ThreadExp(String name) {
		      this.new_thread = name;
		   }
		   
		   public void run() {
		      try {
		         for(int i = 1; i<=2; i++) {
		            System.out.println("Thread: " + new_thread + ", " + i);
		            Thread.sleep(2000);
		         }
		      } catch (Exception e) {
		         System.out.println("exception");
		      }
		   }
		   
		   public void start () {
		      if (t == null) {
		         t = new Thread (this, new_thread);
		         t.start ();
		      }
		   }
		}


	
