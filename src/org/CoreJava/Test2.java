package org.CoreJava;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(123);
		a.add(1234);
		a.add(12345);
		a.add(7412);
		boolean b1 = a.contains(1234);
		System.out.println(b1);
		boolean b2 = a.contains(7412);
		System.out.println(b2);
	}

}
