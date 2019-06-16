package classes;

public abstract class Waffe extends Item {
	int schaden;
	
	
	public Waffe(String prefix, String suffix, String itemname, int gold,int schaden) {
		super(prefix, suffix, itemname, gold);
		this.schaden = schaden;
		super.usetext = "Greift an mit [" + prefix + " " + this.itemname + " " + suffix + "|" +schaden + " Schaden| "+ gold + "g]";
	}


	@Override
	public String toString() {
		return "[" + prefix + " " + this.itemname + " " + suffix + "|" +schaden + " Schaden| " + gold + "g]";
	}
	
	public double getPL() {
		double dr= new Double(schaden)/new Double(gold);
		return dr;
	}
	

}
