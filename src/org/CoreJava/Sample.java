package org.CoreJava;

public class Sample {
public static void main(String[] args) {
	StringBuffer x1=new StringBuffer();
	StringBuffer x2=new StringBuffer();
	System.out.println(System.identityHashCode(x1));
	System.out.println(System.identityHashCode(x2));
	StringBuffer a = x1.append(x2);
	System.out.println(System.identityHashCode(a));
}
}
