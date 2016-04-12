package U.eclemma;



import static org.junit.Assert.*;

import org.junit.Test;

public class test {
@Test

	public void sumarNum(){
		/*Suma sumar = new Suma();
		assertTrue(sumar.sumar(1, 0)==1);*/
		calculadora cal = new calculadora();

		// test suma
		assertTrue(cal.suma(3, 5)==8);
		assertFalse(cal.suma(2, 9)==5);
		
		// test resta
		assertTrue(cal.resta(3, 5)==2);
		assertFalse(cal.resta(2, 9)==5);
		
		
		
	}
}
