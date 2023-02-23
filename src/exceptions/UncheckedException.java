package exceptions;

import javax.swing.JOptionPane;

public class UncheckedException {

	public static void main(String[] args) {
		
		boolean flag = true;
		JOptionPane.showMessageDialog(null, "Divisão para números inteiros!");
		do {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");		
			try {				
				int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
				JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
				System.out.println("Resultado: "+resultado);
				flag = false;
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "O valor de entrada deve ser um número inteiro.");
			}catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Nenhum número é divisível por zero.");
			}

		}while(flag);
		
	}
	public static int dividir(int a, int b) {
		return (a/b);
	}

}
