package classes;

public class LottoMain {
	private LottoGUI anzeige;
	private LottoDaten ldaten;
	
	public LottoMain() {
		anzeige = new LottoGUI();
		ldaten = new LottoDaten();
		anzeige.setLdaten(ldaten);
	}

	public static void main(String[] args) {
		LottoMain ls = new LottoMain();
		ls.anzeige.setVisible(true);
	}
	
	
	
	
	
}
