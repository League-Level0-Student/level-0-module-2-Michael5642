package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_booth {
public static void main(String[]args) {
String ageAsk = JOptionPane.showInputDialog("how old are you?");
int ageNum = Integer.parseInt(ageAsk);	
	if(ageNum>=18) {
		JOptionPane.showMessageDialog(null, "who should the next president be?");
	}
	else {
		JOptionPane.showMessageDialog(null, "wait a few years until you can vote");
	}
	
	
	
}
}
