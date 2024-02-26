package com.edubridge.controlers;
import java.util.Scanner;
public class ArithematicSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = sc.nextInt();
		System.out.println("Enter number b");
		int b = sc.nextInt();
		System.out.println("Enter your operator");
		int operator = sc.nextInt();
		switch(operator) 
		{
		case 1:
			System.out.println("The Addition is:"+(a+b));
			break;
		case 2:
			System.out.println("The Substraction is:"+(a-b));
			break;
		case 3:
			System.out.println("The Multiplication is:"+(a*b));
			break;
		case 4:
			System.out.println("The Division is:"+(a/b));
			break;
		default:
			System.out.println("Wrong choice");
		}
		
	}

}
