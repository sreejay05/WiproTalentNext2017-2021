import java.util.*;
public class TestJava7{
	public static void main(String[] args){
		TestJava7 registration = new TestJava7();
		try {
			Scanner s = new Scanner(System.in);
			String name = s.next();
			String country=s.next();
			registration.registerUser(name,country);
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
		public void registerUser(String username, String userCountry) throws InvalidCountryException {
			if (!userCountry.equals("India"))
				throw new InvalidCountryException();
			else
				System.out.println("User registration done successfully");
		}





}
