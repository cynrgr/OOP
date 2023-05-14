package ClassPack;

public class Circle {
	private double radius = 0;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		
		double area = 3.14 * (radius * radius);
		return area;
	}
	
	public double calculateCircumference() {
		double circumference = 2 * (3.14 * radius);
		return circumference;
	}
}
