package main;

import classes.Bogen;
import classes.Schwert;

public class main1 {
	public static void main(String[] args) {
		Schwert test = new Schwert(3, "himmliches", "der Z�hne", 100);
		Bogen test1 = new Bogen(4, "zerbrochener", "der Alten G�ttern", 100);
		
		test.use();
		test1.use();

	}

}
