package tarefa1.heranca;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaCorrente {

	ContaCorrente cc;
	
	@Before
	public void inicializaConta(){
		cc = new ContaCorrente();
		cc.depositar(200);
	}
	
	@Test
	public void deposito() {
		assertEquals(200, cc.saldo);
	}
	
	@Test
	public void saque() {
		int valorSacado = cc.sacar(50);
		assertEquals(150, cc.saldo);
		assertEquals(50, valorSacado);
	}
	
	@Test
	public void saqueMaiorQueSaldo() {
		int valorSacado = cc.sacar(250);
		assertEquals(200, cc.saldo);
		assertEquals(0, valorSacado);
	}

}
