package com.acc.lkm.exceptionhandling;
import java.util.Scanner;
public class ExceptionHandlingDFemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
			int[] a=new int[5];
			a[6]=100; 
			System.out.println(a);
			System.out.println("Enter the name:");
			String str=scan.next();
			int x=Integer.valueOf(str);
			System.out.println(x);
		}
		catch(NumberFormatException e) {
			System.out.println("Welcome");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Java");
		}

	}

}
