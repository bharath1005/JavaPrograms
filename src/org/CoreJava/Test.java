package org.CoreJava;

import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
	ArrayList<Integer>a=new ArrayList<Integer>();
	a.add(100);
	a.add(1000);
	a.add(1212);
	a.add(1234);
    a.remove(0);
    for (int i = 0; i < a.size(); i++) {
    	System.out.println(a.get(i));
		
	}
}
}
