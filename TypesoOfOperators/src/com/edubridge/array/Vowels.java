package com.edubridge.array;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the string:");
		String str=sc.next();
		System.out.println("The string is:"+str);
		int vcount=0, ccount=0;
		
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				vcount++;
			}
			else {
				ccount++;
			}
		}
		System.out.println(vcount);
		System.out.println(ccount);

	}

}
