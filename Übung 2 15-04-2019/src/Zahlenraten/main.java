package Zahlenraten;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random zufall = new Random();
		
		
		int pzahl = 0;
		int zzahl = zufall.nextInt(100);
		
		while(pzahl != zzahl) {
			
			System.out.print("Zahl: ");
			pzahl = input.nextInt();
			
			if(zzahl < pzahl) {
				System.out.println("Zahl zu groß");
			}
			else if(pzahl < zzahl) {
				System.out.println("Zahl zu klein");
			}			
		}
		
		System.out.println("Zahl erraten!");
		
	}

}
