package assignment6;

import java.util.Date;

public class Cat extends Pet implements Boardable {
	private String hairLength;
	
	private Date StartDate;
	private Date EndDate;
	
	public Cat (String petName, String ownerName, String color, String hairLength) {
		super(petName, ownerName, color);
		this.hairLength = hairLength;
	}
	
	public String getHairLength() {
		return hairLength;
	}

	public String toString() {
		return "CAT:\n" + super.toString() + "\nHair: " + getHairLength();
	}
	
	@Override
	public void setBoardStart(int month, int day, int year) {
		StartDate = new Date(year, month, day);
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		EndDate = new Date(year, month, day);
	}
	
	@Override
	public boolean boarding(int month, int day, int year) { // the boarding method
		Date boardingDate = new Date(year, month, day);
		return !(boardingDate.before(StartDate) || boardingDate.after(EndDate));
	}
	// return true if the given data is equal to or between the start and end dates
	// invert DATE before start date and after the end date ( < startdate or > enddate)
	
//	public static void main(String[] args) {
//		Cat cat = new Cat("Tom", "Bob", "Black and White", "short");
//		cat.setSex(2);
//		cat.setBoardStart(10, 1, 2020);
//		cat.setBoardEnd(12, 1, 2020);
//		
//		System.out.println(cat.toString());
//		System.out.print(cat.boarding(10, 1, 2020));
//	}
}


