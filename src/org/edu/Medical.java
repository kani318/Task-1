package org.edu;

public class Medical extends Engineering {
	public void physiyo() {
		System.out.println("Artho");
		
	}
	public void dental() {
		System.out.println("Dental");
		
	}
	public void mbbs() {
		System.out.println("Mbbs");
		
	}
	public static void main (String[]arg) {
		Medical obj=new Medical();
		obj.physiyo();
		obj.dental();
		obj.mbbs();
		obj.bE();
		obj.bTech();
		obj.bA();
		obj.bBA();
		obj.bEd();
		obj.bsc();
		obj.ug();
		obj.pg();
	}

}
