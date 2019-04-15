package romischeZahlen;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int zahl = 0;
		String output = "";
		int[] wert = {1000,900,500,400,100,90,50,40,10,5,4,1};
		String[] rzahl = {"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		System.out.print("Zahl eingeben (kleiner 4000): ");
		zahl = input.nextInt();
		
		for(int i=0; i < wert.length; i++) {
			int anz = zahl/wert[i];
			zahl = zahl%wert[i];
				
			for(int j=0; j < anz; j++) {
				output = output + rzahl[i];
			}
					
		}
		
		System.out.print("r. Zahl: " + output);
		
	}

}
