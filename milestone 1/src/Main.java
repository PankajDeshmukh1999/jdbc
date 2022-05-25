import java.util.Scanner;

public class Main extends EmployeeDetails {

	static Scanner sc = new Scanner(System.in);

	static Employee[] employee;

	public static void main(String[] args) {
		System.out.println("===========Welcome to Employee Management System===========");

		employee = new Employee[10];
		saveEmployeedata(employee);

		boolean flag = true;
		do {
			int ch = displayMenu(employee);

			switch (ch) {
			case 1:
				showEmployee(employee);
				break;

			case 2:
				descendingOrderByName(employee);
				break;

			case 3:
				updateSalaryById(employee);
				break;

			case 4:
				flag = false;
				break;

			default:
				break;
			}

		} while (flag);

	}

}

