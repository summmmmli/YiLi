package assignment6;

public class Pet {
	private String petName;
	private String ownerName;
	private String color;
	protected String sex;
	public static final int MALE = 0, FEMALE = 1, SPAYED = 2 , NEUTERED = 3;
	
	public Pet() {	
	}
	public Pet (String petName, String ownerName, String color) {
		this.petName = petName;
		this.ownerName = ownerName;
		this.color = color;
	} // Constructor
	
	public String getPetName() {
		return petName;
	} 
	public String getOwnerName() {
		return ownerName;
	} 
	public String getColor(){
		return color;
	} 
	
	public void setSex(int sexid){
		switch(sexid){
		case MALE: sex="Male"; break;
		case FEMALE: sex="Female"; break;
		case SPAYED: sex="Spayed"; break;
		case NEUTERED: sex="Neutered"; break;
		}
	} 
	
	public String getSex(){
		return sex;
	} 
	public String toString(){
		return getPetName() + " Owned by " + getOwnerName() + 
				"\nColor: " + color + "\nSex: " + getSex();
	}
	
//	public static void main(String[] args)
//    {
//		Pet pet = new Pet("Spot", "Mary", "Black and White");
//		pet.setSex(0);
//		System.out.println(pet.toString());
//    }

}
