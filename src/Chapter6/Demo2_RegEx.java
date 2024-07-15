package Chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2_RegEx {
	public static void main(String[] args) {
		System.out.println("run demo 2");

		Pattern pattern = Pattern.compile("^(?!\\d+$)\\w{8,20}$");
		Matcher matcher = pattern.matcher("Tryurcode4u");
		System.out.println("Input String matches regex - " + matcher.matches());

		// check mật khẩu gồm 6 kí tự
		Pattern pattern1 = Pattern.compile("[0-9]{6,}"); // tối thiểu 6 kí tự \\d{6,}
		Matcher matcher1 = pattern1.matcher("123456");
		System.out.println("Input String matches regex - " + matcher1.matches());

		// check cccd
		Pattern pattern2 = Pattern.compile("[0-9]{12}");
		Matcher matcher2 = pattern2.matcher("012123456789");
		System.out.println("Input String matches regex - " + matcher2.matches());

		// check email
		Pattern pattern3 = Pattern.compile("^[A-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher3 = pattern3.matcher("dt123@gmail.com");
		System.out.println("Input String matches regex - " + matcher3.matches());
	}
}
