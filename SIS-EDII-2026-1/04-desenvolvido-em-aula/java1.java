package java1;

import javax.swing.JOptionPane;

public class java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[10];
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
		}
		for(int i = 0; i < numeros.length; i++) {
			JOptionPane.showMessageDialog(null, numeros[i]);
			System.out.println(numeros[i]);
		}
	}

}
