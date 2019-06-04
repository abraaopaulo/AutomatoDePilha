package modelTM;

public class Transicao {

	private Estado estadoInicial;
	private Estado estadoFinal;
	private String ler, escrever, andar;

	public Transicao() {

	}

	public Transicao(Estado estadoInicial, Estado estadoFinal, String ler, String escrever, String andar) {
		super();
		this.estadoInicial = estadoInicial;
		this.estadoFinal = estadoFinal;
		this.ler = ler;
		this.escrever = escrever;
		this.andar = andar;
	}

	public Estado getEstadoInicial() {
		return estadoInicial;
	}

	public void setEstadoInicial(Estado estadoInicial) {
		this.estadoInicial = estadoInicial;
	}

	public Estado getEstadoFinal() {
		return estadoFinal;
	}

	public void setEstadoFinal(Estado estadoFinal) {
		this.estadoFinal = estadoFinal;
	}

	public String getLer() {
		return ler;
	}

	public void setLer(String ler) {
		this.ler = ler;
	}

	public String getEscrever() {
		return escrever;
	}

	public void setEscrever(String escrever) {
		this.escrever = escrever;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

}
