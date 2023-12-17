package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PallindromeTest {

//	@Test
//	public void isPalidromeNagativeTest() {
//		 
//      Pallindrome number=  new Pallindrome();
//      
//      String str = "madam";
//      boolean pallidrome = number.isPallidrome(str);
//      
//      assertTrue(pallidrome);
//	}
//	
//	@Test
//	public void isPalidromeNagativepTest() {
//		 
//      Pallindrome number=  new Pallindrome();
//      
//      String str = "cds";
//      boolean pallidrome = number.isPallidrome(str);
//      
//      assertTrue(pallidrome);
//	}
	
	@ParameterizedTest
	@ValueSource(strings = {"madam", "radar", "level","nayan", "mom"})
	public void isPalidromeNagativeParaTest() {
		 
      Pallindrome number=  new Pallindrome();
      
      String str = "madam";
      boolean pallidrome = number.isPallidrome(str);
      
      assertTrue(pallidrome);
	}
	
	
	
	
	
	
	
	
	
	

}
