package helloworldpaket;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.UK);
		
		String eingabe = "";
		int gzahl = 0;
		double dzahl = 0.0;
		double umfang, flaeche;
		
		//Eingabe Strings
		System.out.print("Name eingeben: ");
		eingabe = input.nextLine();		
		System.out.println("Hello " + eingabe);
		
		//Eingabe Ganzzahl
		System.out.print("Ganzzahl eingeben: ");
		gzahl = input.nextInt();
		System.out.println("Ganzzahl ist " + gzahl);
		
		//Eingabe Double Zahlen
		System.out.print("Double Zahl: ");
		dzahl = input.nextDouble();
		System.out.println("Double Zahl ist " + dzahl);
		
		//Berechnung Kreis mit Double von oben
		umfang = 2.0 * Math.PI * dzahl;
		flaeche = Math.PI * dzahl * dzahl;
		System.out.println("Umfang: " + umfang + " Fläche: " + flaeche);
		

	}

}
