package com.acc.lkm.Stackdemo;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stack<Integer>stack=new Stack<Integer>();
   System.out.println(stack.isEmpty());
   stack.push(50);
   stack.push(100);
   stack.push(150);
   System.out.println(stack);
   System.out.println(stack.pop());
   System.out.println(stack);
   int index=stack.search(100);
   System.out.println(index);
   System.out.println(stack.isEmpty());
	}

}
