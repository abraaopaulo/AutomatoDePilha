package test;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {

		int opc = -1;
		while (opc != 0) {

			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite uma opção " + "\n1 Automato de pilha " + "\n2 Maquina de Turing" + "\n0 Sair"));
			switch (opc) {

			case 1:
				new APLinguagem0n1n().testar(); 
				System.out.println("\n");
				break;

			case 2:
				new TMLinguagem().testar();
				System.out.println("\n");
				break;
			case 0:
				break;

			}
		}
		
	}
}
