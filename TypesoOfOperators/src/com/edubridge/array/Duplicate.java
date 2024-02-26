package com.edubridge.array;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,20,30,40,40,50,50,60};
		int length = arr.length;
		int j=0;
		for(int i=0;i<length-1;i++){
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
				
			}
		}
		arr[j++]=arr[length-1];
		for(int k=0;k<j;k++) {
			System.out.println(arr[k]);
		}
				

	}

}
