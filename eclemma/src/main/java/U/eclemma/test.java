package U.eclemma;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {
	calculadora cal = new calculadora();
	
@Test
	public void suma(){
		
		// test suma
		assertTrue(cal.suma(3, 5)==8);
		assertFalse(cal.suma(2, 9)==5);
		assertTrue(cal.resta(7, 5)==2);
		
	}

@Test
	public void multiplicacion(){
		// test multiplicacion
		assertTrue(cal.multiplicacion(3, 5)==15);
		assertFalse(cal.multiplicacion(2, 9)==5);
	}

@Test
		public void division(){
		// test division
		assertTrue(cal.division(6, 3)==2);
		assertFalse(cal.division(2, 9)==5);
		
		
	}
}
