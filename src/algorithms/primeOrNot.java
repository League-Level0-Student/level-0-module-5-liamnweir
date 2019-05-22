package algorithms;

import javax.swing.JOptionPane;

public class primeOrNot {
public static void main(String[] args) {
	

	
	String prime=JOptionPane.showInputDialog("Give me a number and I will figure out if it is prime or not!");
	
	int Prime=Integer.parseInt(prime);
	
	boolean a=false;
	for (int i = 2; i == Prime; i++) {
		if (Prime%i==0) {
			a=true;
		}
		else {
			a=false;
			
		}
	}
	if (a==true) {
		JOptionPane.showMessageDialog(null, "That number is prime!");	
	}
	else {
		JOptionPane.showMessageDialog(null, "That number is not a prime number!");
		
	}
		
		
	}
		
	
		
			
		
		
	
	
	
	
	
	
	
	
	
	
	
}







