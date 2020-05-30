public class Prog4{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		if (str.length() % 2 == 0) {
			int n = str.length() / 2;
			for (int i = 0; i < n; i++) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
