package com.edubridge.array;
class School{
	String name;
	int id;
	void disp(String n,int a) {
		name=n;
		id=a;
		System.out.println("schooolname:"+name+"\nschool id  :"+id);
	}
	
}
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s1=new School();
		s1.disp("srv", 152);
		s1.disp("pvg", 101);
		s1.disp("sdv", 145);

	}

}
