package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public double increaseSalary() {
		return (grossSalary + grossSalary * (percentage / 100.0)) - tax; 
	}
	public String toString1() {
		return "Employee: "
			+ name
			+ ", $ "
			+ String.format("%.2f", netSalary());
	}
	public String toString2() {
		return "Employee: "
			+ name
			+ ", $ "
			+ String.format("%.2f", increaseSalary());
	}
}
