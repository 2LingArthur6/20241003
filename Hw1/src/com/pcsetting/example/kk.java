package com.pcsetting.example;

public class kk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("Various operations on num1 and num2 : ");
		System.out.println("num1+num2=" +(num1+num2));
		System.out.println("num1-num2=" +(num1-num2));
		System.out.println("num1*num2=" +(num1*num2));
		System.out.println("num1/num2=" +(num1/num2));
		System.out.println("num1%num2=" +(num1%num2));
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		b = a++;
		c = ++a;
		
		System.out.println("Because it is incremented after the specified value, the value of b is " +b);
		System.out.println("Because the value is specified after incrementing, the value of c is " +c);
		
	}

}
