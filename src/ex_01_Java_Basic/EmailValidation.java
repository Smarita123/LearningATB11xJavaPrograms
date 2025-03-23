package ex_01_Java_Basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email="john.doe@domain.com";
		  String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                  "[a-zA-Z0-9_+&*-]+)*@" +
                  "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                  "A-Z]{2,7}$";
		  Pattern pattern=Pattern.compile(emailRegex);
		  Matcher matcher=pattern.matcher(email);
		  System.out.println(matcher.matches());

	}

}
