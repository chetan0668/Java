package com.edubridge.array;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder s=new StringBuilder();
		System.out.println("Enter First Name:");
		String fname=sc.next();
		s.append(fname);
		System.out.println("Enter Last Name:");
		String lname=sc.next();
		s.append(lname);
		System.out.println("Enter Middle Name:");
		String mname=sc.next();
		s.insert(6," "+mname+" ");
		System.out.println(s);
		s.delete(16,25);
		System.out.println(s);
		s.reverse();
		System.out.println(s);


	}

}
