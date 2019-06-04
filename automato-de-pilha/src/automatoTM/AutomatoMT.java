package automatoTM;

import java.util.ArrayList;
import java.util.LinkedList;

import modelTM.Estado;
import modelTM.Transicao;

public class AutomatoMT {

	private ArrayList<String> fita;
	private ArrayList<Estado> estados;
	private ArrayList<String> cadeia;
	private int ponteiro;

	public AutomatoMT(ArrayList<Estado> estados, ArrayList<String> cadeia) {
		super();
		this.fita = new ArrayList<String>();
		this.estados = estados;
		this.cadeia = cadeia;
	}

	public void run() {
		for (int i = 0; i < cadeia.size(); i++) {
			if (!cadeia.get(i).equals("[]")) {
				ponteiro = i;
				break;
			}
		}

		for (Estado e : estados) {
			if (e.isFinal()) {
				interacao(e);
			}
		}

	}

	public void interacao(Estado e) {
		ArrayList<Transicao> transicaos = e.getTransicoes();
		for (Transicao t : transicaos) {
			if(t.getLer().equals(cadeia.get(ponteiro))) {
				cadeia.set(ponteiro, t.getEscrever());
				if(t.getAndar().equals("R")) {
					ponteiro++;
				}else{
					ponteiro--;
				}
			}
		}
	}

}
