package ladder;

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
}
