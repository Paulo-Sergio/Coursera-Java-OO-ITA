package tarefa2.outro;

import tarefa2.modificadoresacesso.Referencia;

public class OutraPacoteDiferente {

	public void testeAcesso() {
		Referencia r = new Referencia();
		// r.modificadorDefault = 0;
		r.modificadorPublico = 0;
		// r.modificadorProtegido = 0;
		// r.modificadorPrivado = 0;
	}
}
