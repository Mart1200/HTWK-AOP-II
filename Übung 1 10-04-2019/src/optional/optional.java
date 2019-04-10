package optional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class optional {

	public static void main(String[] args) {
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
		
		String eingabe = "";
		int gzahl = 0;
		double dzahl = 0.0;
		
		
		//String Eingabe
		System.out.print("Name eingeben: ");
		
		try {
			eingabe = tastatur.readLine();
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("hallo " + eingabe);
		
		//Int eingabe
		System.out.print("Ganzzahl eingeben: ");
		try {
			eingabe = tastatur.readLine();
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			gzahl = Integer.valueOf(eingabe);
		} catch (NumberFormatException nf) {
			System.out.println(nf.getMessage());
		}
		System.out.print("Die Zahl war " + gzahl);
		
		//Double Eingabe
		System.out.print("Double Zahl mit Punkt: ");
		
		try {
			eingabe = tastatur.readLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			dzahl = Double.valueOf(eingabe);
		} catch (NumberFormatException nf) {
			System.out.println(nf.getMessage());
		}
		System.out.print("Die Zahl war " + dzahl);
		
	}

}
