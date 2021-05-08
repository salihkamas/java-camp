package business.validationRules;

import entities.concretes.User;

public class loginValidator {
	private static boolean result = true;

	private static void required(String key, String value) {
		if (value.length() == 0) {
			System.out.println(key + " is required");
			result = false;
		}
	}

	public static boolean loginValidate(User user) {
		required("Email", user.getEmail());
		required("Password", user.getPassword());
		return result;
	}
}
