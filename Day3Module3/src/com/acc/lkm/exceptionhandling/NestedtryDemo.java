package com.acc.lkm.exceptionhandling;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NestedtryDemo {
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
			//FileReader f=new FileReader("acc.txt");
		try {
			System.out.println("Enter the number:");
			int x=scan.nextInt();
			int b=x/0;
			System.out.println(b);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exc handled");
		}
		try {
			//System.out.println("enter the company:");
			String company="Accenture";
			System.out.println(company.length());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Null handled");
		}
     finally {
    	 System.out.println("finally block executed");
     }
	}catch(Exception e) {
		System.out.println(e);
	}

}
}