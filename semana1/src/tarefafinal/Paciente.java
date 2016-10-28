package tarefafinal;

public class Paciente {

	double peso;
	double altura;
	double imc;

	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public double calculaImc() {
		return imc = peso / (altura * altura);
	}

	public String diagnostico() {
		double resultado = calculaImc();
		String diagnostico;

		if (resultado < 16) {
			diagnostico = "Baixo peso muito grave";
		} else if (resultado >= 16 && resultado <= 16.99) {
			diagnostico = "Baixo peso grave";
		} else if (resultado >= 17 && resultado <= 18.49) {
			diagnostico = "Baixo peso";
		} else if (resultado >= 18.50 && resultado <= 24.99) {
			diagnostico = "Peso normal";
		} else if (resultado >= 25 && resultado <= 29.99) {
			diagnostico = "Sobrepeso";
		} else if (resultado >= 30 && resultado <= 34.99) {
			diagnostico = "Obesidade grau I";
		} else if (resultado >= 35 && resultado <= 39.99) {
			diagnostico = "Obesidade grau II";
		} else {
			diagnostico = "Obesidade grau III";
		}

		return diagnostico;
	}
}
