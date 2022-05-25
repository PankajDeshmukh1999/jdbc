package milestone2;

import java.util.ArrayList;
import java.util.Scanner;

import exceptionimpl.ExceptionImpl;

public class EmployeeMain {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Employee> arrayList;

	public static void createEmp() throws Exception {
		System.out.println("Enter numers of employee");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			try {
				System.out.println("Enter employee id :");
				int empid = sc.nextInt();

				System.out.println("Enter employee name :");
				String empName = sc.next();

				System.out.println("Enter employee age :");
				int empAge = sc.nextInt();
				if (empAge < 21) {
					throw new Exception("Employee should be at least more than 21 years");
				}

				System.out.println("Enter employee salary");
				double empSalary = sc.nextDouble();
				System.out.println();

				Employee e = new Employee(empid, empName, empSalary, empAge);

			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	public static void showAllEmployee(ArrayList<Employee> arrayList) {
		for (Employee emp : arrayList) {
			if (emp != null) {
				System.out.println("Id->" + emp.getId() + " Name->" + emp.getName() + " Age" + emp.getAge()
						+ " Salary->" + emp.getSalary() + "\n");
			}
		}
	}

	public static void sortEmployeeBySalary(ArrayList<Employee> arrayList) {
		ArrayList<Employee> sortBySalary = (ArrayList<Employee>) arrayList.clone();
		for (int i = 0; i < sortBySalary.size(); i++) {
			for (int j = 0; j < sortBySalary.size() - i - 1; j++) {
				if (sortBySalary.get(j).getSalary() > sortBySalary.get(j + 1).getSalary()) {
					Employee temp = sortBySalary.get(j);
					sortBySalary.set(j, sortBySalary.get(j + 1));
					sortBySalary.set(j + 1, temp);
				}
			}
		}

		showAllEmployee(sortBySalary);
	}

}
