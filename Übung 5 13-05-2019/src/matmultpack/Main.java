package matmultpack;

import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
		throws Exception
	{
		// Bitte korrekten Pfad eintragen 
		File directory = new File("C:\\Users\\Marti\\Desktop\\Java\\HTWK-AOP-II\\Übung 5 13-05-2019\\src");
		InputStream istream;
		OutputStream ostream;
		File matrixFile;
		Matrix einMatrix = null;
		Scanner eingabe = new Scanner(System.in);
		int ausw;
		do {
			System.out.println("Quelle für Eingabematrix");
			System.out.println("\t1 Einlesen aus Datei");
			System.out.println("\t2 Eingabe von Tastatur");
			System.out.println("\t3 Zufallsbelegung");	
			System.out.print("Auswahl > ");
			ausw = eingabe.nextInt();
			switch (ausw) {
				case 1: 
					matrixFile = selectFile(directory);
					if (matrixFile != null) {
						istream = new FileInputStream(matrixFile);
						einMatrix = Matrix.read(istream);
						istream.close();
					} else {
						System.out.println("Dateiauswahl fehlerhaft");
					}
					break;
				case 2:
					System.out.println("Matrix eingeben:");
					einMatrix = Matrix.read(System.in);
					break;
				case 3:
					int dim;
					System.out.print("Größe: ");
					dim = eingabe.nextInt();
					einMatrix = new Matrix(dim);
					einMatrix.randomize();
					break;
				default:
					System.out.println("Fehlerhafte Auswahl");				
			}
		} while(einMatrix == null);
		System.out.println("Ziel für Eingabematrix");
		System.out.println("\t1 Ausgabe in neuer Datei");
		System.out.println("\t2 Ausgabe in bestehende Datei (erweitern)");
		System.out.println("\t3 Ausgabe auf dem Bildschirm");
		System.out.print("Auswahl > ");
		ausw = eingabe.nextInt();
		switch (ausw) {
			case 1: 
				String dateiname;
				System.out.print("Dateiname > ");
				dateiname = eingabe.next();
				matrixFile = new File(directory.getAbsolutePath() + File.separator + dateiname + ".txt");
				ostream = new FileOutputStream(matrixFile);
				einMatrix.print(ostream);
				ostream.close();
				break;
			case 2:
				matrixFile = selectFile(directory);
				ostream = new FileOutputStream(matrixFile,true);
				einMatrix.print(ostream);
				ostream.close();
				break;
			case 3:
				einMatrix.print(System.out);
				break;
			default:
				System.out.println("Fehlerhafte Auswahl");				
		}
		eingabe.close();
	}
	public static File selectFile(File actdir) 
			throws IllegalArgumentException
	{
		if (!actdir.isDirectory())
			throw new IllegalArgumentException("Path is not a directory");
		File[] ls = null;
		int index;
		Scanner input = new Scanner(System.in);
		ls = actdir.listFiles(new FileFilter() {
									public boolean accept(File f) {
											return f.isFile();
										}
								  	 }
							 );
		if (ls != null && ls.length != 0) {
			for (int i = 0; i < ls.length; i ++) {
				System.out.println(i + " " + ls[i].getName());
			}
			do {
				System.out.print("Auswahl (Nr) > ");
				index = input.nextInt();
				if ((0 <= index) && (index < ls.length) ) {
					return ls[index];
				} else {
					System.out.println("Bitte korrekten Wert eingeben");
				}
			} while(true);
		} else {
			System.out.println("Keine Dateien vorhanden");
			return null;
		}
	}
}
