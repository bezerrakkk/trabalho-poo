package br.edu.ifpr.trabalho.poo.modelo;
Aa
public class Professor extends Pessoa {
	private String siape;

	public Professor() {

	}

	public Professor(String siape) {
		super();
		this.siape = siape;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}
}
