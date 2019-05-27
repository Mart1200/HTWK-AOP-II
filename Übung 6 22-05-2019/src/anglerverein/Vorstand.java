package anglerverein;

import see.See;

public class Vorstand extends Angler{

	public Vorstand(String name, String prename, double beitrag) {
		super(name, prename, beitrag);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void angeln(){		
		boolean stiefel = See.catchFish(true);
		versuche = versuche + 1;
		/* static boolean catchFish(boolean test)
		 * test == true Es wird nur eine Ausschrift erzeugt
		 * test == false Es wird für 3 sec ein Bild des Fangs angezeigt
		 * Die Funktion liefert true, falls ein Wassertier gefangen wurde,
		 * false sonst
		 */
		if(stiefel == true) {
			super.wassertier++;
		}
		
		if(this.getWassertier()%4 == 0 && this.getWassertier() != 0) {
			super.fangrecht = false;
		}else {
			super.fangrecht = true;
		}
	}
	
	public void redehalten(){
		System.out.println("BlaBlaBla");
	}
	
}
