package com.edubridge.controlers;

import java.util.Scanner;

public class MenuDrivenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("STUDENTS MANAGEMENT SYSTEM");
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1.Students Info:");
			System.out.println("2.Students Course Rating:");
			System.out.println("3.Students Eligibility:");
			System.out.println("4.Exit:");
			System.out.println("Enter Choice:");
			choice = sc.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.println("Students Name:");
				String name=sc.next();
				System.out.println("Students Age:");
				int age=sc.nextInt();
				System.out.println("Students Address:");
				String address=sc.next();
				System.out.println("Students Name:"+name+"\nStudents Age:"+age+"\nStudents Address:"+address);
				break;
			case 2:
				System.out.println("Enter your Course Ratings:");
				double rating=sc.nextDouble();
				if(rating>=4) {
					System.out.println("Good Going");
					
				}
				else {
					System.out.println("Need to Improve");
					
				}
				break;
			case 3:
				System.out.println("Enter your Score");
				int score=sc.nextInt();
				if(score>=50) {
					System.out.println("Student is Eligible ");
				}
				else {
					System.out.println("Not Eligible");
				}
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
