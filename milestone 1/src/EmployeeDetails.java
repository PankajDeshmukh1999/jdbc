import java.util.Scanner;

public class EmployeeDetails {
	static Scanner sc = new Scanner(System.in);

	public static int displayMenu(Employee[] employee) {
		System.out.println("========================================");

		System.out.println("1. Press 1 for Display all employee");
		System.out.println("2. Press 2 for display employee based on their name in desc order");
		System.out.println("3. Press 3 for Update Salary");
		System.out.println("4. Press 4 for Exit");

		System.out.println("========================================");

		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		return choice;

	}

	public static void saveEmployeedata(Employee[] employee) {
		for (int i = 0; i < employee.length; i++) {
			System.out.println("----Enter employee Id----");
			int id = sc.nextInt();

			System.out.println("--Enter employee Names--");
			String name = sc.next();

			System.out.println("--Enter Employee salary--");
			double salary = sc.nextDouble();

			System.out.println("--Enter Employee Age--");
			int age = sc.nextInt();

			employee[i] = new Employee(id, name, salary, age);

		}
	}

	public static void showEmployee(Employee[] employee) {
		System.out.println("===================================");
		for (int i = 0; i < employee.length; i++) {

			System.out.println("Id-" + employee[i].getId());
			System.out.println("Name-" + employee[i].getName());
			System.out.println("Salary-" + employee[i].getSalary());
			System.out.println("Age-" + employee[i].getAge());
			System.out.println("===================================");
		}
		System.out.println();
	}

	public static void updateSalaryById(Employee[] employee) {
		System.out.println("Enter id of employee");
		int id = sc.nextInt();
		System.out.println("Enter updated salary amount");
		double salary = sc.nextDouble();

		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getId() == id) {
				employee[i].setSalary(salary);
				System.out.println("*********************");
				System.out.println("Id-" + employee[i].getId());
				System.out.println("Name-" + employee[i].getName());
				System.out.println("Salary-" + employee[i].getSalary());
				System.out.println("Age-" + employee[i].getAge());
				System.out.println("*********************");
			}
		}
	}

	public static void descendingOrderByName(Employee[] employee) {

		Employee[] temp = new Employee[10];
		Employee[] sortbyName = new Employee[employee.length];

		for (int i = 0; i < sortbyName.length; i++) {
			sortbyName[i] = employee[i];
		}
		for (int i = 0; i < sortbyName.length; i++) {
			for (int j = 0; j < sortbyName.length; j++) {
				if (sortbyName[i].getName().compareTo(sortbyName[j].getName()) > 0) {
					temp[0] = sortbyName[i];
					sortbyName[i] = sortbyName[j];
					sortbyName[j] = temp[0];
				}
			}
		}
		showEmployee(sortbyName);

	}

}


