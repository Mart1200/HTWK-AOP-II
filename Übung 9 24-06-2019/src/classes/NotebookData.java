package classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class NotebookData {
	private Map<String, String> notemap;

	public NotebookData() {
		super();
		notemap = new HashMap<String, String>();
		
		try {
			ObjectInputStream input;
			input = new ObjectInputStream(new FileInputStream("note.txt"));
			notemap = (Map<String, String>) input.readObject();
			input.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void putNote(String day, String termin) {
		notemap.put(day, termin);
		System.out.println(notemap);
	}
	
	public String getNote(String day) {
		return notemap.get(day);
	}
	
	public void deleteNote(String day) {
		notemap.remove(day);
	}
	
	public void writetoFile() {
		ObjectOutputStream output;
		try {
			output = new ObjectOutputStream(new FileOutputStream("note.txt"));
			output.writeObject(notemap);
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
