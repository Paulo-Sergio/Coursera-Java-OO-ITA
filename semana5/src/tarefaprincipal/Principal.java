package tarefaprincipal;

public class Principal {

	public static void main(String[] args) {

		FormatadorNome informal = new Informal();
		FormatadorNome respeitoso = new Respeitoso(true);
		FormatadorNome comTitulo = new ComTitulo("Mestre");
		
		Autoridade a1 = new Autoridade("Paulo", "Franca", informal);
		Autoridade a2 = new Autoridade("Paulo", "Franca", respeitoso);
		Autoridade a3 = new Autoridade("Paulo", "Franca", comTitulo);
		
		System.out.println(a1.getTratamento());
		System.out.println(a2.getTratamento());
		System.out.println(a3.getTratamento());
	}

}
