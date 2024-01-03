package practiceProjects;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class emailValidation {

		public static boolean isValid(String email)
		{
			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
								"[a-zA-Z0-9_+&*-]+)*@" +
								"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
								"A-Z]{2,7}$";
								
			Pattern pat = Pattern.compile(emailRegex);
			if (email == null)
				return false;
			return pat.matcher(email).matches();
		}

		public static void main(String[] args)
		{
			ArrayList<String> address = new ArrayList<>();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your email");
				
			address.add(sc.nextLine());
				
			for(String i : address){
				if (isValid(i))
					System.out.println(i + " - is valid E-mail");
				else
					System.out.println(i + " - is invalid E-mail");
			}
		}
	}

