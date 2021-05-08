package business.validationRules;

import core.entensions.regex.RegexMailExtensions;
import entities.concretes.User;

public class registerValidator {
	private static boolean result = true;

	private static void checkEmail(String email) {
		result = RegexMailExtensions.checkEmail(email.toLowerCase());

		if (!result) {
			System.out.println("Invalid email");
		}
	}

	private static void checkPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Password must be at least 6 characters");
			result = false;
		}
	}

	public static void checkName(String firstName, String lastName) {
		if (firstName.length() < 2 || lastName.length() < 2) {
			System.out.println("Firstname and lastname must be at least 2 characters");
			result = false;
		}
	}

	public static boolean registerValidate(User user) {
		checkEmail(user.getEmail());
		checkName(user.getFirstName(), user.getLastName());
		checkPassword(user.getPassword());

		return result;
	}
}
