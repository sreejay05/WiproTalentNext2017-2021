public class Prog6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String str1 = s.next();
		if (str.length()!=str1.length()){
			if(str.length()<str1.length()) {
				System.out.print(str+str1+str);
			}
			else{
				System.out.print(str1+str+str1);
			}
		}

	}
}
