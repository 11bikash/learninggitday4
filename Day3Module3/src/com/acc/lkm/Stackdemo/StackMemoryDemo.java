package com.acc.lkm.Stackdemo;

public class StackMemoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		Object obj=new Object();
		StackMemoryDemo stack=new StackMemoryDemo();
		stack.disp(obj);

	}

	private void disp(Object param) {
		// TODO Auto-generated method stub
		String str=param.toString();
		System.out.println(str);
	}

}
