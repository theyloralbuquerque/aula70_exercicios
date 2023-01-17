package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gloss Salary: ");
		employee.glossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.print("Wich porcentage to increase salary? ");
		double porcentage = sc.nextDouble();
		employee.inCreaseSalary(porcentage); /* Sempre que eu for passar uma variável como parâmetro para um método, eu tenho que descriminar logo abaixo da entrada de dados da variável.*/
		
		System.out.println("Update Data: " + employee);
		
		
		sc.close();

	}

}
