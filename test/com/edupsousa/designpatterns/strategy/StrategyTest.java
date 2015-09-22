package com.edupsousa.designpatterns.strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StrategyTest {

	ClasseComStrategy objeto;
	
	@Before
	public void initialize() {
		objeto = new ClasseComStrategy();
	}
	
	@Test
	public void testarPadraoStrategyConcretaA() {

		objeto.defineStrategy(new StrategyConcretaA());
		assertEquals("Ação realizada por StrategyConcretaA", objeto.usaStrategyParaFazerAlgo());
		
	}
	
	@Test
	public void testarPadraoStrategyConcretaB() {
		objeto.defineStrategy(new StrategyConcretaB());
		assertEquals("Ação realizada por StrategyConcretaB", objeto.usaStrategyParaFazerAlgo());
	}

}
