package laden;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import classes.Bogen;
import classes.Schwert;
import classes.Waffe;

public class Waffen extends protoLaden{

	public Waffen() {
		String[] sufix = {"", "der Schwäche", "des Zorns", "des Hasses", "des Änfängers"};
		String[] prefix = {"", "schnelles/schneller", "zerbrochener/zerbrochenes", "mächtiger/mächtiges", "Anfänger-"};
		
		Random r = new Random();
		int ladengröße = r.nextInt(10)+1;
		
		for(int i = 0; i < ladengröße; i++) {
			int sb = r.nextInt(2);
			int pf = r.nextInt(5);
			int sf = r.nextInt(5);
			int schaden = r.nextInt(101);
			int gold = r.nextInt(300)+1;
			Waffe newWaffe = null;
			
			if(sb == 0) {
				newWaffe = new Schwert(prefix[pf], sufix[sf], gold, schaden);
			}else if(sb == 1) {
				newWaffe = new Bogen(prefix[pf], sufix[sf], gold, schaden);
			}
			
			String newID = "" + newWaffe.getId();
			inventar.put(newID, newWaffe);
	}
	
	}

}