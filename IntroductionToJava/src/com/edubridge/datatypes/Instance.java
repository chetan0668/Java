package com.edubridge.datatypes;

public class Instance {
	int id = 101;
	static int i = 500;
	static String name = "Chetan";
	
	void disp() {
		String CompanyName = "Infosys";
		System.out.println(CompanyName);
	}
	
	void show() {
		System.out.println(id);
		
	}

	public static void main(String[] args) {
		Instance I1 = new Instance ();
		I1.disp();
		I1.show();
		System.out.println(Instance.i);
		System.out.println(Instance.name);
		
	}

}
