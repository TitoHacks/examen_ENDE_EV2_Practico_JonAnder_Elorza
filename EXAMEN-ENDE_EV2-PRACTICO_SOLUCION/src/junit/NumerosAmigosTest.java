package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	/*@Test
	public void testAmigo() {
		fail("Not yet implemented");
	}

	@Test
	public void testEsN1IgualAN2() {
		fail("Not yet implemented");
	}*/
	
	
	@Test
	public void testAmigoMal() {
		NumerosAmigos n1 = new NumerosAmigos(5,27);
		assertFalse(n1.amigo());
	}
	
	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos n2 = new NumerosAmigos(496,496);
		assertTrue(n2.amigo());
	}
	
	@Test
	public void testEsCeroN1() {
		NumerosAmigos n3 = new NumerosAmigos(0,2);
		assertNull(n3.esN1IgualAN2());
	}
	
	@Test
	public void testN1yN2SonIguales() {
		NumerosAmigos n4 = new NumerosAmigos(5,5);
		int res = n4.esN1IgualAN2();
		assertEquals(1,res);
		
		
	}
	
	@Test
	public void testN1yN2NoSonIguales() {
		NumerosAmigos n5 = new NumerosAmigos(4,5);
		int res = n5.esN1IgualAN2();
		assertNotEquals(1,res);
		
		
	}

}
