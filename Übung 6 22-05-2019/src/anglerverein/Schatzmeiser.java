package anglerverein;

public class Schatzmeiser extends Angler{
	private double pacht;
	
	public Schatzmeiser(String name, String prename, double beitrag, double pacht) {
		super(name, prename, beitrag);
		this.pacht = pacht;
	}
	
	public void versuchePachtzahlen() {
		if(versuche == 10) {
			kassenstand = kassenstand - pacht;
			Angler.ausgabeKassenstand();
			versuche = 0;
		}

	}

}
