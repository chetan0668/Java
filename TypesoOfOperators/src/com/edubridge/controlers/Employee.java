package com.edubridge.controlers;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Employee Id:");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name:");
		String name  = sc.next();
		System.out.println("Enter Employee Address:");
		String address = sc.next();
		System.out.println("Enter Employee Designation:");
		String designation = sc.next();
		System.out.println("Enter Employee Salary:");
		int salary = sc.nextInt();
		System.out.println("Employee Id:"+id+"\nEmployee Name:"+name+"\nEmployee Address:"+address+"\nEmployee Designation:"+designation+"\nEmployee Salary:"+salary);
		


	}

}
