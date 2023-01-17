package entities;

public class Employee {

	public String name;
	public double glossSalary;
	public double tax;
	
	public double netSalary() {
		return glossSalary - tax;
	}
	
	public void inCreaseSalary(double porcentage) {
		glossSalary += (glossSalary * porcentage) / 100;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary()); /* Possso usar um método normalmente no toString, basta não esquecer os parênteses "()"*/
	}
	
}