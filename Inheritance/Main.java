package oop;

import java.util.Scanner;
import ClassPack.*;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length: ");
	double haba = sc.nextDouble();
	
	System.out.println("Enter width: ");
	double lapad = sc.nextDouble();
	
	System.out.println("Enter height");
	double taas = sc.nextDouble();
	sc.close();
	
	Box myBox = new Box(haba, lapad, taas);
	
	System.out.println("The area of the rectangle is " + myBox.getArea());
	System.out.println("The volume of the box is " + myBox.getVolume());

	}

}
