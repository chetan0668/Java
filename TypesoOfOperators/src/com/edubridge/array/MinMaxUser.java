package com.edubridge.array;

import java.util.Scanner;

public class MinMaxUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("enter elements: ");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    	
	    	
	    }
	    
		int max=arr[0];
		int min=arr[0];
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max= arr[i];
				
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum is:"+max);
		System.out.println("Minimum is:"+min);



	}

}
