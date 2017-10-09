import javax.swing.*;




public class upgift43{
	public static void main(String[]args){


		int p; /* postnummer */

		String namn; /* Namn */


		namn = JOptionPane.showInputDialog("Tjena!" + " Vad heter du?");

		p = Integer.parseInt(JOptionPane.showInputDialog("Hej " + namn + ", vad är ditt postnummer?" ));



		p = p/1000;

		if ((p >=20 && p <= 62) || (p == 65 || p == 66)){
			JOptionPane.showMessageDialog(null, "Du är från Götaland");
		}
		else if (p >= 80){
			JOptionPane.showMessageDialog(null, "Men tjena norrläningen");
		}
		else if ((p >= 1 && p < 20) || (p == 63 || p == 64)) {
			JOptionPane.showMessageDialog(null, "Du är från svealand");
		}
		


	}
 }
