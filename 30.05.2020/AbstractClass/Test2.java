import java.util.*;
public class Test2 {
	public static void main(String[] args) {
		Compartment[] c = new Compartment[10];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int randomNum = r.nextInt((4-1)+1)+1;
			if (randomNum == 1)
				c[i] = new FirstClass();
			else if (randomNum == 2)
				c[i] = new Ladies();
			else if (randomNum == 3)
				c[i] = new General();
			else if (randomNum == 4)
				c[i] = new Luggage();
			c[i].notice();
		}
	}
}