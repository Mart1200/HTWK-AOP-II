package anglerverein;
import java.util.Random;
import java.util.Scanner;
import see.See;

public class Main {
	public static void main(String[] args) {
		See.fischeAussetzen(); // das darf nicht verändert werden
		Scanner reader = new Scanner(System.in);
		String ein = "";
		Random r = new Random();
		int ri;
		
		String[] name = {"Heimburger","Diecke","Gottschild","Drogge","Alef"};
		String[] prename = {"Marcus","Martin","Leon","Lorenz","Martin"};
		double[] beitrag = {1, 2.5, 4, 5.5, 6};
		
		Angler[] angler = new Angler[5];
		
		for(int i = 0; i < angler.length; i++) {
			if(i == angler.length - 1) {
				angler[i] = new Vorstand(name[i], prename[i], beitrag[i]);
			}else if(i == angler.length - 2) {
				angler[i] = new Schatzmeiser(name[i], prename[i], beitrag[i],10);
			}else {
				angler[i] = new Angler(name[i], prename[i], beitrag[i]);
			}
			
		}
		
		do{
			ri = r.nextInt(angler.length);
			System.out.println(angler[ri]);
			
			if(!angler[ri].isFangrecht()) {
				System.out.print("Zahlen? ");
				ein = reader.next();
				
				if(ein.equals("j")) {
					angler[ri].zahleBeitrag();
					Angler.ausgabeKassenstand();
					angler[ri].angeln();
				}
			}else {
				angler[ri].angeln();
			}
			
			angler[angler.length - 2].versuchePachtzahlen();
			System.out.print("Weiter? ");
			ein = reader.next();			
		} while (ein.equals("j"));
		reader.close();		
	}
}
