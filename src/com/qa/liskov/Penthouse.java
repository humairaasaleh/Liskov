package com.qa.liskov;

public class Penthouse {

	private int sqaureFootage;
	private int numberOfBedrooms;

//	Constructors
	public Penthouse(int sqaureFootage, int numberOfBedrooms) {
		super();
		this.sqaureFootage = sqaureFootage;
		this.numberOfBedrooms = numberOfBedrooms;

	}

	public Penthouse() {
		super();
		this.setNumberOfBedrooms(4);
	}

//	Getters and Setters

	public int getSqaureFootage() {
		return sqaureFootage;
	}

	public void setSqaureFootage(int sqaureFootage) {
		this.sqaureFootage = sqaureFootage;
	}

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
	

}
