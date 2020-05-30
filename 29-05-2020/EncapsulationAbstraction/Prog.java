public class Author
{
	public static String email;
	public static char gender;
	public static String name;
	Author(String n,String e,char g)
	{
		name=n;
		email=e;
		gender=g;
	}
	public String toString() {
		return name + " (" + gender + ") at " + email;
	}
}
class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return name + " by " + author;
    }
}
public class Main {
    public static void main(String args[])
    {
        Author a= new Author("Krish", "abc@mail.com", 'm');
        Book b = new Book("Java", a, 10.22, 22);
        System.out.println(b);
        System.out.println(a);
        b.setPrice(10.78);
        b.setQty(78);
        System.out.println("The name of the book is :"+b.getName());
        System.out.println("The price of the book is :"+b.getPrice());
        System.out.println("The stock is :"+b.getQty());
    }
}
