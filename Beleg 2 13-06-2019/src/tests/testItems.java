package tests;

import java.util.ArrayList;
import java.util.List;

import classes.AugenHypnos;
import classes.Bogen;
import classes.FluchSchreibfeder;
import classes.Goldring;
import classes.Ring;
import classes.Schriftrolle;
import classes.Schwert;
import classes.Silberring;

public class testItems {

	public static void main(String[] args) {
		Schwert test = new Schwert("gesegnetem", "des Hasses", 100, 10);
		Bogen test1 = new Bogen("schneller", "des Testes", 30, 100);
		Silberring test2 = new Silberring("halber", "", 30, 2);
		Goldring test3 = new Goldring("kleiner", "der Schwachen", 50, 3);
		
		Schriftrolle fluch = new FluchSchreibfeder(10, 10);
		Schriftrolle hypnos = new AugenHypnos(300, 20);
		
		System.out.println(test.getPL());
		
		

	}

}
