package ladder;

import junit.framework.TestCase;
import core.NaturalNumber;

public class LadderSizeTest extends TestCase {
	public void testGetPositionOfHeight() throws Exception {
		LadderSize size = LadderSize.create(3, 4);
		NaturalNumber actual = size.getPositionOfHeight(new NaturalNumber(5));
		assertEquals(new NaturalNumber(2), actual);
	}	
	
	public void testGetPositionOfPerson() throws Exception {
		LadderSize size = LadderSize.create(3, 4);
		NaturalNumber actual = size.getPositionOfPerson(new NaturalNumber(5));
		assertEquals(new NaturalNumber(1), actual);
	}
	
	public void testConvertTotalPositionsToPosition() throws Exception {
		LadderSize size = LadderSize.create(3, 4);
		Position actual = size.getPosition(new NaturalNumber(5));
		assertEquals(Position.create(2, 1), actual);
	}	
}
