import javax.swing.*;




public class EnGrej{
	public static void main(String[]args) {
		int k; /* Kontant */
		int n; /* Normal */
		int p; /* Plus */
		int m; /* Minuter per månad*/

		String namn; 


		namn = JOptionPane.showInputDialog("Hello!" + " What is your name?");
		m = Integer.parseInt(JOptionPane.showInputDialog(null, "Hello "+ namn + ", How many minutes do you call for each month" ));


		if (m <= 33) {
			JOptionPane.showMessageDialog(null, "You should take the Kontant subscription");
		}
			else if (m > 33 && m < 66 ) {
				JOptionPane.showMessageDialog(null, "You should take the Normal subscription");
			}
			else {
				JOptionPane.showMessageDialog(null, " You should take the Plus subscription");
			}

			


	
			
}
}
