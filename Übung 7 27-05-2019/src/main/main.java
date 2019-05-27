package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import Classes.Beagle;
import Classes.Canoidea;
import Classes.iHaustier;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File(".\\Tiere.txt");
		InputStream instream = new FileInputStream(f);
		Scanner reader = new Scanner(instream);
		
		ArrayList<Canoidea> doglist = new ArrayList<Canoidea>();
		ArrayList<iHaustier> streichelzoo = new ArrayList<iHaustier>();
		
		String line;
		while(reader.hasNext()) {
			line = reader.nextLine();
			
			switch(line) {
			case "Beagle" : doglist.add(new Beagle());
				break;
			}
		}
		reader.close();
		
		for(Canoidea c : doglist) {
			System.out.println(c);
			
			if(c instanceof iHaustier) {
				streichelzoo.add((iHaustier) c);
			}
		}
		
	}

}
