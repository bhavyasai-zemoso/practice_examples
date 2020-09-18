package com.examples.java;

public class StaticExp  
{ 
    public static void main(String[] args) 
    {
        Student.setClg("snist"); 
        Student s1 = new Student("Harry");
        Student s2 = new Student("Ron");
        System.out.println("name : " + s1.name + " rollno : " + s1.rollNo +" clg : " + s1.clgName);
        System.out.println("name : " + s2.name + " rollno : " + s2.rollNo +" clg : " + s2.clgName);
    }
}
class Student  
{ 
    String name; 
    int rollNo; 
    static String clgName;
    static void setClg(String name){ 
        clgName = name ;
    } 
    static int c = 0; 
    public Student(String name)  
    { 
        this.name = name;  
        this.rollNo = setRoll(); 
    }
    static int setRoll()
    { 
        c++; 
        return c; 
    } 
   

 }
