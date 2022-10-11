package com.acc.lkm.SetDemo;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeSet<String>accenture=new TreeSet<>();
    accenture.add("Blockchain");
    accenture.add("IOT");
    accenture.add("Metaverse");
   /* NavigableSet<String>reverse=accenture.descendingSet();
    Iterator<String>iterator=reverse.iterator();
    while(iterator.hasNext()) {
    	System.out.println(iterator.next());
    }
    
    */
    System.out.println(accenture.pollLast());
    System.out.println(accenture);
    System.out.println(accenture.pollFirst());
    System.out.println(accenture);
	}

}
