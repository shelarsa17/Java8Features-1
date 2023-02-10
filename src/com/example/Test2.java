package com.example;

@FunctionalInterface
public interface Test2 {

	 public void x(int a, int b);
	 
	 
	 //1.8
	 public static void y(int a) {
		 System.out.println(a);
	 }
	 
	 default void x2(int a, int b, int c){
		 System.out.println(a+b+c);
	 }
	 
	 
	/* //1.9
	 
	 private void r(String name) {
		 System.out.println(name);
	 }*/
	 
}
