import javax.swing.*;




public class upgift44{
	public static void main(String[]args){

		String p; /* personnummer */

		String namn;
		int num;


		namn = JOptionPane.showInputDialog("Är du tjej eller kille?");

		p = JOptionPane.showInputDialog("Vad är ditt personnummer? \n skriv med 10 siffror.");



		num = (int)(p.charAt(7) - '0');
		if((num%2 == 0 && namn.equals("tjej")) || (num%2 != 0 && namn.equals("kille"))){
			JOptionPane.showMessageDialog(null, "de e sant");
		}
		else {
			JOptionPane.showMessageDialog(null, "de e falskt");

		}







	}
}

