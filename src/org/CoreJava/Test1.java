package org.CoreJava;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(1001);
		a.add(1000);
		a.add(1231);
		a.add(1,102340);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
			
		}
		
	}

}
