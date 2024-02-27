package com.edubridge.array;

import java.util.Scanner;

class Employee8 {
	String name;
	int id;
	String location;
	void disp(String n, int id, String loc) {
		name=n;
		id = id;
		location= loc;
		System.out.println("Employee8 name:"+n+"\nEmployee8 Id:"+id+"\nEmployee8 location:"+loc);
	}
	
}
public class UserStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee8 s1=new Employee8();
		System.out.println("enter name:");
		String n=sc.next();
		System.out.println("enter id:");
		int id=sc.nextInt();
		System.out.println("enter location:");
		String loc=sc.next();
		s1.disp(n,id,loc);
		
		

	}

}
