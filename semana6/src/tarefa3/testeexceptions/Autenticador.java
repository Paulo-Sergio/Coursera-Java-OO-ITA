package tarefa3.testeexceptions;

public class Autenticador {

	public Usuario logar(String login, String senha) throws LoginException {
		if (login.equals("paulo") && senha.equals("123456")) {
			return new Usuario(login);
		}
		throw new LoginException("O usuario e senha n�o batem!", login);
	}

}
