package com.giovani.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
	
	static Calculadora calc;
	
	@BeforeAll
	public static void inicializacao() {
		calc = new Calculadora();
	}
	
	
	@Test
	public void testeSoma() {
		
		assertEquals(3, calc.somar(2, 1));
		
	}
	
	@Test
	public void testeDiminuir() {
		
		assertEquals(2, calc.diminuir(2, 1));
		
	}
	
	

}
