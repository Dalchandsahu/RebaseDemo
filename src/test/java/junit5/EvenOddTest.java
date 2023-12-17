package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class EvenOddTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/text1.csv",numLinesToSkip = 1)
	public void evenoddTest(String input, String Expected) {
		
		EvenOdd evenOdd = new EvenOdd();
		String actualResult = evenOdd.evenOddNum(Integer.parseInt(input));
		
		assertEquals(Expected, actualResult);
	}

}
