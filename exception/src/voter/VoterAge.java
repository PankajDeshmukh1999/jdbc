package voter;

import java.util.Scanner;

import exceptionimpl.ExceptionImpl;
import myexception.invalidAgeException;

public class VoterAge {

	public static void age(invalidAgeException[] array) throws ExceptionImpl {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			try {
				System.out.println("Enter user id:");
				int id = sc.nextInt();
				
				System.out.println("Enter your name:");
				String name = sc.next();

				System.out.println("Enter your age:");
				int age = sc.nextInt();

				if (age < 18) {
					System.out.println(+id+" "+name+" "+age+"->Invalid age for vote");
					int result = 18-age;
					System.out.println("You can vote after:"+result+" years");
				} else {
					System.out.println(+id+" "+name+" "+age+" You can vote");
				}
			} catch (Exception e) {
				throw new ExceptionImpl(e);
			}
		}
	}
}
