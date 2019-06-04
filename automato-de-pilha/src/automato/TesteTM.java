package automato;

import java.util.ArrayList;

import automatoTM.AutomatoTM;
import model.Cadeia;
import modelTM.Estado;
import modelTM.Transicao;

public class TesteTM {

	public static void main(String[] args) {

		ArrayList<Estado> estados = new ArrayList<>();

		Estado q0 = new Estado();
		q0.setNome("q0");
		Estado q1 = new Estado();
		q1.setNome("q1");
		Estado q2 = new Estado();
		q2.setNome("q2");
		Estado q3 = new Estado();
		q3.setNome("q3");
		Estado q4 = new Estado();
		q4.setNome("q4");
		Estado q5 = new Estado();
		q5.setNome("q5");
		Estado q6 = new Estado();
		q6.setNome("q6");
		Estado q7 = new Estado();
		q7.setNome("q7");
		Estado q8 = new Estado();
		q8.setNome("q8");
		Estado q9 = new Estado();
		q9.setNome("q9");
		Estado q10 = new Estado();
		q10.setNome("q10");
		Estado q11 = new Estado();
		q11.setNome("q11");
		Estado q12 = new Estado();
		q12.setNome("q12");
		Estado q13 = new Estado();
		q13.setNome("q13");
		Estado q14 = new Estado();
		q14.setNome("q14");

		q0.setInicial(true);
		q14.setFinal(true);

		estados.add(q0);
		estados.add(q1);
		estados.add(q2);
		estados.add(q3);
		estados.add(q4);
		estados.add(q5);
		estados.add(q6);
		estados.add(q7);
		estados.add(q8);
		estados.add(q9);
		estados.add(q10);
		estados.add(q11);
		estados.add(q12);
		estados.add(q13);
		estados.add(q14);

		ArrayList<Transicao> q0Transicoes = new ArrayList<>();
		q0Transicoes.add(new Transicao(estados.get(0), estados.get(0), "0", "0", "R"));
		q0Transicoes.add(new Transicao(estados.get(0), estados.get(1), "1", "1", "R"));

		ArrayList<Transicao> q1Transicoes = new ArrayList<>();
		q1Transicoes.add(new Transicao(estados.get(1), estados.get(1), "1", "1", "R"));
		q1Transicoes.add(new Transicao(estados.get(1), estados.get(2), "0", "0", "R"));

		ArrayList<Transicao> q2Transicoes = new ArrayList<>();
		q2Transicoes.add(new Transicao(estados.get(2), estados.get(2), "0", "0", "R"));
		q2Transicoes.add(new Transicao(estados.get(2), estados.get(3), "[]", "[]", "L"));

		ArrayList<Transicao> q3Transicoes = new ArrayList<>();
		q3Transicoes.add(new Transicao(estados.get(3), estados.get(4), "0", "[]", "L"));

		ArrayList<Transicao> q4Transicoes = new ArrayList<>();
		q4Transicoes.add(new Transicao(estados.get(4), estados.get(5), "0", "[]", "L"));
		// q1Transicoes.add(new Transicao(estados.get(1),estados.get(2),"E","$","$"));

		ArrayList<Transicao> q5Transicoes = new ArrayList<>();
		q5Transicoes.add(new Transicao(estados.get(5), estados.get(6), "0", "[]", "L"));
		// q0Transicoes.add(new Transicao(estados.get(0),estados.get(1),"E","E","E"));

		ArrayList<Transicao> q6Transicoes = new ArrayList<>();
		q6Transicoes.add(new Transicao(estados.get(6), estados.get(7), "0", "0", "L"));
		// q1Transicoes.add(new Transicao(estados.get(1),estados.get(2),"E","$","$"));

		ArrayList<Transicao> q7Transicoes = new ArrayList<>();
		q7Transicoes.add(new Transicao(estados.get(7), estados.get(7), "0", "0", "L"));
		q7Transicoes.add(new Transicao(estados.get(7), estados.get(8), "1", "0", "L"));

		ArrayList<Transicao> q8Transicoes = new ArrayList<>();
		q8Transicoes.add(new Transicao(estados.get(8), estados.get(9), "1", "0", "L"));
		// q8Transicoes.add(new Transicao(estados.get(8),estados.get(2),"E","$","$"));

		ArrayList<Transicao> q9Transicoes = new ArrayList<>();
		q9Transicoes.add(new Transicao(estados.get(9), estados.get(9), "1", "1", "L"));
		q9Transicoes.add(new Transicao(estados.get(9), estados.get(10), "0", "0", "L"));

		ArrayList<Transicao> q10Transicoes = new ArrayList<>();
		q10Transicoes.add(new Transicao(estados.get(10), estados.get(10), "0", "0", "L"));
		q10Transicoes.add(new Transicao(estados.get(10), estados.get(11), "[]", "[]", "R"));

		ArrayList<Transicao> q11Transicoes = new ArrayList<>();
		q11Transicoes.add(new Transicao(estados.get(11), estados.get(12), "0", "[]", "R"));
		// q11Transicoes.add(new Transicao(estados.get(0),estados.get(1),"E","E","E"));

		ArrayList<Transicao> q12Transicoes = new ArrayList<>();
		q12Transicoes.add(new Transicao(estados.get(12), estados.get(12), "0", "0", "R"));
		q12Transicoes.add(new Transicao(estados.get(12), estados.get(1), "1", "1", "R"));
		q12Transicoes.add(new Transicao(estados.get(12), estados.get(13), "[]", "[]", "L"));

		ArrayList<Transicao> q13Transicoes = new ArrayList<>();
		q13Transicoes.add(new Transicao(estados.get(13), estados.get(13), "0", "[]", "L"));
		q13Transicoes.add(new Transicao(estados.get(13), estados.get(14), "[]", "[]", "R"));

		ArrayList<Transicao> q14Transicoes = new ArrayList<>();

		// ArrayList<Transicao> q3Transicoes = new ArrayList<>();

		q0.setTransicoes(q0Transicoes);
		q1.setTransicoes(q1Transicoes);
		q2.setTransicoes(q2Transicoes);
		q3.setTransicoes(q3Transicoes);
		q4.setTransicoes(q4Transicoes);
		q5.setTransicoes(q5Transicoes);
		q6.setTransicoes(q6Transicoes);
		q7.setTransicoes(q7Transicoes);
		q8.setTransicoes(q8Transicoes);
		q9.setTransicoes(q9Transicoes);
		q10.setTransicoes(q10Transicoes);
		q11.setTransicoes(q11Transicoes);
		q12.setTransicoes(q12Transicoes);
		q13.setTransicoes(q13Transicoes);
		q14.setTransicoes(q14Transicoes);

		Cadeia c = new Cadeia();
		c.setItens("[]", "[]", "[]", "0", "0", "1", "1", "1", "1", "0", "0", "0", "0", "0", "0", "[]", "[]", "[]");

		AutomatoTM a = new AutomatoTM(estados, c);
		
		ArrayList<String> listresul = a.run();
		for (String r : listresul)
			System.out.println(r);
	}
	// L = {0n, 1²n, 0³n| n>1}
	// String[] fita =
	// {"[]","[]","[]","0","0","1","1","1","1","0","0","0","0","0","0","[]","[]","[]"};

}
