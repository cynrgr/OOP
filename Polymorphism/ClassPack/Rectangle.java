package ClassPack;

public class Rectangle extends Shape {

	public Rectangle(double height, double width) {
		super(height, width);
		
	}
	
	public double rectArea() {
		double rectArea = this.getHeight() * this.getWidth();
		return rectArea;
	}

}
