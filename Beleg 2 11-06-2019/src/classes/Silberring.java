package classes;

public class Silberring extends Ring {
	int zuKampfstärke = 0;
	
	public Silberring(int kampstärke, String prefix, String sufix) {
		super("Silberring", prefix, sufix);
		zuKampfstärke = kampstärke;
	}

}
