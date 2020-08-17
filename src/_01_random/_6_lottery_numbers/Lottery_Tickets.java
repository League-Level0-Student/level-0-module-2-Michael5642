package _01_random._6_lottery_numbers;

import java.util.Random;
import javax.swing.JOptionPane;

public class Lottery_Tickets {
public static void main(String[]args) {
Random num = new Random();
int t1 = num.nextInt(100)+1;
int t2 = num.nextInt(100)+1;
int t3 = num.nextInt(100)+1;
int t4 = num.nextInt(100)+1;
int t5 = num.nextInt(100)+1;
int t6 = num.nextInt(100)+1;
JOptionPane.showMessageDialog(null, " "+t1+" "+t2+" "+t3+" "+t4+" "+t5+" "+" "+t6, "Lottery Ticket", 0);






	}
}
