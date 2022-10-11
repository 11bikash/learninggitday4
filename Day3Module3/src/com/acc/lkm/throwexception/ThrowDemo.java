package com.acc.lkm.throwexception;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
public class ThrowDemo extends Exception {
	public ThrowDemo(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	static long Acess,Asset;
	//static long Asset_ID,long Access_ID;
static void validation(String ch)throws ThrowDemo {
	//long Asset_ID,long Access_ID;
	Scanner scan=new Scanner(System.in);
	//String ch;
	System.out.println("Enter the AssetDetails:");
	long Asset=scan.nextLong();
	System.out.println("Enter the AccessDetails::");
	long Acess=scan.nextLong();
	//System.out.println("Enter the status:");
	//ch=scan.next();
	
	if(ch=="Y") {
		
		details();
		//throw new ArithmeticException("Valid");
		throw new ThrowDemo("Valid");
		//System.out.println(Asset +"\n"+Acess);
	}
	else {
		//throw new NullPointerException("Not valid");
		System.out.println("Not Valid");
	}
}
static void details() {
	System.out.println(Asset +"\n"+Acess);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		validation("N");
	}catch(Exception e) {
		System.out.println("Encountered");
	}
	}

}
