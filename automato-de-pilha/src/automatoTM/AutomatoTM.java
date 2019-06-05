package automatoTM;

import java.util.ArrayList;
import java.util.LinkedList;

import model.Cadeia;
import modelTM.EstadoTM;
import modelTM.TransicaoTM;

public class AutomatoTM {

	private ArrayList<EstadoTM> estados;
	private ArrayList<String> cadeia = new ArrayList<String>();
	private int ponteiro;

	public AutomatoTM(ArrayList<EstadoTM> estados, Cadeia cadeia) {
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

		for (EstadoTM e : estados) {
			if (e.isInicial()) {
				return interacao(e, new ArrayList<String>());
			}
			break;
		}
		return null;

	}

	public ArrayList<String> interacao(EstadoTM e, ArrayList<String> resul) {
		ArrayList<String> resultado = null;
		if(resul != null)
			resultado = resul;

		ArrayList<TransicaoTM> transicaos = e.getTransicoes();
		for (TransicaoTM t : transicaos) {
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
