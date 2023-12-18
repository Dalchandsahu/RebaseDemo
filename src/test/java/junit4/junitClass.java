package junit4;

import org.junit.Test;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class junitClass {

	stringCheck stringCheck = new stringCheck();
	
   
	@Test
	public void lengthOfString() {
		
		int actualResult = stringCheck.lengthOfString("dalchand");
		int expected = 8;
		assertEquals(expected, actualResult);
		
	}
	
	 @Test(expected = NullPointerException.class)
	    public void stringLengthExceptionTest() {
	    	// assuming YourClass is the class containing lengthOfString method
	       
	    	String str = null;
	        stringCheck.lengthOfString(str);
	    }

	 @Test
	 public void divisionOpePositiveTest() {
		int actualResult= stringCheck.divisionOpe(10, 2);
		
		int expectedResult = 5;
		
		assertEquals(expectedResult, actualResult);
	 }
	 
	 @Test(expected = ArithmeticException.class)
	 public void divisionOpeExceptionTest() {
		 stringCheck.divisionOpe(10, 0);
			
	 }
//This is conflict of rebase
	 
	


}
