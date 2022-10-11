package com.acc.lkm.QueueDemo;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
public class Queue1Demo {

	public static void main(String[] args) {
	//BlockingDeque<String>queue=(BlockingDeque<String>) new ArrayBlockingQueue<String>(3);
	BlockingQueue<String>queue=new ArrayBlockingQueue<>(3);
	/*	System.out.println(queue.add("Ravi"));
	System.out.println(queue.add("Kishan"));
	System.out.println(queue.add("Sunita"));
	System.out.println(queue);
	System.out.println(queue.add("New"));
	System.out.println(queue);
*/
	queue.offer("Ravi");
	queue.add("Kishan");
	queue.add("Sunita");
	System.out.println(queue);
	System.out.println(queue.peek());
	System.out.println(queue.peek());
	System.out.println(queue.peek());
	System.out.println(queue);
	queue.clear();
	System.out.println(queue.peek());
	
	}

}
