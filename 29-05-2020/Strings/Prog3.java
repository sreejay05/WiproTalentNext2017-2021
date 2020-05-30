public class Prog3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str= s.next();
		String str1="";
		for(int i=0;i<2;i++){
			str1 += str.charAt(i);
		}
		for(int i=0;i<str.length();i++){
			System.out.print(str1);
		}
	}
}
