package automatoTM;

import java.util.ArrayList;
import java.util.LinkedList;

import model.Cadeia;
import modelTM.Estado;
import modelTM.Transicao;

public class AutomatoTM {

	private ArrayList<Estado> estados;
	private ArrayList<String> cadeia = new ArrayList<String>();
	private int ponteiro;

	public AutomatoTM(ArrayList<Estado> estados, Cadeia cadeia) {
		this.estados = estados;
		for (String c : cadeia.getItens()) {
			this.cadeia.add(c);
		}
	}

	public ArrayList<String> run() {
		for (int i = 0; i < cadeia.size(); i++) {
			if (!cadeia.get(i).equals("[]")) {
				ponteiro = i;
				break;
			}
		}

		for (Estado e : estados) {
			if (e.isInicial()) {
				return interacao(e, new ArrayList<String>());
			}
			break;
		}
		return null;

	}

	public ArrayList<String> interacao(Estado e, ArrayList<String> resul) {
		ArrayList<String> resultado = null;
		if(resul != null)
			resultado = resul;

		ArrayList<Transicao> transicaos = e.getTransicoes();
		for (Transicao t : transicaos) {
			if (t.getLer().equals(cadeia.get(ponteiro))) {
				cadeia.set(ponteiro, t.getEscrever());
				if (t.getAndar().equals("R")) {
					ponteiro++;
				} else {
					ponteiro--;
				}
				System.out.println(cadeia.toString());
				
				if (!t.getEstadoFinal().isFinal()) {
					return interacao(t.getEstadoFinal(), resultado);
				}
			}
		}

		return resultado;

	}

}
