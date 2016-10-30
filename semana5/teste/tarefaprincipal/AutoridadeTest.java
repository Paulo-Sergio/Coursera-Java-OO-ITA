package tarefaprincipal;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutoridadeTest {

	private Autoridade autoridade;
	private static final String NOME = "Paulo";
	private static final String SOBRENOME = "França";
	
	@Test
	public void testComTitulo() {
		FormatadorNome comTitulo = new ComTitulo("Magnifico");
		autoridade = new Autoridade(NOME, SOBRENOME, comTitulo);
		assertEquals("Magnifico Paulo França", autoridade.getTratamento());
	}
	
	@Test
	public void testInformal() {
		FormatadorNome infomal = new Informal();
		autoridade = new Autoridade(NOME, SOBRENOME, infomal);
		assertEquals("Paulo", autoridade.getTratamento());
	}
	
	@Test
	public void testRespeitosoM() {
		FormatadorNome respeitoso = new Respeitoso(true);
		autoridade = new Autoridade(NOME, SOBRENOME, respeitoso);
		assertEquals("Sr. França", autoridade.getTratamento());
	}
	
	@Test
	public void testRespeitosoF() {
		FormatadorNome respeitoso = new Respeitoso(false);
		autoridade = new Autoridade(NOME, SOBRENOME, respeitoso);
		assertEquals("Sra. França", autoridade.getTratamento());
	}

}
