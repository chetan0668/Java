package com.edubridge.controlers;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("0");
			}
			System.out.println();
			
		}
		

	}

}
