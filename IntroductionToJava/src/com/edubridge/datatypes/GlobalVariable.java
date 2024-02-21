package com.edubridge.datatypes;

public class GlobalVariable {
	String ename ="Chetan";
	void Info1() {
		int empid = 101;
		System.out.println(ename+" "+empid);	
	}
	void Info2() {
		String empdesignation = "Java Developer";
		System.out.println(ename+" "+empdesignation);
	}
	public static void main(String[] args) {
		GlobalVariable G1 = new GlobalVariable();
		G1.Info1();
		G1.Info2();
		
		
	}

}
