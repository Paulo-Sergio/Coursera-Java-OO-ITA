package tarefa2.modificadoresacesso;

public class OutraMesmoPacote {

	public void testeAcesso() {
		Referencia r = new Referencia();
		r.modificadorDefault = 0;
		r.modificadorPublico = 0;
		r.modificadorProtegido = 0;
		// r.modificadorPrivado = 0;
	}
}
