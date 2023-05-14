package oop;

import java.util.Scanner;
import ClassPack.*;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		MACHINE PROB #1
//		System.out.println("Enter name: ");
//		String pangalan = sc.nextLine();
//		
//		System.out.println("Enter age: ");
//		int edad = sc.nextInt();
//		Tao objTao = new Tao(pangalan, edad);
//		
//		System.out.println(objTao.getPangalan() + " is " + objTao.getEdad() + " years old.");
		
		
//		MACHINE PROB #2
//		System.out.println("Enter animal's type: ");
//		String type = sc.nextLine();
//		
//		System.out.println("Enter animal's name: ");
//		String name = sc.nextLine();
//		
//		System.out.println("Enter animal's breed: ");
//		String breed = sc.nextLine();
//		Animal objAnimal = new Animal(type, name, breed);
//		
//		System.out.println("My animal is a " + objAnimal.getType() + ". Its name is " + objAnimal.getName() + ". And its a " + objAnimal.getBreed());
//		
		
//		MACHINE PROB #3
//		Employee objEmployee = new Employee();
//		System.out.println("Enter name: ");
//		objEmployee.setName(sc.nextLine());
//		
//		System.out.println("Enter job title: ");
//		objEmployee.setJobTitle(sc.nextLine());
//		
//		System.out.println("Enter number of attendance: ");
//		objEmployee.setNumOfAttendance(sc.nextInt());
//		
//		System.out.println("Enter salary: ");
//		objEmployee.setSalary(sc.nextDouble());
//		
//		
//		System.out.println("Name: " + objEmployee.getName() + "\n" + "Job Title: " + objEmployee.getJobTitle() + "\n" + "Number of Attendance: " + objEmployee.getNumOfAttendance() 
//				+ "\n" + "Salary: " + objEmployee.getSalary() + "\n" + "Updated salary: " + objEmployee.Computation());
		
		
//		MACHINE PROB #4
//		Circle objCircle = new Circle();
//		System.out.println("Enter radius: ");
//		objCircle.setRadius(sc.nextDouble());		
//		System.out.println("The area and circumference of a circle with " + objCircle.getRadius() + " radius is: " + "\n" +
//				"Area: " + objCircle.calculateArea() + "\n" + "Circumference: " + objCircle.calculateCircumference());
	
		
//		MACHINE PROB #5
		TrafficLight objTrafficLight =  new TrafficLight();
		System.out.println("Enter color for the traffic light: ");
		objTrafficLight.setColor(sc.nextLine());
		System.out.println("The color of the traffic light is " + objTrafficLight.getColor() + ". Its indicated sign is ");
		objTrafficLight.change();
		
	}

}
