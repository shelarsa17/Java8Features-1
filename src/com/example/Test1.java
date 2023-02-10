package com.example;

public class Test1 implements Test2
{

	@Override
	public void x(int a, int b) {
		System.out.println(a+b);	
	}
	
	public void multiplication(int a, int b) {
		
	}
	
	public static void main(String[] args) {
		
		
		
		Test1 test=new Test1();
		test.x(10, 20);
		
	}
	


	

}
