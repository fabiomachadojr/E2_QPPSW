package test;


import org.junit.Assert;
import org.junit.Test;

import calculadora.Calcula;

public class CalculaTest {


	@Test
	public void testValidaSoma() {
		Calcula calcula = new Calcula();
		float num1 = 10f;
		float num2 = 10f;
		float saidaExp = 20f;
		Assert.assertEquals(saidaExp,calcula.somar(num1, num2),0);
	}
	

	@Test
	public void testValidaSubtracao() {
		Calcula calcula = new Calcula();
		float num1 = 10f;
		float num2 = 10f;
		float saidaExp = 0f;
		Assert.assertEquals(saidaExp,calcula.subtrair(num1, num2),0);
	}
}
