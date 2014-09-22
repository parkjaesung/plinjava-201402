package core;

import junit.framework.TestCase;

public class NaturalNumberTest extends TestCase {
	public void testCreate() throws Exception {
		NaturalNumber number = new NaturalNumber(1);
		assertEquals(1, number.getNumber());
	}
	
	public void testCreateWhenUnderZero() throws Exception {
		try {
			new NaturalNumber(0);
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	public void testToArrayIndex() throws Exception {
		NaturalNumber number = new NaturalNumber(3);
		assertEquals(2, number.toArrayIndex());
	}
	
	public void testCreateFromArrayIndex() throws Exception {
		NaturalNumber actual = NaturalNumber.createFromArrayIndex(1);
		assertEquals(new NaturalNumber(2), actual);
	}
	
	public void testMultiply() throws Exception {
		NaturalNumber number = new NaturalNumber(3);
		NaturalNumber actual = number.multiply(new NaturalNumber(4));
		assertEquals(new NaturalNumber(12), actual);
	}
	
	public void testIsFirst() throws Exception {
		NaturalNumber number = new NaturalNumber(1);
		assertTrue(number.isFirst());
		
		number = new NaturalNumber(2);
		assertFalse(number.isFirst());
	}
}
