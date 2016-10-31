package tarefa3.testeexceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutenticador {

	@Test
	public void testComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("paulo", "123456");
		assertEquals("paulo", u.getLogin());
	}

	@Test(expected = LoginException.class)
	public void loginFalha() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("paulo", "000000");
		assertEquals("paulo", u.getLogin());
	}
	
	@Test
	public void informacaoDoErro() {
		Autenticador a = new Autenticador();
		Usuario u;
		try {
			u = a.logar("paulo", "000000");
			fail();
		} catch (LoginException e) {
			System.out.println(e.getMessage());
			assertEquals("paulo", e.getLogin());
		}
	}
}
