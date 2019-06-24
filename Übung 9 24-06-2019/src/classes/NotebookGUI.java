package classes;

import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class NotebookGUI extends JFrame{
	private NotebookData notes;
	private JLabel daylbl, textlbl;
	private JTextArea termintxt;
	private JComboBox<String> days;
	private JButton BAnzeigen, BSpeichern, BClear, BBeenden;
	
	
	

	public NotebookGUI(){
		this.setTitle("GUI_NoteBook");
		this.setLocation(100,100);
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		getContentPane().setBackground(Color.GRAY);
		
		//plazierung
		daylbl = new JLabel("Wochentag");
		daylbl.setBounds(20, 5, 110, 30);
		this.add(daylbl);
		
		textlbl = new JLabel("Termine:");
		textlbl.setBounds(160, 5, 110, 30);
		this.add(textlbl);
		
		termintxt = new JTextArea();
		termintxt.setBounds(160, 30, 200, 200);
		this.add(termintxt);
		
		String[] daylist = {"Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Framstag","Samstag","Sonntag"};
		days = new JComboBox<String>(daylist);
		days.setBounds(20, 30, 110, 20);
		this.add(days);
		
		BAnzeigen = new JButton("Anzeigen");
		BAnzeigen.setBounds(20, 100, 110, 20);
		this.add(BAnzeigen);
		
		BSpeichern = new JButton("Speichern");
		BSpeichern.setBounds(20, 130, 110, 20);
		this.add(BSpeichern);
		
		BClear = new JButton("Clear");
		BClear.setBounds(20,160,110,20);
		this.add(BClear);
		
		BBeenden = new JButton("Beenden");
		BBeenden.setBounds(20, 190, 110, 20);
		this.add(BBeenden);
		
		BAnzeigen.addActionListener(e->anzeigen());
		BSpeichern.addActionListener(e->speichern());
		BClear.addActionListener(e->clear());
		BBeenden.addActionListener(e->close());
		
	}




	private void clear() {
		notes.deleteNote(days.getSelectedItem().toString());
	}




	private void speichern() {
		String d = days.getSelectedItem().toString();
		String t = termintxt.getText();
		
		if(t.length()>0){
			notes.putNote(d, t);
		}else {
			notes.deleteNote(d);
		}
	}

	private void anzeigen() {
		String d = days.getSelectedItem().toString();
		String t = notes.getNote(d);
		
		if(t == null) {
			termintxt.setText("keine Termine");
		}else {
			termintxt.setText(t);
		}
		
	}

	private void close() {
		this.dispose();
		System.exit(0);
	}

	public void setNotes(NotebookData notes) {
		this.notes = notes;
	}
	
	
}
