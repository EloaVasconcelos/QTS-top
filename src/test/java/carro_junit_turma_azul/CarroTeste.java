package carro_junit_turma_azul;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class CarroTeste {
	
	@Test 
	public void Ligado() {
		// cenário
		Carro carro = new Carro();
		// ação
         carro.ligar();
		// verificação
		assertTrue(carro.ligado);
	}
	
	
	@Test 
	public void desligado () {
		// cenário
		Carro carro = new Carro();
		// ação
         carro.desligar();
		// verificação
		assertFalse(carro.desligado);
	}
	
	
	
	@Test
	public void acelerarComSucesso() {
		//cenario

		Carro carro = new Carro(); 
		carro.ligar();
		carro.veloatual = 0;
		carro.velomax = 100;
		//acao
		carro.acelerar(50);
		
		//verificacao
		assertEquals(50, carro.veloatual, 0.1);
		
	}


	@Test
	public void acelerarCarroDesligado() {
		//cenario

		Carro carro = new Carro(); 
		carro.desligar();
		carro.veloatual = 0;
		carro.velomax = 100;
		//acao
		carro.acelerar(10);
		
		//verificacao
		assertEquals(0, carro.veloatual, 0.1);
		
	}
	@Test
	public void acelerarSemsucesso() {
		//cenario
		Carro carro = new Carro();
		carro.ligar();
		carro.veloatual = 150;
		carro.velomax = 250;
        
		//acao
	    carro.acelerar(101);
		
		//verificacao
		assertEquals(250, carro.velomax, 0.1);
		
	}
	
	@Test
	public void testFrear() {
		//cenario
		Carro carro = new Carro();
		carro.ligar();
		carro.veloatual = 100;

		//acao
		carro.frear (20);
		
		//verificacao
		assertEquals(80, carro.veloatual, 0.1);
	
}
	
	@Test
	public void testFrearMax() {
		//cenario
		Carro carro = new Carro();
		carro.ligar();
		carro.veloatual = 100;

		//acao
		carro.frear (100);
		
		//verificacao
		assertEquals(0, carro.veloatual, 0.1);
	
}
}






