import java.util.*;
public class Prog6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		prog6 list = new prog6();
		System.out.println("Enter no:of even numbers:");
		int n=s.nextInt();
		list.saveEvenNumbers(n);
		list.printEvenNumbers();
	}
	private LinkedList<Integer> l = new LinkedList<>();
	public LinkedList<Integer> saveEvenNumbers(int n) {
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0)
				l.add(i);
		}
		return l;
	}
	public LinkedList<Integer> printEvenNumbers() {
		LinkedList<Integer> l2 = new LinkedList<>();
		for (int i : l) {
			l2.add(i * 2);
			System.out.println(i * 2);
		}
		return l2;
	}
