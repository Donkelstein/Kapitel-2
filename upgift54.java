
import javax.swing.*;



public class upgift54{
	public static void main(String[]args){
		int k = 0;
		String s;



		while (true){

		s = JOptionPane.showInputDialog("hur högt upp från marken släpper du bollen?");
		if (s==null){
			break;
			}
			


		double r = Double.parseDouble(s);

		while (r >= 1){
			r = (r*0.70);
			k = (k + 1);
		}

		JOptionPane.showMessageDialog(null, k );

			}
		JOptionPane.showMessageDialog(null, "Välkommen åter");
		}	
	}  
