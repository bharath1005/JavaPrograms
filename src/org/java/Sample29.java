package org.java;

import java.io.InputStream;
import java.util.Scanner;

public class Sample29 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = sc.nextInt();
	int factorial=1;
	for (int i = 1; i <=n; i++) {
		factorial=factorial*i;
		
	}
	System.out.println(factorial);
}
}



