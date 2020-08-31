package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class N_fakultet {

	public static void main(String[] args) {
		int n = 1;
		int n_gang=1;
		int total = 1;
		boolean feil = (true);
		int gang = 1;
		
		while (feil) {
			n = Integer.parseInt(showInputDialog("Tast inn et positivt heltall"));
			if (n<0) {
				showMessageDialog(null, "Oops, du tastet inn et negativt tall. Prøv igjen.");
			} else {
				feil = false;
			}
		}
		for (int i=1; i<=n; i++) {
			total=i*total;
			
		}
		showMessageDialog(null, n +"! er: "+ total);
	}

}
