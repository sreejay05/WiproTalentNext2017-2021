import java.util.Scanner;
class Fruit{
	private String name;
	private String taste;
	private int size;
	Scanner s= new Scanner(System.in);
	public void eat(){
		name = s.next();
		System.out.println("Name of fruit is "+name);
		taste = s.next();
		System.out.println("Taste is "+taste);
	}
}
class Apple extends Fruit{
	public void eat(){
		System.out.println("Name of fruit is apple.");
		System.out.println("Taste is sweet.");
	}
}
class Orange extends Fruit {
	public void eat() {
		System.out.println("Name of fruit is orange.");
		System.out.println("Taste is sour.");
	}
}
public class Fruits {
	public static void main(String[] args) {
			Apple a = new Apple();
			a.eat();
			Orange o = new Orange();
			o.eat(); 
	}
}
