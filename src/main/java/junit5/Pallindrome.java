package junit5;

public class Pallindrome {

	public boolean isPallidrome(String str) {
		
		String rev = "";
		int  length = str.length();
		
		for(int i= length-1; i>=0; i--) {
			
			rev =rev+str.charAt(i);
			
		}
		if(str.equals(rev)) {
			return true;
					
		}else {
			return false;
		}
		
		
		
		
	}
}
