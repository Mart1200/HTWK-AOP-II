package classes;

public class FluchSchreibfeder extends Schriftrolle {

	public FluchSchreibfeder(int gold, int radius) {
		super("Fluch der Schreibfeder", gold, radius);
		super.usetext = "Zerstört alle Monster-Schwerter mit [" + this.itemname + "| " + this.radius + "m| " + this.gold + "g]";
	}

}
