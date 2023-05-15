package ClassPack;

public class Triangle extends Shape {

	public Triangle(double height, double width) {
		super(height, width);
		
	}
	
	public double triArea() {
		double triArea = (this.getHeight()*this.getWidth()) / 2;
		return triArea;
	}

}
