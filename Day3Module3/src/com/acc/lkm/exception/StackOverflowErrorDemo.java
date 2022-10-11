package com.acc.lkm.exception;

public class StackOverflowErrorDemo {
static int p=0;
public static int printno(int m) {
	p=p+2;
	System.out.println(p);
	return p+printno(p+2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printno(p);

	}

}
