package modelTM;

import java.util.ArrayList;


public class Estado {

	private ArrayList<Transicao> transicoes;
	private String id;
	private boolean isInicial, isFinal;
	
	public Estado(ArrayList<Transicao> transicoes, String id, boolean isInicial, boolean isFinal) {
		super();
		this.transicoes = transicoes;
		this.id = id;
		this.isInicial = isInicial;
		this.isFinal = isFinal;
	}

	public Estado() {
		
	}

	
	public ArrayList<Transicao> getTransicoes() {
		return transicoes;
	}

	public void setTransicoes(ArrayList<Transicao> transicoes) {
		this.transicoes = transicoes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isInicial() {
		return isInicial;
	}

	public void setInicial(boolean isInicial) {
		this.isInicial = isInicial;
	}

	public boolean isFinal() {
		return isFinal;
	}

	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
	
	
	
	
}
