package anglerverein;
import see.See;
public class Angler{
	private String name;
	private String prename;
	private double beitrag;
	protected int wassertier = 0;
	protected boolean fangrecht = true;
	protected static double kassenstand = 0.0;
	static protected int versuche = 0;
	
	public Angler(String name, String prename, double beitrag) {
		this.name = name;
		this.prename = prename;
		this.beitrag = beitrag;
	}
	
	@Override
	public String toString() {
		return "Angler [name=" + name + ", prename=" + prename + ", beitrag=" + beitrag + "]";
	}

	public void zahleBeitrag(){
		kassenstand = kassenstand + this.beitrag;
	}
	
	public static void ausgabeKassenstand() {
		System.out.println("Kasse: " + kassenstand);
	}

	public void angeln(){		
		boolean stiefel = See.catchFish(true);
		versuche++;
		/* static boolean catchFish(boolean test)
		 * test == true Es wird nur eine Ausschrift erzeugt
		 * test == false Es wird für 3 sec ein Bild des Fangs angezeigt
		 * Die Funktion liefert true, falls ein Wassertier gefangen wurde,
		 * false sonst
		 */
		if(stiefel == true) {
			this.wassertier++;
		}
		
		if(this.getWassertier()%2 == 0 && this.getWassertier() != 0) {
			fangrecht = false;
		}else {
			fangrecht = true;
		}
	}

	public int getWassertier() {
		return wassertier;
	}

	public void setWassertier(int wassertier) {
		this.wassertier = wassertier;
	}

	public boolean isFangrecht() {
		return fangrecht;
	}	
	

}
