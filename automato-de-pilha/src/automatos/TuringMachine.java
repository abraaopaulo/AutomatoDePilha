package automatos;

import java.util.ArrayList;
import java.util.LinkedList;

import model.automatoPilha.Cadeia;
import model.turing.EstadoTM;
import model.turing.TransicaoTM;

public class TuringMachine {

	private ArrayList<EstadoTM> estados;
	private ArrayList<String> cadeia = new ArrayList<String>();
	private int ponteiro;

	public TuringMachine(ArrayList<EstadoTM> estados, Cadeia cadeia) {
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

		if (e.isFinal()) {
			System.out.println("cadeia aceita");
			return resul;
		} else {

			ArrayList<TransicaoTM> transicaos = e.getTransicoes();
			for (TransicaoTM t : transicaos) {
				if (t.getLer().equals(cadeia.get(ponteiro))) {
					if (!e.isFinal()) {
						cadeia.set(ponteiro, t.getEscrever());
						if (t.getAndar().equals("R")) {
							ponteiro++;
						} else {
							ponteiro--;
						}
						System.out.println();
						System.out.print(e.getNome());
						for (int i = 0; i < cadeia.size(); i++) {
							if (i == ponteiro) {
								System.out.print(",->" + cadeia.get(i) + "<-");
							} else {
								System.out.print("," + cadeia.get(i));
							}
						}

						return interacao(t.getEstadoFinal(), resul);

					}

				}
			}
		}
		System.out.println("Erro na cadeia");
		return null;

	}

}
