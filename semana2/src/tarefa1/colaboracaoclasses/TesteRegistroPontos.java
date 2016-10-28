package tarefa1.colaboracaoclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteRegistroPontos {

	@Test
	public void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		
		CalculadoraBonus cb = new CalculadoraBonus();
		
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		
		assertEquals(5, u.pontos);
	}
	
	@Test
	public void pontosCriarTopicoVIP() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true;
		
		CalculadoraBonus cb = new CalculadoraBonus();
		
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		
		assertEquals(25, u.pontos);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		
		assertEquals(15, u.pontos);
	}
	
	@Test
	public void pontosCriarTopicoVIPBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true;
		
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		
		assertEquals(75, u.pontos);
	}

}
