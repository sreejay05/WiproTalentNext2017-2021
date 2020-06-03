import java.util.*;
public class Prog7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		prog7 list = new prog7();
		System.out.println("Enter no:of even numbers:");
		int n=s.nextInt();
		list.saveEvenNumbers(n);
		list.printEvenNumbers();
	}
	private Vector<Integer> l = new Vector<>();
	public Vector<Integer> saveEvenNumbers(int n) {
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0)
				l.add(i);
		}
		return l;
	}
	public Vector<Integer> printEvenNumbers() {
		Vector<Integer> l2 = new Vector<>();
		for (int i : l) {
			l2.add(i * 2);
			System.out.println(i * 2);
		}
		return l2;
	}
}
