package automatos;

import java.util.ArrayList;
import java.util.Stack;

import model.automatoPilha.Cadeia;
import model.automatoPilha.Estado;
import model.automatoPilha.Transicao;

public class AutomatoDePilha {

	private ArrayList<Estado> estados;

	private Estado estadoDePartida;
	private Estado estadoDeFinalizacao;

	private Cadeia cadeia;

	private Stack<String> pilha;

	public AutomatoDePilha(ArrayList<Estado> estados, Cadeia cadeia) {
		super();
		this.estados = estados;
		this.cadeia = cadeia;
		this.pilha = new Stack<String>();
	}

	public ArrayList<String> run() {
		pilha.push("$");
		// buscando o estado inicial e final
		for (Estado e : estados) {
			if (e.isEstadoInicial()) {
				this.estadoDePartida = e;
			} else if (e.isEstadoFinal()) {
				this.estadoDeFinalizacao = e;
			}
		}

		return iterar(estadoDePartida, cadeia, new ArrayList<String>());
	}

	public ArrayList<String> iterar(Estado estado, Cadeia restoCadeia, ArrayList<String> iteracoes) {
		ArrayList<Transicao> listaDeTansicoes = estado.getTransicoes();

		Transicao t = checarRota(listaDeTansicoes, restoCadeia.getPrimeiroItem());
		if (t != null) {
			restoCadeia.removerprimeiroItem();
			iteracoes.add("|- " + t.getEstadoFinal().getNome() + " / " + cadeia.toString() + " / " + pilha.toString());
			return iterar(t.getEstadoFinal(), restoCadeia, iteracoes);
		} else {
			t = checarRota(listaDeTansicoes, "E");
			if (t != null) {
				iteracoes.add(
						"|- " + t.getEstadoFinal().getNome() + " / " + cadeia.toString() + " / " + pilha.toString());
				return iterar(t.getEstadoFinal(), restoCadeia, iteracoes);
			}
		}

		return iteracoes;
	}

	public Transicao checarRota(ArrayList<Transicao> transicoes, String lerDaCadeia) {

		String ler = "";
		String consome = "";
		String retorna = "";

		for (Transicao t : transicoes) {
			ler = "";
			consome = "";
			retorna = "";

			ArrayList<String> listPilha = new ArrayList<String>();
			for (String s : pilha) {
				listPilha.add(s);
			}

			for (String s : t.getLer())
				ler += s;
			for (String s : t.getConsome())
				consome += s;
			for (String s : t.getRetorna())
				retorna += s;

			// se o que posso ler é igual a o primeiro item da cadeia
			if (ler.equals(lerDaCadeia)) {

				// tenho pra ler da pilha
				String tenhoParaLer = "";
				if (pilha.size() >= consome.length()) {
					for (int i = 0; i < consome.length(); i++) {
						tenhoParaLer += listPilha.get((listPilha.size() - 1) - i);
					}
				}

				if (consome.equals(tenhoParaLer)) {
					for (char s : tenhoParaLer.toCharArray())
						pilha.pop();

					for (char c : retorna.toCharArray()) {
						String sc = c + "";
						if (!sc.equals("E")) {
							pilha.push(sc);
						}
					}

					return t;
				} else if (consome.equals("E")) {
					for (char c : retorna.toCharArray()) {
						String s = c + "";
						if (!s.equals("E")) {
							pilha.push(s);
						}
					}

					return t;
				}

			}

		}
		return null;
	}

	public ArrayList<Estado> getEstados() {
		return estados;
	}

	public void setEstados(ArrayList<Estado> estados) {
		this.estados = estados;
	}

	public Estado getEstadoDePartida() {
		return estadoDePartida;
	}

	public void setEstadoDePartida(Estado estadoDePartida) {
		this.estadoDePartida = estadoDePartida;
	}

	public Estado getEstadoDeFinalizacao() {
		return estadoDeFinalizacao;
	}

	public void setEstadoDeFinalizacao(Estado estadoDeFinalizacao) {
		this.estadoDeFinalizacao = estadoDeFinalizacao;
	}

	public Cadeia getCadeia() {
		return cadeia;
	}

	public void setCadeia(Cadeia cadeia) {
		this.cadeia = cadeia;
	}

	public Stack<String> getPilha() {
		return pilha;
	}

	public void setPilha(Stack<String> pilha) {
		this.pilha = pilha;
	}

}
