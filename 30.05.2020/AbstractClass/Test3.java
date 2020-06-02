import java.util.*;
public class Test3 {
	public static void main(String[] args) {
		Instrument[] ins = new Instrument[10];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int randomNum = r.nextInt((3-1)+1)+1;
			if (randomNum == 1)
				ins[i] = new Piano();
			else if (randomNum == 2)
				ins[i] = new Guitar();
			else if (randomNum == 3)
				ins[i] = new Flute();
			ins[i].play();
			if (ins[i] instanceof Piano)
				System.out.println("Piano index:" + i);
			else if (ins[i] instanceof Flute)
				System.out.println("Flute index:" + i);
			else if (ins[i] instanceof Guitar)
				System.out.println("Guitar index " + i);
		}
	}
}