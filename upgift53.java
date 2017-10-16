import javax.swing.*;



public class upgift53{
	public static void main(String[]args){

		int s = 0;
		int b;
		double r;



	b = Integer.parseInt(JOptionPane.showInputDialog("hur högt upp från marken släpper du bollen?"));
	r = b;


	while (r >= 1){
		r = (r*0.70);

		s = (s + 1);


	}


	JOptionPane.showMessageDialog(null, r );
	JOptionPane.showMessageDialog(null, s );


	
		}
	}