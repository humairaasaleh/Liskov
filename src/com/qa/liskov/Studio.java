package com.qa.liskov;

public class Studio {
	private int sqaureFootage;
	private int numberOfBedrooms;

	public Studio(int sqaureFootage, int numberOfBedrooms) {
		super();
		this.sqaureFootage = sqaureFootage;
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public Studio() {
		super();
		this.setNumberOfBedrooms(0);
	}

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
