package com.edubridge.controlers;

import java.util.Scanner;

public class ArrayUserSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i]=sc.nextInt();
        }
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
		}
		System.out.println("the sum is:"+sum);

	}

}
