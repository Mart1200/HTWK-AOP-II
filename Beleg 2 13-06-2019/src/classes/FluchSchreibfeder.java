package classes;

public class FluchSchreibfeder extends Schriftrolle {

	public FluchSchreibfeder(int gold, int radius) {
		super("Fluch der Schreibfeder", gold, radius);
		super.usetext = "Zerst�rt alle Monster-Schwerter mit [" + this.itemname + "| " + this.radius + "m| " + this.gold + "g]";
	}

}
