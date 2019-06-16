package laden;

import java.util.Random;

import classes.AugenHypnos;
import classes.FluchSchreibfeder;
import classes.Schriftrolle;

public class Buchladen extends protoLaden {

	public Buchladen() {
		Random r = new Random();
		int lg = r.nextInt(10)+1;
		
		for(int i = 0; i < lg;i++) {
			int r1 = r.nextInt(11);
			int r2 = r.nextInt(2);
			int r3 = r.nextInt(300)+1;
			Schriftrolle nS;
			if(r2  == 0) {
				nS = new AugenHypnos(r3, r1);
			}else {
				nS = new FluchSchreibfeder(r3, r1);
			}
			
			inventar.put(""+ nS.getId(), nS);
		}
	}

}
