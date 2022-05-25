package myexception;

import java.util.Scanner;

import exceptionimpl.ExceptionImpl;
import voter.VoterAge;

public class invalidAgeException extends VoterAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter limit of voters:");
		int n = sc.nextInt();

		invalidAgeException[] array = new invalidAgeException[n];
		try {
			age(array);
		} catch (ExceptionImpl e) {
			System.out.println(e.getMessage());
		}
	}

}
