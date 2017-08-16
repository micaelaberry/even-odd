import static org.junit.Assert.*;

import org.junit.Test;

public class EvenOddTestTest {
	
	@Test
	public void whenNumberReturnsAsEven() {
		EvenOdd evenOdd = new EvenOdd();
		assertEquals(true, evenOdd.getTrueOrFalse());
	}

	@Test
	public void whenNumberReturnsAsOdd(){
		EvenOdd evenOdd = new EvenOdd();
		assertEquals(true, evenOdd.getTrueOrFalse());
		
	}
}
