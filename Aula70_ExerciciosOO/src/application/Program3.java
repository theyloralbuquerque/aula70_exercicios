package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Student Name: ");
		student.name = sc.nextLine();
		
		System.out.print("First Trimester : ");
		student.n1 = sc.nextDouble();
		
		System.out.print("Second Trimester: ");
		student.n2 = sc.nextDouble();
		
		System.out.print("Third Trimeste: ");
		student.n3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f.\n", student.noteFinal());
		
		if (student.missingPoints() > 0.0) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points.\n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		
		
		sc.close();

	}

}
