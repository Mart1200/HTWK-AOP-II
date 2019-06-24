package classes;

import java.util.HashMap;
import java.util.Map;

public class NotebookData {
	private Map<String, String> notemap;

	public NotebookData() {
		super();
		notemap = new HashMap<String, String>();
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
	
}
