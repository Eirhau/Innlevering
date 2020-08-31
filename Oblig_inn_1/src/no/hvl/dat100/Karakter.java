package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakter {

	public static void main(String[] args) {
		
		int p;
		int fg = 39;
		int eg = 49;
		int dg = 59;
		int cg = 79;
		int bg = 89;
		String stand = "Du fikk karakteren: ";
		
		for (int i=1; i<=10; i++) {
			 p = Integer.parseInt(showInputDialog("Hvor mange poeng fikk du? (Elev nr : "+ i +")"));
			 if (p<0 || p>100) {
				 showMessageDialog(null, "Feil: du tastet ikke inn et tall mellom 0 og 100");
				 i--;
			 } else if (p<=fg) {
				 showMessageDialog(null, stand + "F");
			 } else if (p<=eg) {
				 showMessageDialog(null, stand + "E");
			 } else if (p<=dg) {
				 showMessageDialog(null, stand + "D");
			 } else if (p<=cg) {
				 showMessageDialog(null, stand + "C");
			 } else if (p<=bg) {
				 showMessageDialog(null, stand + "B");
			 } else {
				 showMessageDialog(null, stand + "A");
			 }
		}
	}

}
