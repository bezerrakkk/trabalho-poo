package br.edu.ifpr.trabalho.poo.modelo;

public class Aluno extends Pessoa {
	int anoIngresso;
public Aluno() {
	
}
public Aluno(int anoIngresso) {
	super();
	this.anoIngresso = anoIngresso;
}
public int getAnoIngresso() {
	return anoIngresso;
}
public void setAnoIngresso(int anoIngresso) {
	this.anoIngresso = anoIngresso;
}

}
