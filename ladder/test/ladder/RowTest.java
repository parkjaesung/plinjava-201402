package ladder;

import junit.framework.TestCase;

public class RowTest extends TestCase {
	public void testNoOfPersons() throws Exception {
		try {
			new Row(0);
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	public void testStartPositionWhenMinus() throws Exception {
		try {
			Row row = new Row(3);
			row.drawLine(-1);
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	public void testStartPositionWhenOverNoOfPersons() throws Exception {
		try {
			Row row = new Row(3);
			row.drawLine(2);
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	public void testDrawLineWhenAlreadyDrawingPoint() throws Exception {
		try {
			Row row = new Row(3);
			row.drawLine(0);
			row.drawLine(1);
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	public void testMarkerPosition() throws Exception {
		try {
			Row row =new Row(3);
			row.move(-1);
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	public void testMoveWhenNoLine() throws Exception {
		Row row = new Row(3);
		int target = row.move(0);
		assertEquals(0, target);

		target = row.move(2);
		assertEquals(2, target);
	}
	
	public void testMoveWhenLineLeft() throws Exception {
		// 0 1 1
		Row row = new Row(3);
		row.drawLine(1);
		int target = row.move(2);
		assertEquals(1, target);
	}
	
	public void testMoveWhenLineRight() throws Exception {
		// 0 1 1
		Row row = new Row(3);
		row.drawLine(1);
		
		int target = row.move(1);
		assertEquals(2, target);
	}
}
