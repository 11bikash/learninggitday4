package com.acc.lkm.collection;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList <String>ar=new ArrayList<String>();
		LinkedList<String>ar=new LinkedList<String>();
		ar.add("Ankit");
		ar.add("Sunanda");
		ar.add("Abhishek");
	System.out.println("Array List current is :"+ar);
	ar.add(2,"Amit");
	System.out.println("New list is:"+ar);
	ArrayList<String>ar2=new ArrayList<String>();
	ar2.add("Trainer1");
	ar2.add("Trainer2");
	System.out.println("2nd ArrayList is:"+ar2);
	ar.addAll(ar2);
	System.out.println("Updated List is"+ar);
	ar.remove(5);
	System.out.println("After removal:"+ar);
	ar.removeIf(str->str.contains("Amit"));
	System.out.println("New Updated List:"+ar);
	ar.clear();
	System.out.println(ar);
	
	/*	Iterator<String>itr=ar.iterator();
		/*while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		/*for(String str:ar) {
			System.out.println(str);
		}
*/
	}

}
