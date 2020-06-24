package test;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import calculadora.Calcula;


@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
	
	private Calcula calculaMock;

	@Before
	public void init() {
		calculaMock = Mockito.mock(Calcula.class);
	}
	
	@Test
	public void testMockSomar() {
		
		when(calculaMock.somar(10f, 10f)).thenReturn(20f);
	
		Assert.assertEquals(20f, calculaMock.somar(10f, 10f), 0);		
		
	}

	
	
}
