package ladder;

import junit.framework.TestCase;

public class RowTest extends TestCase {
	private Row row;

	@Override
	protected void setUp() throws Exception {
		row = new Row(new NaturalNumber(3));
	}
	
	public void testStartPositionWhenOverNoOfPersons() throws Exception {
		try {
			row.drawLine(new NaturalNumber(3));
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	public void testDrawLineWhenAlreadyDrawingPoint() throws Exception {
		try {
			row.drawLine(new NaturalNumber(1));
			row.drawLine(new NaturalNumber(2));
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	public void testMarkerPosition() throws Exception {
		try {
			row.move(-1);
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	public void testMoveWhenNoLine() throws Exception {
		int target = row.move(0);
		assertEquals(0, target);

		target = row.move(2);
		assertEquals(2, target);
	}
	
	public void testMoveWhenLineLeft() throws Exception {
		// 0 1 1
		row.drawLine(new NaturalNumber(2));
		int target = row.move(2);
		assertEquals(1, target);
	}
	
	public void testMoveWhenLineRight() throws Exception {
		// 0 1 1
		row.drawLine(new NaturalNumber(2));
		
		int target = row.move(1);
		assertEquals(2, target);
	}
}
