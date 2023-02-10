package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		
		//1
		/*System.out.println(list);
		//2
		for(Integer i:list) {
			System.out.println(i);
		}
		//
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		list.forEach(i->System.out.println(i));
		
		
		
		
	}

}
