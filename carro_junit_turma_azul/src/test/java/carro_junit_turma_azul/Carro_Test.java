package carro_junit_turma_azul;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Carro_Test {
	final double DELTA = 0.1; // usado para evitar erro de diferente por conta das casas decimais

	
/*
	@Test
	public void testligar() {

		Carro carro  = new Carro();

		carro.ligar();

		assertEquals(carro.ligado);
	}

	
	
	@Test
	public void testdesligar() {

		Carro carro = new Carro();

		carro.ligar();

		assertEquals(false,carro);
		
	}

	
	*/
	
	
	@Test
	public void acelerarComSucessoTest() {
		
		//Cenario 
		Carro carro = new Carro();
		
		//ação 
		
		carro.acelerar(50);
		
         //verificação 
		assertEquals(50, carro.veloatual, DELTA);

	}

}



