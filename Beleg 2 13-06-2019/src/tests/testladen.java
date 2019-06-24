package tests;

import java.util.Scanner;

import classes.Player;
import laden.Buchladen;
import laden.Juwelier;
import laden.Waffen;

public class testladen {

	public static void main(String[] args) {
		Waffen schmied = new Waffen();
		Juwelier j = new Juwelier();
		Buchladen b = new Buchladen();
		Player marcus = new Player("Marcus der Dorfbewohner");
		System.out.println(marcus);

		
		marcus.buyForMe(schmied, j, b, "Schmied");
		marcus.useAll();
		//System.out.println(marcus);
		
		

		

	}

}
