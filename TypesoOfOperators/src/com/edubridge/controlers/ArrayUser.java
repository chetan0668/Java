package com.edubridge.controlers;

import java.util.Scanner;

public class ArrayUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Elements of Array");
		int element=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("array element:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}

	}

}
