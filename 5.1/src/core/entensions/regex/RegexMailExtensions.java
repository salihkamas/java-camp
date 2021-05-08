package core.entensions.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMailExtensions {
	public static boolean checkEmail(String email) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.find();
	}
}
