package com.edubridge.array;

import java.util.Scanner;

public class UserPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your username");
		String uname=sc.next();
		System.out.println("enter your password");
		String pass=sc.next();
		if (uname.equals("admin") && pass.equals("admin")) {
			System.out.println("logged in");
		}
		else {
			System.out.println("wrong input");
		}

	}

}
