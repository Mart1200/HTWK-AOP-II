package Classes;

public abstract class Zootier {
	protected String futter;
	private int inventarNummer;
	private static int invZ�hler = 1056;
	protected String famillie;
	protected String art;
	
	public Zootier(){
		inventarNummer = invZ�hler++;
	}

	@Override
	public String toString() {
//		return "Zootier [futter=" + futter + ", inventarNummer=" + inventarNummer + ", famillie=" + famillie + ", art="
//				+ art + "]";
		return famillie + " " + art + " " + inventarNummer + " Futter: " + futter;
	}
	
	
}
