package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	
	protected int getItemsReceived() {
		return itemsReceived;
		
	}
	protected void setItemsReceived(int itemsReceived) {
		if (itemsReceived < 0) {
			this.itemsReceived = 0;
		}
		else {
			this.itemsReceived = itemsReceived;
		}
	}
	protected float getDegreesTurned() {
		return degreesTurned;
	}
	protected void setDegreesTurned(float degreesTurned) {
		if (degreesTurned >= 0.0 && degreesTurned <= 360.0) {
			this.degreesTurned = degreesTurned;
		}
	}
	protected String getNomenclature() {
		return nomenclature;
	}
	protected void setNomenclature(String nomenclature) {
		if (nomenclature.equals("")) {
			this.nomenclature = " ";
		}
		else {
			this.nomenclature = nomenclature;
		}
	}
	protected Object getMemberObj() {
		return memberObj;
	}
	protected void setMemberObj(Object memberObj) {
		if (memberObj == " ") {
			this.memberObj = new Object();
		}
		else {
			this.memberObj = memberObj;
		}
	}
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	@Test
	public void testItemsReceived() {
		EncapsulateTheData encap = new EncapsulateTheData();
		encap.setItemsReceived(32);
		assertEquals(32, encap.getItemsReceived());
	}
	@Test
	public void testDegreesTurned() {
	EncapsulateTheData encap = new EncapsulateTheData();
		encap.setDegreesTurned(111.0f);
		
		assertEquals(111.0, encap.getDegreesTurned());
	}
	
	@Test
	public void testNomenclature() {
		EncapsulateTheData encap = new EncapsulateTheData();
		encap.setNomenclature(" ");
		assertEquals(" ", encap.getNomenclature());
	}
	@Test
	public void testMemberObj() {
		EncapsulateTheData encap = new EncapsulateTheData();
		encap.setMemberObj(777);
	assertEquals(777, encap.getMemberObj());	
	}
private	int itemsReceived; //must not be negative. All negative arguments get set to 0.
private	float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
private	String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
private	Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public static void main(String[] args) {
		
	}
}
