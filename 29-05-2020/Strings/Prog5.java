public class Prog5{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		if (str.length()>=2) {
			for (int i = 1; i < str.length()-1; i++) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
