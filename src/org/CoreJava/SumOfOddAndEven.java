package org.CoreJava;

public class SumOfOddAndEven {
public static void main(String[] args) {
	System.out.println("Enter the Number");
    int count=0;
    for (int i = 1; i <=10 ; i++) {
    	if (i%2==1) {
			count=count+i;
		}
		System.out.println(count);
	}



}
}
