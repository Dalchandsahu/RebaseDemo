package test;

public class petanimal extends animal {
	private int aNo;
	private String aName;
	public petanimal(int aNo, String aName, int aNo2, String aName2) {
		super(aNo, aName);
		aNo = aNo2;
		aName = aName2;
	}
	
}
