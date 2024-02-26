package com.edubridge.controlers;

import java.util.Scanner;

public class Text2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter number for Table");
		int number = sc.nextInt();
		int i=1;
		while(i<=10){
			System.out.println(number+"x"+i+"="+number*i);
			i++;
		}
	}

}
