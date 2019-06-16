package classes;

public class Goldring extends Ring {
	int lvl;

	public Goldring(String prefix, String suffix, int gold, int lvl) {
		super(prefix, suffix, "Goldring", gold);
		this.lvl = lvl;
		super.usetext = "Legt [" + prefix + " " + this.itemname + " " + suffix + "|Kann Level " +lvl + " Monster zähmen]";
	}
	
	public String toString() {
		return "[" + prefix + " " + this.itemname + " " + suffix + "|Kann Level " +lvl + " Monster zähmen] | " + gold + "g";
	}
	
	public double getPL() {
		double dr= new Double(lvl)/new Double(gold);
		return dr;
	}


}
