package test;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import automatos.TuringMachine;
import model.automatoPilha.Cadeia;
import model.turing.EstadoTM;
import model.turing.TransicaoTM;

public class TMLinguagem {
	
	public void testar() {
		ArrayList<EstadoTM> estadosTM = new ArrayList<>(); 

		String cadeia = JOptionPane.showInputDialog("Com base na Linguagem L={0^n, 1^2n, 0^3n| n > 1}\n Digite uma cadeia");
		char[] elementos = cadeia.toCharArray();
		int j=0;
		
		String[] elementosProntos = new String[elementos.length + 6];

		for (int i = 0; i < elementos.length ; i++) {
			if (j < 3) {
				elementosProntos[j] = "[]";
				j++;
				i=-1;
			}else if( i < elementos.length) {
				elementosProntos[j] = elementos[i] + "";
				j++;

			}
		}
		
		if (elementosProntos[j] == null){
			elementosProntos[j] = "[]";
			elementosProntos[j+1] = "[]";
			elementosProntos[j+2] = "[]";
		}

		
		EstadoTM q0 = new EstadoTM();
		q0.setNome("q0");
		EstadoTM q1 = new EstadoTM();
		q1.setNome("q1");
		EstadoTM q2 = new EstadoTM();
		q2.setNome("q2");
		EstadoTM q3 = new EstadoTM();
		q3.setNome("q3");
		EstadoTM q4 = new EstadoTM();
		q4.setNome("q4");
		EstadoTM q5 = new EstadoTM();
		q5.setNome("q5");
		EstadoTM q6 = new EstadoTM();
		q6.setNome("q6");
		EstadoTM q7 = new EstadoTM();
		q7.setNome("q7");
		EstadoTM q8 = new EstadoTM();
		q8.setNome("q8");
		EstadoTM q9 = new EstadoTM();
		q9.setNome("q9");
		EstadoTM q10 = new EstadoTM();
		q10.setNome("q10");
		EstadoTM q11 = new EstadoTM();
		q11.setNome("q11");
		EstadoTM q12 = new EstadoTM();
		q12.setNome("q12");
		EstadoTM q13 = new EstadoTM();
		q13.setNome("q13");
		EstadoTM q14 = new EstadoTM();
		q14.setNome("q14");
		EstadoTM q15 = new EstadoTM();
		q15.setNome("q15");
		EstadoTM q16 = new EstadoTM();
		q16.setNome("q16");
		EstadoTM q17 = new EstadoTM();
		q17.setNome("q17");
		
		q0.setInicial(true);
		q17.setFinal(true);

		estadosTM.add(q0);
		estadosTM.add(q1);
		estadosTM.add(q2);
		estadosTM.add(q3);
		estadosTM.add(q4);
		estadosTM.add(q5);
		estadosTM.add(q6);
		estadosTM.add(q7);
		estadosTM.add(q8);
		estadosTM.add(q9);
		estadosTM.add(q10);
		estadosTM.add(q11);
		estadosTM.add(q12);
		estadosTM.add(q13);
		estadosTM.add(q14);
		estadosTM.add(q15);
		estadosTM.add(q16);
		estadosTM.add(q17);

		ArrayList<TransicaoTM> q0Transicoes = new ArrayList<>();
		q0Transicoes.add(new TransicaoTM(estadosTM.get(0), estadosTM.get(0), "0", "0", "R"));
		q0Transicoes.add(new TransicaoTM(estadosTM.get(0), estadosTM.get(1), "1", "1", "R"));

		ArrayList<TransicaoTM> q1Transicoes = new ArrayList<>();
		q1Transicoes.add(new TransicaoTM(estadosTM.get(1), estadosTM.get(1), "1", "1", "R"));
		q1Transicoes.add(new TransicaoTM(estadosTM.get(1), estadosTM.get(2), "0", "0", "R"));
		q1Transicoes.add(new TransicaoTM(estadosTM.get(1), estadosTM.get(3), "x", "x", "R"));

		ArrayList<TransicaoTM> q2Transicoes = new ArrayList<>();
		q2Transicoes.add(new TransicaoTM(estadosTM.get(2), estadosTM.get(2), "0", "0", "R"));
		q2Transicoes.add(new TransicaoTM(estadosTM.get(2), estadosTM.get(4), "[]", "[]", "L"));

		ArrayList<TransicaoTM> q3Transicoes = new ArrayList<>();
		q3Transicoes.add(new TransicaoTM(estadosTM.get(3), estadosTM.get(3), "x", "x", "R"));
		q3Transicoes.add(new TransicaoTM(estadosTM.get(3), estadosTM.get(2), "0", "0", "R"));
		q3Transicoes.add(new TransicaoTM(estadosTM.get(3), estadosTM.get(4), "[]", "[]", "L") );

		ArrayList<TransicaoTM> q4Transicoes = new ArrayList<>();
		q4Transicoes.add(new TransicaoTM(estadosTM.get(4), estadosTM.get(5), "0", "[]", "L"));
		// q1Transicoes.add(new Transicao(estados.get(1),estados.get(2),"E","$","$"));

		ArrayList<TransicaoTM> q5Transicoes = new ArrayList<>();
		q5Transicoes.add(new TransicaoTM(estadosTM.get(5), estadosTM.get(6), "0", "[]", "L"));
		// q0Transicoes.add(new Transicao(estados.get(0),estados.get(1),"E","E","E"));

		ArrayList<TransicaoTM> q6Transicoes = new ArrayList<>();
		q6Transicoes.add(new TransicaoTM(estadosTM.get(6), estadosTM.get(7), "0", "[]", "L"));
		// q1Transicoes.add(new Transicao(estados.get(1),estados.get(2),"E","$","$"));

		ArrayList<TransicaoTM> q7Transicoes = new ArrayList<>();
		q7Transicoes.add(new TransicaoTM(estadosTM.get(7), estadosTM.get(8), "0", "0", "L"));
		q7Transicoes.add(new TransicaoTM(estadosTM.get(7), estadosTM.get(9), "x", "x", "L"));

		ArrayList<TransicaoTM> q8Transicoes = new ArrayList<>();
		q8Transicoes.add(new TransicaoTM(estadosTM.get(8), estadosTM.get(8), "0", "0", "L"));
		q8Transicoes.add(new TransicaoTM(estadosTM.get(8), estadosTM.get(10), "1", "x", "L"));

		ArrayList<TransicaoTM> q9Transicoes = new ArrayList<>();
		q9Transicoes.add(new TransicaoTM(estadosTM.get(9), estadosTM.get(9), "x", "x", "L"));
		q9Transicoes.add(new TransicaoTM(estadosTM.get(9), estadosTM.get(10), "1", "x", "L"));

		ArrayList<TransicaoTM> q10Transicoes = new ArrayList<>();
		q10Transicoes.add(new TransicaoTM(estadosTM.get(10), estadosTM.get(11), "1", "x", "L"));

		ArrayList<TransicaoTM> q11Transicoes = new ArrayList<>();
		q11Transicoes.add(new TransicaoTM(estadosTM.get(11), estadosTM.get(11), "1", "1", "L"));
		q11Transicoes.add(new TransicaoTM(estadosTM.get(11), estadosTM.get(12), "0", "0", "L"));

		ArrayList<TransicaoTM> q12Transicoes = new ArrayList<>();
		q12Transicoes.add(new TransicaoTM(estadosTM.get(12), estadosTM.get(12), "0", "0", "L"));
		q12Transicoes.add(new TransicaoTM(estadosTM.get(12), estadosTM.get(13), "[]", "[]", "R"));

		ArrayList<TransicaoTM> q13Transicoes = new ArrayList<>();
		q13Transicoes.add(new TransicaoTM(estadosTM.get(13), estadosTM.get(14), "0", "[]", "R"));
		//q13Transicoes.add(new TransicaoTM(estadosTM.get(13), estadosTM.get(15), "x", "[]", "L"));
		
		ArrayList<TransicaoTM> q14Transicoes = new ArrayList<>();
		q14Transicoes.add(new TransicaoTM(estadosTM.get(14), estadosTM.get(14), "0", "0", "R"));
		q14Transicoes.add(new TransicaoTM(estadosTM.get(14), estadosTM.get(1), "1", "1", "R"));
		q14Transicoes.add(new TransicaoTM(estadosTM.get(14), estadosTM.get(15), "x", "[]", "R"));
		
		ArrayList<TransicaoTM> q15Transicoes = new ArrayList<>();
		q15Transicoes.add(new TransicaoTM(estadosTM.get(15), estadosTM.get(15), "x", "[]", "R"));
		q15Transicoes.add(new TransicaoTM(estadosTM.get(15), estadosTM.get(16), "[]", "[]", "R"));
		
		
		ArrayList<TransicaoTM> q16Transicoes = new ArrayList<>();
		q16Transicoes.add(new TransicaoTM(estadosTM.get(16), estadosTM.get(17), "[]", "[]", "L"));

		ArrayList<TransicaoTM> q17Transicoes = new ArrayList<>();

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
		q15.setTransicoes(q15Transicoes);
		q16.setTransicoes(q16Transicoes);
		q17.setTransicoes(q17Transicoes);

		Cadeia c = new Cadeia();
		// c.setItens("[]", "[]", "[]", "0", "0", "1", "1", "1", "1", "0", "0", "0",
		// "0", "0", "0", "[]", "[]", "[]");
		// c.setItens("[]", "[]", "[]",elementosProntos ,"[]", "[]", "[]");
		// c.addElementos({"[]", "[]", "[]"});
		c.setItens(elementosProntos);
		// c.addElementos("[]", "[]", "[]");

		TuringMachine a = new TuringMachine(estadosTM, c);

		ArrayList<String> listresul = a.run();
		for (String r : listresul)
			System.out.println(r);
	}
}
