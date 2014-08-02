package ladder;

import junit.framework.TestCase;
import core.NaturalNumber;

public class LadderSizeTest extends TestCase {
	private LadderSize size;
	
	@Override
	protected void setUp() throws Exception {
		size = LadderSize.create(3, 4);
	}

	public void testGetPositionOfHeight() throws Exception {
		NaturalNumber actual = size.getPositionOfHeight(new NaturalNumber(5));
		assertEquals(new NaturalNumber(2), actual);
	}	
	
	public void testGetPositionOfPerson() throws Exception {
		NaturalNumber actual = size.getPositionOfPerson(new NaturalNumber(5));
		assertEquals(new NaturalNumber(1), actual);
	}
	
	public void testConvertTotalPositionsToPosition() throws Exception {
		Position actual = size.getPosition(new NaturalNumber(5));
		assertEquals(Position.create(2, 1), actual);
	}
	
	public void testIsMultipleOfPerson() throws Exception {
		assertTrue(size.isMultipleOfPerson(new NaturalNumber(8)));
		assertFalse(size.isMultipleOfPerson(new NaturalNumber(7)));
	}
}
