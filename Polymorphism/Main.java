import ClassPack.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter height: ");
		double height = sc.nextDouble();
		
		System.out.println("Enter width: ");
		double width = sc.nextDouble();
		
		Shape myShape = new Shape(height, width);
		
		System.out.println("Press 1 to compute rectangle area. \nPress 2 to compute triangle area.");
		int input = sc.nextInt();
		
		switch(input) {
			case 1:
				Rectangle myRect = new Rectangle(height, width);
				System.out.println("The area of the rectangle is " + myRect.rectArea());
				break;
			case 2:
				Triangle myTri = new Triangle(height, width);
				System.out.println("The area of the triangle is " + myTri.triArea());
				break;
			default:
				System.out.println("Invalid input.");
		}

	}

}
