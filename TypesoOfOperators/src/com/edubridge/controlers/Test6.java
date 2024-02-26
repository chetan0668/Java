package com.edubridge.controlers;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Management System");
		
		int choice=0;
		do {
			System.out.println("1.Enter Employee Name:");
			System.out.println("2.Enter Employee Designation:");
			System.out.println("3.Enter Employee Specification:");
			System.out.println("4.Exit:");
			choice=sc.nextInt();
	      
			switch (choice) 
			{
			case 1:
				System.out.println("Employee Name:");
				String name=sc.next();
				System.out.println("Employee Name:"+name);
				break;
			case 2:
				System.out.println("Employee Designation:");
				String designation=sc.next();
				System.out.println("Employee Designation:"+designation);
				break;
			case 3:
				System.out.println("Employee Specificatioin:");
				String specification=sc.next();
				System.out.println("Employee Specification:"+specification);
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Wrong Input");
				
				
			}

		
		}while(choice != 4);

	}

}
