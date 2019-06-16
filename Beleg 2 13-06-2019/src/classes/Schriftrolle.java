package classes;

public class Schriftrolle extends Item {
	protected int radius = 0;

	public Schriftrolle(String itemname, int gold, int radius) {
		super("", "", itemname, gold);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "[" + prefix + " " + this.itemname + " " + suffix + "|" +radius + " m| " + gold + "g]";
	}
	
	public double getPL() {
		double dr= new Double(radius)/new Double(gold);
		return dr;
	}
}
