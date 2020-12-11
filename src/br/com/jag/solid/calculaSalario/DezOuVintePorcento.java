package br.com.jag.solid.calculaSalario;

public class DezOuVintePorcento implements Calcula {

	@Override
	public double calcular(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}

}
