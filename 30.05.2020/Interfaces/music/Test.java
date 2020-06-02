package music.live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
	public static void main(String[] args) {
		Playable v = new Veena();
		v.play();
		Playable s = new Saxophone();
		s.play();
	}

}
