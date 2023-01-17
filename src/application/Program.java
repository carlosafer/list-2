package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nEmployee #" + (i + 1));
			System.out.print("Id: ");
			int id = input.nextInt();
			input.nextLine();
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Salary: ");
			double salary = input.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		System.out.println("Which employee will have the salary increased? ");
		System.out.print("Id: ");
		int id = input.nextInt();
		System.out.print("Percentage: ");
		double percentage = input.nextDouble();
		
		for (Employee emp : list) {
			if (id == emp.getId()) {
				emp.salaryIncrease(percentage);
			}
			System.out.println(emp);
		}
		
		input.close();

	}
}
