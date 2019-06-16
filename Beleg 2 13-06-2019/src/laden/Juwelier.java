package laden;

import java.util.Random;

import classes.Goldring;
import classes.Ring;
import classes.Silberring;

public class Juwelier extends protoLaden {

	public Juwelier() {
		Random r = new Random();
		int lg = r.nextInt(10)+1;
		
		for(int i = 0; i < lg;i++) {
			int r1 = r.nextInt(11);
			int r2 = r.nextInt(2);
			int r3 = r.nextInt(300)+1;
			Ring neuerRing;
			if(r2  == 0) {
				neuerRing = new Silberring("", "", r3, r1);
			}else {
				neuerRing = new Goldring("", "", r3, r1);
			}
			
			inventar.put(""+ neuerRing.getId(), neuerRing);
		}
		
	}
	
}
