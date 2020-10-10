package assignment4;

public class Cylinder extends Circle{
	private double height;

	   // Constructors
	   public Cylinder() {
	      super();
	      this.height = 1.0;
	   }
	   public Cylinder(double height) {
	      super();
	      this.height = height;
	   }
	   public Cylinder(double height, double radius) {
	      super(radius);
	      this.height = height;
	   }
	   public Cylinder(double height, double radius, String color) {
	      super(radius, color);
	      this.height = height;
	   }

	   // Getter and setter
	   public double getHeight() {
	      return this.height;
	   }
	   public void setHeight(double height) {
	      this.height = height;
	   }
	   
	   // return the volume of this Cylinder

	   public double getVolume() {
	      return getArea()*height;   // Use Circle's getArea() method
	   }
}
