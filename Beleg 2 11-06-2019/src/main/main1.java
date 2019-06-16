package main;

import classes.Bogen;
import classes.Schwert;

public class main1 {
	public static void main(String[] args) {
		Schwert test = new Schwert(3, "himmliches", "der Zühne", 100);
		Bogen test1 = new Bogen(4, "zerbrochener", "der Alten Göttern", 100);
		
		test.use();
		test1.use();

	}

}
