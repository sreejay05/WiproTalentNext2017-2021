import java.util.*;
public class TestJava8{
	public static void main(String[] args){
		String s1 = args[0];
		int age = Integer.parseInt(args[1]);
		try{			
			if (age<18 || age>=60) throw new AgeOutOfRangeException();
			System.out.println("Name:"+s1+"   Age:"+age);
		}
		catch (AgeOutOfRangeException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
