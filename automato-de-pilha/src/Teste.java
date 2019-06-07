import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) {
		String cadeia = JOptionPane.showInputDialog("Com base na Linguagem \n Digite uma cadeio");
		String cadeiaMont ="", contZ ="", contU ="";
		String[] cad = new String[cadeia.length()];
		
		for (int i = 0; i < cadeia.length(); i++) {
			cad[i] += cadeia.charAt(i);
			cadeiaMont = cad[i]+ ",";
		}
		
		for (int i = 0; i < cad.length; i++) {
			if(cad[i].equals(0)) {
				contZ+= "0";
			}/*else {
				contU += ","+"1";
			}*/
		}
		System.out.println(cadeiaMont);
		System.out.println("Z" +contZ);
		System.out.println(contU);
	}

}
