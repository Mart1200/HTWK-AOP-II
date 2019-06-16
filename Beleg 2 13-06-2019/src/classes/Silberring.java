package classes;

public class Silberring extends Ring {
	int stärke;
	
	public Silberring(String prefix, String suffix,int gold,int stärke) {
		super(prefix, suffix, "Silberring", gold);
		this.stärke = stärke;
		super.usetext = "Legt [" + prefix + " " + this.itemname + " " + suffix + "| +" +stärke + " Stärke]";
	}
	
	public int getstärke() {
		return stärke;
	}
	
	public String toString() {
		return "[" + prefix + " " + this.itemname + " " + suffix + "| +" +stärke + " Stärke] | " + gold + "g";
	}
	
	public double getPL() {
		double dr= new Double(stärke)/new Double(gold);
		return dr;
	}

}
