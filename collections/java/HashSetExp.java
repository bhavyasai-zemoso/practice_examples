package com.collections.java;
import java.util.*;
public class HashSetExp {
    public static void main(String args[]) {
        HashSet < String > hs = new HashSet < String > ();
        hs.add("Harry");
        hs.add("Potter");
        hs.add("Potter");
        Iterator <String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}