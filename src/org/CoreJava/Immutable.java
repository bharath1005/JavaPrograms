package org.CoreJava;

public class Immutable {
	public static void main(String[] args) {
		System.out.println("Immutable String");
		String s1="Bharath";
		String s2="Arun";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		String r = s1.concat(s2);
		System.out.println(System.identityHashCode(r));
	}

}
