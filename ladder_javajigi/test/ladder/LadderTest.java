package ladder;

import junit.framework.TestCase;

public class LadderTest extends TestCase {
	public void testRunWhenMultiRows() throws Exception {
		// 1 1 0 0
		// 0 1 1 0
		// 0 0 1 1

		Ladder ladder = new Ladder(3, 4);
		ladder.drawLine(0, 0);
		ladder.drawLine(1, 1);
		ladder.drawLine(2, 2);

		assertEquals(3, ladder.run(0));
		assertEquals(0, ladder.run(1));
		assertEquals(1, ladder.run(2));
		assertEquals(2, ladder.run(3));
	}

	public void testDrawLineWhenUnderNoOfRows() throws Exception {
		try {
			Ladder ladder = new Ladder(3, 4);
			ladder.drawLine(-1, 3);
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	public void testDrawLineWhenOverNoOfRows() throws Exception {
		try {
			Ladder ladder = new Ladder(3, 4);
			ladder.drawLine(3, 3);
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
}
