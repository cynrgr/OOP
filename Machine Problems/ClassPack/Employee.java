package ClassPack;

public class Employee {
	private String name = "";
	private String jobTitle = "";
	private int numOfAttendance = 0;
	private double salary = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getNumOfAttendance() {
		return numOfAttendance;
	}
	public void setNumOfAttendance(int numOfAttendance) {
		this.numOfAttendance = numOfAttendance;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double Computation() {
		double updatedSal = numOfAttendance * salary;
		return updatedSal;
	
}
}
