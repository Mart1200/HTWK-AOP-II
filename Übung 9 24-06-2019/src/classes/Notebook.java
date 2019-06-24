package classes;

public class Notebook {
	private NotebookGUI view;
	private NotebookData notes;
	
	private Notebook() {
		view = new NotebookGUI();
		notes = new NotebookData();
		view.setNotes(notes);
	}
	
	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		notebook.activate();
	}

	private void activate() {
		view.setVisible(true);
	}
	
	
}
