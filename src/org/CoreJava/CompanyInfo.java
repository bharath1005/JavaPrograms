package org.CoreJava;

public class CompanyInfo {
	public void companyName() {
    System.out.println("GreensTechnology");
	}
	public void companyAddress() {
    System.out.println("Omr");
    }
	public void companyID() {
    System.out.println("1001");
	}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName();
		c.companyID();
		c.companyAddress();
	}
	

}
