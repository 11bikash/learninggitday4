package com.acc.lkm.SetDemo;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedHashSet<String>hashset=new LinkedHashSet<String>();
   hashset.add("Accenture");
   hashset.add("Java");
   hashset.add("Java");
   hashset.add("SAP");
   hashset.add("Salesforce");
   hashset.add(null);
   Iterator<String>itr=hashset.iterator();
   while(itr.hasNext()) {
	   System.out.println(itr.next());
   }
	}

}
