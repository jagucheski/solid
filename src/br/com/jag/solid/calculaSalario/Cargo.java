package br.com.jag.solid.calculaSalario;

public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorcento()), 
	DBA(new QuinzeOuVinteCincoPorcento()), 
	TESTER(new QuinzeOuVinteCincoPorcento());

	private Calcula calculo;

	Cargo(Calcula calculo) {
		this.calculo = calculo;
	}

	public Calcula getCalculo() {
		return calculo;
	}

}
