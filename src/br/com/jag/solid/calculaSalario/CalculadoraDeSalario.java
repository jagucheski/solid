package br.com.jag.solid.calculaSalario;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		return funcionario.getCargo().getCalculo().calcular(funcionario);

/***	Foi adicionado as classes de calculo ao enum, dessa forma o a classe funcionario pode chamar o cargo ]
 * 	   e efetuar o calculo de acordo com a classe vinculado ao cargo
 */
	  		
//		if (Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
//			return new DezOuVintePorcento().calcula(funcionario);
//		}
//
//		if (Cargo.DBA.equals(funcionario.getCargo()) || Cargo.TESTER.equals(funcionario.getCargo())) {
//			return new QuinzeOuVinteCincoPorcento().calcula(funcionario);
//		}
//
//		throw new RuntimeException("funcionario invalido");
	}

//  Removido pois foram criadas classes que efetuam estes calculos 
//	private double dezOuVintePorcento(Funcionario funcionario) {
//		if (funcionario.getSalarioBase() > 3000.0) {
//			return funcionario.getSalarioBase() * 0.8;
//		} else {
//			return funcionario.getSalarioBase() * 0.9;
//		}
//	}
//
//	private double quinzeOuVinteCincoPorcento(Funcionario funcionario) {
//		if (funcionario.getSalarioBase() > 2000.0) {
//			return funcionario.getSalarioBase() * 0.75;
//		} else {
//			return funcionario.getSalarioBase() * 0.85;
//		}
//	}

}
