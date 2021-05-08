package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.validationRules.loginValidator;
import business.validationRules.registerValidator;
import entities.concretes.User;

public class AuthManager implements AuthService {
	private final UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		boolean result = registerValidator.registerValidate(user);
		boolean result2 = userService.getByEmail(user.getEmail().toLowerCase());
		if (!result) {
			return;
		}
		if (result2) {
			System.out.println("This email already exists");
			return;
		}

		userService.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " successfuly added");

	}

	@Override
	public void login(User user) {
		boolean result = loginValidator.loginValidate(user);
		if (!result) {
			System.out.println("Login failed");
			return;
		}
		System.out.println("Login succesfuly");

	}

}
