package junit;


public class calculator {

	public int sum(int a, int b) {
		int c = a + b;
		System.out.println("sum value is = "+c);
		return c;
	}
	
	//subtraction
	public int sub(int a, int b) {
		int c =a-b;
		System.out.println("This is Subtraction value = "+c);
		return c;
		
	}
	
	//multiplication
	
	public int multiplication(int a, int b) {
		int c = a * b;
		System.out.println("This is multiplication value ="+c);
		return c;
	}
	
	// devision
	
	public int division(int a, int b) {
		int c = a/b;
		System.out.println("The division value is  ="+c);
		return c;
	}
	
	
}
