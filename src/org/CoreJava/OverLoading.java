package org.CoreJava;

public class OverLoading {
	public void employeeID(int id) {
	}
	public void employeeID(String name) {
	}
	public void employeeID(String email,int phonenumber) {
	}
	public void employeeID(int dob,String Add) {
	}
	public static void main(String[] args) {
		OverLoading o=new OverLoading();	
	}
	
}	


