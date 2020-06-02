public class LibraryInterfaceDemo {
	public static void main(String[] args){
		KidUser k = new KidUser();

		k.setAge(10);
		k.setBookType("Kids");
		k.registerAccount();
		k.requestBook();

		k.setAge(18);
		k.setBookType("Fiction");
		k.registerAccount();
		k.requestBook();

		AdultUser a = new AdultUser();
		a.setAge(5);
		a.setBookType("Kids");
		a.registerAccount();
		a.requestBook();

		a.setAge(23);
		a.setBookType("Fiction");
		a.registerAccount();
		a.requestBook();
	}
}
