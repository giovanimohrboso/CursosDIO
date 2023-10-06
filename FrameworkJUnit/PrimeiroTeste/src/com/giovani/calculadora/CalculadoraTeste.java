package com.giovani.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
		
		assertEquals(1, calc.diminuir(2, 1));
		
	}
	
	
	@ParameterizedTest
	@CsvSource({"1,2,2","2,4,8"})
	public void testeMultiplicacao(int n1,int n2,int resultado) {
		
		assertEquals(resultado, calc.multiplicacao(n1, n2));
		
	}
	
	

}
