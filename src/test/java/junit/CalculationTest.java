package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest {

	calculator c = new calculator();
	
	@Test 
	public void sumTest() {
		int testsum = c.sum(12, 23);
		int ex = 35;
		
		assertEquals(ex, testsum);
	}
	
	@Test
     public void subtractio() {
    	 int actualResult = c.sub(12, 9);
    	 int expectedResult = 3;
    	 
    	 assertEquals(expectedResult, actualResult);
     }
     @Test
     public void multiplecation() {
    	 int actualResult = c.multiplication(3, 4);
    	 
    	 int expectedResult = 12;
    	 assertEquals(expectedResult, actualResult);
     }
    @Test
     public void divisionTest() {
    	 int actualvalue =c.division(36, 6);
    	 int expextedvalue = 6;
    	 
    	 assertEquals(expextedvalue, actualvalue);
     }
}
