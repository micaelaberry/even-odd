import static org.junit.Assert.*;

import org.junit.Test;

public class EvenOddTestTest {

	EvenOdd evenOdd = new EvenOdd();
	
	@Test
	public void whenNumberReturnsAsEven() {
		assertEquals(true, evenOdd.getTrueOrFalse());
	}

}
