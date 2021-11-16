package com.qa.liskov;

public class Runner {
	
	public static void main(String[] args) {
		BedroomAdder ba = new BedroomAdder();
		Penthouse p = new Penthouse();
		Studio s = new Studio();
		
		ba.addBedroom(p, 2);
		System.out.println(p.getNumberOfBedrooms());
		
		s.setSqaureFootage(100);
		ba.addSquareFootage(s, 50);
		System.out.println(s.getSqaureFootage());
	}

}
