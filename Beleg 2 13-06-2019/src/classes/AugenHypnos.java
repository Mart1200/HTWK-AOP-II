package classes;

public class AugenHypnos extends Schriftrolle {

	public AugenHypnos(int gold, int radius) {
		super("Augen von Hypnos", gold, radius);
		super.usetext = "L�hmt alle Monster mit [" + this.itemname + "| " + this.radius + "m| " + this.gold + "g]";
	}

}
