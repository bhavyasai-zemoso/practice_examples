package com.examples.java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.IOException;
class Buffer{
public static void main(String[] args) throws IOException {

    String line = null;
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

    try {
        while ( (line = br.readLine()) != null ){
            System.out.println(line); 
        }
    }
    catch (IOException e){
        System.out.println("caught exception");
    }
}
}