package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LottoGUI extends JFrame{
	private LottoDaten ldaten = new LottoDaten();
	
	//menu
	private JMenuBar Mbar;
	private JMenu Mfile;
	private JMenuItem MBeenden;
	//Tabellen Panel
	private JPanel Tpanel;
	private String[] header = {"KW","1.Zahl","2.Zahl","3.Zahl","4.Zahl","5.Zahl","6.Zahl"};
	private String[][] Tdaten = new String[52][7];
	private JTable Ttable;
	//GenerierungsPanel
	private JPanel Gpanel;
	private JLabel GKw;
	private JTextField Gtextarea;
	private JButton Ggenerieren, Gspeichern;
	

	public LottoGUI(){
		this.setTitle("6 aus 49 Lotto");
		this.setBounds(100, 100, 600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Mbar = new JMenuBar();
		Mfile = new JMenu("File");
		MBeenden = new JMenuItem("Beenden");
		
		Mfile.add(MBeenden);
		Mbar.add(Mfile);
		this.setJMenuBar(Mbar);
		
		this.setLayout(new GridLayout(2,1));
		
		Tpanel = new JPanel();
		Tpanel.setLayout(new BorderLayout());
		
		Ttable = new JTable(Tdaten,header);
		Tpanel.add(new JScrollPane(Ttable), BorderLayout.CENTER);
		
		this.add(Tpanel);
		
		
		
		Gpanel = new JPanel();
		Gpanel.setLayout(null);
		
		GKw = new JLabel("Kalenderwoche:");
		GKw.setBounds(30, 20, 100, 20);
		Gpanel.add(GKw);
		
		Gtextarea = new JTextField();
		Gtextarea.setBounds(180, 20, 120, 20);
		Gpanel.add(Gtextarea);
		
		Ggenerieren = new JButton("Generieren");
		Ggenerieren.setBounds(180, 50, 120, 20);
		Gpanel.add(Ggenerieren);
		
		Gspeichern = new JButton("Speichern");
		Gspeichern.setBounds(320, 50, 120, 20);
		Gpanel.add(Gspeichern);
		
		this.add(Gpanel);
		
		MBeenden.addActionListener(e->beenden());
		Ggenerieren.addActionListener(e->generieren());
		Gspeichern.addActionListener(e->speichern());
		
	}

	private void speichern() {
		
	}

	private void generieren() {
		if(Gtextarea.getText().length() == 0) {
			System.out.println("Fehler keine Eingabe");
		}//else if() {
			
		else {
			try {
				int i = Integer.parseInt(Gtextarea.getText());
				
				if(i < 1) {
					System.out.println("Fehler nummer zu klein");
				}else {
					ldaten.add(i);
				}
				

			}catch (NumberFormatException e) {
				System.out.println("Bitte ein Nummer");
			}

		}

	}

	private void beenden() {
			this.dispose();
			System.exit(0);

	}

	public void setLdaten(LottoDaten ldaten) {
		this.ldaten = ldaten;
	}
	
	
	
	
}
