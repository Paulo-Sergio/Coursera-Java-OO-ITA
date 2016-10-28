package tarefafinal;

public class Principal {

	public static void main(String[] args) {

		Paciente p1 = new Paciente(88, 1.68);
		System.out.println("IMC: " + p1.calculaImc());
		System.out.println("Diagnostico: " + p1.diagnostico());
		
		System.out.println("-----------------------------");
		
		Paciente p2 = new Paciente(75, 1.75);
		System.out.println("IMC: " + p2.calculaImc());
		System.out.println("Diagnostico: " + p2.diagnostico());
		
		System.out.println("-----------------------------");
		
		Paciente p3 = new Paciente(115, 1.70);
		System.out.println("IMC: " + p3.calculaImc());
		System.out.println("Diagnostico: " + p3.diagnostico());
	}

}
