package modelTM;

public class TransicaoTM {

	private EstadoTM estadoInicial;
	private EstadoTM estadoFinal;
	private String ler, escrever, andar;

	public TransicaoTM() {

	}

	public TransicaoTM(EstadoTM estadoInicial, EstadoTM estadoFinal, String ler, String escrever, String andar) {
		super();
		this.estadoInicial = estadoInicial;
		this.estadoFinal = estadoFinal;
		this.ler = ler;
		this.escrever = escrever;
		this.andar = andar;
	}

	public EstadoTM getEstadoInicial() {
		return estadoInicial;
	}

	public void setEstadoInicial(EstadoTM estadoInicial) {
		this.estadoInicial = estadoInicial;
	}

	public EstadoTM getEstadoFinal() {
		return estadoFinal;
	}

	public void setEstadoFinal(EstadoTM estadoFinal) {
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
