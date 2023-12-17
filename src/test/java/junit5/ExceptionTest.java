package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionTest {

	Exception exception = new Exception();
	
	@Test
	public void lengthOfStringTest() {
		
		String str = null;
		assertThrows(NullPointerException.class, ()-> exception.lengthOfString(str));
	}
	@Test
	public void arithmaticException() {
		
		assertThrows(ArithmeticException.class, ()-> exception.arithmaticException(10, 0));
	}

}
