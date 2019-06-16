package classes;

public class Silberring extends Ring {
	int st�rke;
	
	public Silberring(String prefix, String suffix,int gold,int st�rke) {
		super(prefix, suffix, "Silberring", gold);
		this.st�rke = st�rke;
		super.usetext = "Legt [" + prefix + " " + this.itemname + " " + suffix + "| +" +st�rke + " St�rke]";
	}
	
	public int getst�rke() {
		return st�rke;
	}
	
	public String toString() {
		return "[" + prefix + " " + this.itemname + " " + suffix + "| +" +st�rke + " St�rke] | " + gold + "g";
	}
	
	public double getPL() {
		double dr= new Double(st�rke)/new Double(gold);
		return dr;
	}

}
