package assignment4;

public class class Cylinder extends Circle {
	......
	   // Override the getArea() method inherited from superclass Circle
	   @Override
	   
	   public double getArea() {
	      return 2*Math.PI*getRadius()*height + 2*super.getArea();
	   }
	   
	   public double getVolume() {
	      return super.getArea()*height;
	   }

}
