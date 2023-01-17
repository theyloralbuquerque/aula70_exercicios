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
		return name + ", $ " + String.format("%.2f", netSalary()); /* Possso usar um m�todo normalmente no toString, basta n�o esquecer os par�nteses "()"*/
	}
	
}