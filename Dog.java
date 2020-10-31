package assignment6;

import java.util.Date;

public class Dog extends Pet implements Boardable {
	private String size;
	
	private Date StartDate;
	private Date EndDate;
	
	public Dog (String petName, String ownerName, String color, String size) {
		super(petName, ownerName, color);
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}
	
	public String toString(){
		return "DOG:\n" + super.toString() + "\nSize: "+getSize();
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
//		Dog dog = new Dog("Spot","Susan","white","medium");
//		dog.setSex(2);
//		dog.setBoardStart(10, 1, 2020);
//		dog.setBoardEnd(12, 1, 2020);
//		
//		System.out.println(dog.toString());
//		System.out.print(dog.boarding(1, 1, 2020));
//    }
}