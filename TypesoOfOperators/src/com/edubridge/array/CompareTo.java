package com.edubridge.array;

import java.util.Scanner;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String S1");
		String s1=sc.next();
		System.out.println("Enter String S2");
		String s2=sc.next();
		System.out.println("Enter String S3");
		String s3=sc.next();
		System.out.println("Enter String S4");
		String s4=sc.next();
		
		System.out.println("s1>s2:"+s1.compareTo(s2));
		System.out.println("s1>s3:"+s1.compareTo(s3));
		System.out.println("s1>s4:"+s1.compareTo(s4));
		System.out.println("s3>s1:"+s3.compareTo(s1));
		

	}

}
