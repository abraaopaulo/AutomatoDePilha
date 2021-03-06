package test;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import automatos.AutomatoDePilha;
import model.automatoPilha.Cadeia;
import model.automatoPilha.Estado;
import model.automatoPilha.Iteracao;
import model.automatoPilha.Transicao;

public class APLinguagem0n1n {
	
	public void testar() {
		String cadeia = JOptionPane.showInputDialog("Com base na Linguagem L={0^n, 1^n | n>=1} \n Digite uma cadeio");

		char[] elementos = cadeia.toCharArray();

		String[] elementosProntos = new String[elementos.length];
		for (int i = 0; i < elementos.length; i++) {
			elementosProntos[i] = elementos[i] + "";
		}

		ArrayList<Estado> estados = new ArrayList<>();

		Estado q0 = new Estado();
		q0.setNome("q0");
		Estado q1 = new Estado();
		q1.setNome("q1");
		Estado q2 = new Estado();
		q2.setNome("q2");

		q0.setEstadoInicial(true);
		q2.setEstadoFinal(true);

		estados.add(q0);
		estados.add(q1);
		estados.add(q2);

		ArrayList<Transicao> q0Transicoes = new ArrayList<>();
		q0Transicoes.add(new Transicao(estados.get(0), estados.get(0), "0", "E", "x"));
		q0Transicoes.add(new Transicao(estados.get(0), estados.get(1), "E", "E", "E"));

		ArrayList<Transicao> q1Transicoes = new ArrayList<>();
		q1Transicoes.add(new Transicao(estados.get(1), estados.get(1), "1", "x", "E"));
		q1Transicoes.add(new Transicao(estados.get(1), estados.get(2), "E", "$", "$"));

		ArrayList<Transicao> q3Transicoes = new ArrayList<>();

		q0.setTransicoes(q0Transicoes);
		q1.setTransicoes(q1Transicoes);
		q2.setTransicoes(q3Transicoes);

		Cadeia c = new Cadeia();
		 c.setItens(elementosProntos);
		//c.setItens("0", "0", "0", "1", "1", "1");

		AutomatoDePilha a = new AutomatoDePilha(estados, c);
		ArrayList<Iteracao> listresul = a.run();
		for (Iteracao i : listresul)
			System.out.println("|-"+i.getNomeEstado()+" / "+i.getCadeia().toString()+" / "+i.getPilha().toString());

	}

}
